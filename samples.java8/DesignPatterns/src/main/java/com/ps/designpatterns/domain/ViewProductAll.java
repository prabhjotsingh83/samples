package com.ps.designpatterns.domain;

public class ViewProductAll extends ViewProducts {

	@Override
	public void createProductViewModel() {
		vwList.add(new ViewSwaps());
		vwList.add(new ViewForwards());
		
	}

	@Override
	public String toString() {
		return "ViewProductAll []"+vwList;
	}

}
