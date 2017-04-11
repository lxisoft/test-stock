package com.diviso.servease.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.servease.stock.entities.AttributeSets;
import com.diviso.servease.stock.repositaries.AttributeSetRepo;

@RestController
@RequestMapping("/stock/attributeset")
public class AttributeSetRestController {
	
	@Autowired
	private AttributeSetRepo attributeSetRepo;
	
	@RequestMapping("/save")
	public AttributeSets save(AttributeSets attributeSets){
		
		
		return attributeSetRepo.save(attributeSets);
	}
	
	@RequestMapping("/delete")
	public String delete(int id){
		
		attributeSetRepo.delete(id);
		return "Record is deleted...";
	}
	
	@RequestMapping("/update")
	public AttributeSets update(AttributeSets attributeSets){
		
		return attributeSetRepo.save(attributeSets);
	}
	
	@RequestMapping("/findone")
	public AttributeSets findOne(int id){
		
		return attributeSetRepo.findOne(id);
	}
	

}
