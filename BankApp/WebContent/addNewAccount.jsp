<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	.option{
		display: none;
	}
</style>
<script>
	
	function checkAccountType(accountTypeShow) {

		if (accountTypeShow.value == "Savings Account") {
			document.getElementById("salary").style.display = "block";
			document.getElementById("odlimit").style.display = "none";
			document.getElementById("currentsalary").style.display = "none";
			document.getElementById("nonsalary").style.display = "none";
			document.getElementById("radioOp").style.display = "block";
		} 
		else if (accountTypeShow.value == "Current Account") {
			document.getElementById("odlimit").style.display = "block";
			document.getElementById("currentsalary").style.display = "block";
			document.getElementById("salary").style.display = "none";
			document.getElementById("nonsalary").style.display = "none";
			document.getElementById("radioOp").style.display = "none";
		}
	}

	function checksalariedType(SalaryTypeShow) {
		if (SalaryTypeShow.value == "salaried")
			document.getElementById("nonsalary").style.display = "none";
		else if (SalaryTypeShow.value == "ntSalaried")
			document.getElemetById("nonsalary").style.display = "block";
	}

	function checkAge(dt) {
		age = Date.now() - (new Date(dt.value)).getTime();
		ageDt = new Date(age);
		if (Math.abs(ageDt.getUTCFullYear() - 1970) < 18) {
			alert("Minimum Age Should be 18");
			dt.value = 0;
		}
	}
</script>
</head>
<body>
	<div align="center">
		<table>
			<tr>
				<td>Account Holder Name</td>
				<td><input type="text" name="accName"></td>
			</tr>
			<tr>
				<td>Customer Email ID</td>
				<td><input type="email" name="accMail"></td>
			</tr>
			<tr>
				<td>Customer Date of Birth</td>
				<td><input type="date" name="accDob" onclick="checkAge(this)"></td>
			</tr>
			<tr>
				<td>Customer Phone Number</td>
				<td><input type="text" name="accPhn" pattern="[9-6][0-9]{9}" ></td>
			</tr>
			<tr>
				<td>Account Type</td>
				<td>
					<select name="accType" onchange="checkAccountType(this)">
						<option value="Savings Account">Savings Account</option>
						<option value="Current Account">Current Account</option>
					</select>
				</td>
			</tr>
			
			<tr id="radioOp">
				<td>
					<input type="radio" value="Salaried" name="sal" id="sal" onclick="checksalariedType(this)">Salaried
					<input type="radio" value="NotSalaried" name="sal" id="sal" onclick="checksalariedType(this)">Not Salaried
				</td>
			</tr>
			<tr>
				<td>
					<input type="number" name="salary" id="salary" min="0" placeholder="salary" class="option">
					<input type="number" name="nonsalary" id="nonsalary" min="5000" placeholder="nonsalary" class="option">
					<input type="number" name="currentsalary" id="currentsalary" min="10000" placeholder="currentsalary" class="option">
					<input type="number" name="odlimit" id="odlimit" placeholder="odlimit" class="option">
				</td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="Submit"></td>
				<td><input type="reset" value="Clear"></td>
			</tr>
		</table>
	</div>
</body>
</html>