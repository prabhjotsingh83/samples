package com.ps.designpatterns.domain;

import java.util.List;

import com.ps.designpatterns.domain.Product;

public class ProductList implements Cloneable {

	private String sql;
	
	private List<String> attributes;
	private Product record;

	public ProductList(String sql, List<String> attributes, Product record) {
		this.sql = sql;
		this.attributes =attributes;
		this.record = record;
		
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();			
	}
	
	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public List<String> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<String> attributes) {
		this.attributes = attributes;
	}

	public Product getRecord() {
		return record;
	}

	public void setRecord(Product record) {
		this.record = record;
	}

	
}
