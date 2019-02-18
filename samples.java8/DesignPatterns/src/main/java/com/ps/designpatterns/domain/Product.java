package com.ps.designpatterns.domain;

public class Product implements Cloneable {

	public Object clone() throws CloneNotSupportedException{
		return super.clone();			
	}
	
	
	private String productCode;
	private String productCategory;
	private String description;
	
	public void setProductCode(String productCode) {
		this.productCode = productCode;
		
	}
	
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	
	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", productCategory=" + productCategory + ", description="
				+ description + "]";
	}

	public void setDescription(String description) {
		this.description=description;
		
	}	
	
}
