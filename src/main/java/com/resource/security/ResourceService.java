package com.resource.security;

import org.springframework.stereotype.Service;

import com.resource.pojo.ResourcePojo;
@Service

public class ResourceService {
	
	
	public  ResourcePojo input() {
		ResourcePojo pj = new ResourcePojo();
		pj.setId(101);
		pj.setName("Inside hall");
		pj.setCategory("First fall");
		pj.setManufacturer("Snow Indeed");
		return pj;
		
	}

}
