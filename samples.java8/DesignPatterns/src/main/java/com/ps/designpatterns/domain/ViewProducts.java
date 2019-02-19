package com.ps.designpatterns.domain;

import java.util.ArrayList;
import java.util.List;

public abstract class ViewProducts {

	protected List<View> vwList = new ArrayList<View>();

	public ViewProducts( ) {
		this.createProductViewModel();
	}

	public abstract void createProductViewModel() ;
	
	public List<View> getVwList() {
		return vwList;
	}

	public void setVwList(List<View> vwList) {
		this.vwList = vwList;
	}
}
