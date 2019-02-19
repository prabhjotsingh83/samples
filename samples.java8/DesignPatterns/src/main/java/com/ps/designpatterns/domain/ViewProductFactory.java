package com.ps.designpatterns.domain;

public class ViewProductFactory {

	public static ViewProducts getViewModel(String productType) {
		switch (productType) {
		case "FORWARD":
			return new ViewProductForwards();
		case "SWAP":
			return new ViewProductSwaps();
		default:
			return new ViewProductAll();
		}
	}
}
