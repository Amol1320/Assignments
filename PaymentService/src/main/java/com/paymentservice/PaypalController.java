package com.paymentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaypalController {

	
	@Autowired
	private PaypalService paypalservice;
	
	@GetMapping("/")
	public String Home() {
		return "Home";
	}
}
