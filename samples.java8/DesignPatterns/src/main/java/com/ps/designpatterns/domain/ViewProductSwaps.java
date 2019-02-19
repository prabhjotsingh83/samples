package com.ps.designpatterns.domain;

public class ViewProductSwaps extends ViewProducts {

	@Override
	public void createProductViewModel() {
		vwList.add(new ViewSwaps());

	}

}
