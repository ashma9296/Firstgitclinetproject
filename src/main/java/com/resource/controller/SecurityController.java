package com.resource.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.resource.pojo.ResourcePojo;
import com.resource.security.ResourceService;


@Controller

public class SecurityController {
	private ResourceService resourceservice;
	

	public ResourceService getResourceservice() {
		return resourceservice;
	}


	public void setResourceservice(ResourceService resourceservice) {
		this.resourceservice = resourceservice;
	}



		
		@RequestMapping(value = "ashma", method = RequestMethod.GET)
		public ModelAndView showProductPage() {
			ResourcePojo  rp = new ResourcePojo();
			
			ModelAndView mv = new ModelAndView("doform");
			mv.addObject("productObj", rp);
			return mv; }
		
		@RequestMapping(value = "result", method = RequestMethod.POST)
		public ModelAndView saveProduct(ResourcePojo rps) {
			System.out.println("i am receiving product from user");
			System.out.println(rps.toString());
			
			ModelAndView mv = new ModelAndView("mine");
			mv.addObject("pt", rps);
			return mv;
		}
			
	
	
	

}
