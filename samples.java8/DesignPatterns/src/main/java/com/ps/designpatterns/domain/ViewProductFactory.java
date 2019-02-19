package com.ps.designpatterns.domain;

import com.ps.designpatterns.enums.ProductType;

public class ViewProductFactory {

	public static ViewProducts getViewModel(ProductType productType) {
		switch (productType) {
		case FORWARD:
			return new ViewProductForwards();
		case SWAP:
			return new ViewProductSwaps();
		default:
			return new ViewProductAll();
		}
	}
}
