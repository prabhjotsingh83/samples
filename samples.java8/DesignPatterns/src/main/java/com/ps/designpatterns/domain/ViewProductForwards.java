package com.ps.designpatterns.domain;

public class ViewProductForwards extends ViewProducts {

	@Override
	public void createProductViewModel() {
		vwList.add(new ViewForwards());
		
	}

}
