package com.diviso.servease.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.diviso.servease.stock.entities.AttributeValue;
import com.diviso.servease.stock.repositaries.AttributeValueRepo;

@RestController
@RequestMapping("/stock/attributevalue")
public class AttributeValueRestController {
	
	@Autowired
	private AttributeValueRepo attributeValueRepo;
	
	@RequestMapping("/save")
	public AttributeValue save(AttributeValue attributeValue){
		
		return attributeValueRepo.save(attributeValue);
	}
	
	@RequestMapping("/delete")
	public String delete(int id){
		
		attributeValueRepo.delete(id);
		
		return "Record is deleted...";
	}
	
	@RequestMapping("/update")
	public AttributeValue update(AttributeValue attributeValue){
		
		return attributeValueRepo.save(attributeValue);
	}
	
	@RequestMapping("/findOne")
	public AttributeValue findOne(int id) {
		

		return attributeValueRepo.findOne(id);
	}

}
