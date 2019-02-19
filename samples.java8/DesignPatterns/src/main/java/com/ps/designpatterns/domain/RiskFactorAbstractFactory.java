package com.ps.designpatterns.domain;

import com.ps.designpatterns.enums.ProductInstrument;
import com.ps.designpatterns.enums.RiskFactorType;

public abstract class RiskFactorAbstractFactory {
	public static  RiskFactorAbstractFactory getRiskFactorFactory(ProductInstrument pi) {
		switch(pi) {
		case FX:
			return new RiskFactoryFXDLFactory();
		case COMMODITY:	
			return new RiskFactoryCMDLFactory();
		}
		return null;
	}

	public abstract RiskFactoryModel getRiskFactorModel(RiskFactorType rft) ;

	public abstract RFValidationRules getValidationRules(RiskFactorType rft) ;
	
}
