package com.resource.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class Rentcontroller {
	
	@RequestMapping(value= "inside", method= RequestMethod.GET )
	public String terming() {
		System.out.println(" it will print");
		
		return "insidestory";
	}
	

}
