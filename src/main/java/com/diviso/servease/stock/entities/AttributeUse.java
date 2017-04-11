package com.diviso.servease.stock.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AttributeUse {
	
	@Id
	@GeneratedValue
	private int id;
	@ManyToOne
	private Attribute attribute;
	@ManyToOne
	private AttributeSets attributeSet;
	private int lineNo;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Attribute getAttribute() {
		return attribute;
	}
	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}
	
	public AttributeSets getAttributeSet() {
		return attributeSet;
	}
	public void setAttributeSet(AttributeSets attributeSet) {
		this.attributeSet = attributeSet;
	}
	public int getLineNo() {
		return lineNo;
	}
	public void setLineNo(int lineNo) {
		this.lineNo = lineNo;
	}

}
