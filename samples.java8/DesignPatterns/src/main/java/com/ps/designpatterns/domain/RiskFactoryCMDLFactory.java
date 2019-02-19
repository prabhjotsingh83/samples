package com.ps.designpatterns.domain;

import com.ps.designpatterns.domain.validator.RFFXDLValidationRule;
import com.ps.designpatterns.enums.RiskFactorType;

public class RiskFactoryCMDLFactory extends RiskFactorAbstractFactory {

	@Override
	public RiskFactoryModel getRiskFactorModel(RiskFactorType rft) {
		return new RiskFactoryCMDLModel();
	}

	@Override
	public RFValidationRules getValidationRules(RiskFactorType rft) {
		return new RFCMDLValidationRule();
	}

}
