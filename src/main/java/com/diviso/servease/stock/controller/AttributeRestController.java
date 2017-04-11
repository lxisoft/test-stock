package com.diviso.servease.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.servease.stock.entities.Attribute;
import com.diviso.servease.stock.repositaries.AttributeRepo;

@RestController
@RequestMapping("/stock/attribute")
public class AttributeRestController {
	
	@Autowired
	private AttributeRepo attributeRepo;
	
	@RequestMapping("/save")
	public Attribute save(Attribute attribute){
		
		return attributeRepo.save(attribute);
	}
	
	@RequestMapping("/delete")
	public String delete(int id){
		
		attributeRepo.delete(id);
		return "Record is deleted...";
	}
	
	@RequestMapping("/update")
	public Attribute update(Attribute attribute){
		
		return attributeRepo.save(attribute);
	}
	
	@RequestMapping("/findone")
	public Attribute findOne(int id){
		
		return attributeRepo.findOne(id);
	}

}
