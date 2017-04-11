package com.diviso.servease.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.servease.stock.entities.AttributeUse;
import com.diviso.servease.stock.repositaries.AttributeUseRepo;

@RestController
@RequestMapping("/stock/attributeuse")
public class AttributeUseRetController {
	@Autowired
	private AttributeUseRepo attributeUseRepo;
	
	@RequestMapping("/save")
	public AttributeUse save(AttributeUse attributeUse){
		
		return attributeUseRepo.save(attributeUse);
	}
	
	@RequestMapping("/delete")
	public String  delete(int id){
		
		attributeUseRepo.delete(id);
		
		return "Record is deleted...";
	}
	
	@RequestMapping("/update")
	public AttributeUse update(AttributeUse attributeValue){
		
		return attributeUseRepo.save(attributeValue);
	}
	
	@RequestMapping("/findOne")
	public AttributeUse findOne(int id) {
		

		return attributeUseRepo.findOne(id);
	}
	
	

}
