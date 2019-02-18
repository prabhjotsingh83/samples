package com.ps.designpatterns.domain;

import java.util.HashMap;
import java.util.Map;

public class ProductRegistry {
	
	private Map<String, Product> catalogue = new HashMap<String, Product>();
	
	public ProductRegistry() {
		loadItems();
	}

	
	public Product createItem(String type) {
		Product prod = null;
		
		try {
			prod = (Product)(catalogue.get(type)).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return prod;
	}
	
	private void loadItems() {
		Product swaps = new Product();
		swaps.setProductCode("SWAPS123");
		swaps.setProductCategory("SWAPS");
		swaps.setDescription("Swap Product Description");
		catalogue.put("SWAPS",swaps);
		
		Product fxForward = new Product();
		fxForward.setProductCode("FORWARD123");
		fxForward.setProductCategory("FORWARD");
		swaps.setDescription("Forward Product Description");
		catalogue.put("FORWARD",fxForward);
		
	}

}
