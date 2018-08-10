<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script">
	function checkAccountType(accountTypeShow){
		
		if(accountTypeShow.value == "Savings Account"){
			document.getElementById("salaried").style.display = "block";
			document.getElementById("overDraft").style.display = "none";
			document.getElementById("curBalance").style.display = "none";
			document.getElementById("svNtSlBalnc").style.display = "none";
		}
		else if(accountTypeShow.value == "Current Account"){
			document.getElementById("overDraft").style.display = "block";
			document.getElementById("curBalance").style.display = "block";
			document.getElementById("salaried").style.display = "none";
			document.getElementById("svNtSlBalnc").style.display = "none";
		}
	}
	
	function checksalariedType(SalaryTypeShow){
		if(SalaryTypeShow.value == "salaried")
			document.getElementById("svNtSlBalnc").style.display = "none";
		else if(SalaryTypeShow.value == "ntSalaried")
			document.getElemetById("svNtSlBalnc").style.display = "block";
	}
	
	function checkAge(dt){
		age = Date.now()-(new Date(dt.value)).getTime();
		ageDt = new Date(age);
		if(Math.abs(ageDt.getUTCFullYear()-1970)<18){
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
						<option value="Not savings">Not savings Account</option>
						<option value="Current Account">Current Account</option>
					</select>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>