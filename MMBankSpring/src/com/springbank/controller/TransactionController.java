package com.springbank.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.moneymoney.framework.service.BankAccountService;

@Controller
public class TransactionController {
	
	BankAccountService service;
	
	@RequestMapping("withdrawl")
	public String withdraw(Model model) {
		return "withdrawl";
	}
	
	@RequestMapping("deposit")
	public String deposit(Model model) {
		return "deposit";
	}
	
	@RequestMapping("/withdraw")
	public String withdraw(@RequestParam("accountNo") String accountNo, @RequestParam("amount") String amount, Model model) {
		if (service.withdraw(Integer.parseInt(accountNo), Double.parseDouble(amount)) == -1) {
			model.addAttribute("message", "Transaction Unsuccessful due to insufficient funds");
			return "messagePage";

		} else {
			double amt = Double.parseDouble(amount);
			Map<Integer, Integer> denomination = new HashMap<>();
			int ar[] = { 2000, 500, 200, 100, 50, 20, 5, 2, 1 };
			int i = 0;
			for (i = 0; i < 9; i++)
				denomination.put(ar[i], 0);
			for (i = 0; i < 9; i++) {
				denomination.put(ar[i], (int) amt / ar[i]);
				amt = amt % ar[i];
			}

			int totalNotes = 0;
			for (i = 0; i < 9; i++)
				totalNotes += denomination.get(ar[i]);

			String message = "Transaction Successful. Total no. of notes: " + totalNotes;
			for (i = 0; i < 9; i++) {
				if (denomination.get(ar[i]) > 0)
					message = message + "Denomination " + ar[i] + " : " + denomination.get(ar[i]);
			}
			model.addAttribute("message", message);

			return "messagePage";
		}
	}
	
	@RequestMapping("doDeposit")
	public String doDeposit(@RequestParam("accountNo") String accountNo, @RequestParam("amount") String amount, Model model) {
		
		service.getAccountById(Integer.parseInt(accountNo)).deposit(Double.parseDouble(amount));
		
		String message = "Transaction Successful. Balance after Deposit : Rs "
				+ service.getCurrrentBalance(service.getAccountById(Integer.parseInt(accountNo)));
		
		model.addAttribute("message", message);
		
		return "messagePage";
	}
	
	@RequestMapping("/fundTransfer")
	public String fundTransfer(@RequestParam("senderAccountNo") String senderAccountNo, @RequestParam("recieverAccountNo") String recieverAccountNo, @RequestParam("amount") String amount, Model model) {
		
		return "fundTransfer";
	}

}
