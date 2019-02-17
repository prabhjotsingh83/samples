package com.ps.designpatterns.main;

import com.ps.designpatterns.domain.RiskFactor;

public class BuilderMain {

	public static void main(String[] args) {
		//Limit With logic
		RiskFactor.BuilderWithLogic builder = new RiskFactor.BuilderWithLogic();
		
		builder.limitId(1).description("Net FXDL").limitType(0).upperLimitValue(10).lowerLimitValue(-10).units("$MM").logicId(1);
		
		RiskFactor rf1 = builder.build();
		
		System.out.println(rf1);

		//Limit With logic
		RiskFactor.BuilderWithoutLogic builder2 = new RiskFactor.BuilderWithoutLogic();
		
		builder2.limitId(2).description("Net FXDL").limitType(0).upperLimitValue(10).lowerLimitValue(-10).units("$MM");
		
		RiskFactor rf2 = builder2.build();
		
		System.out.println(rf2);

	}

}
