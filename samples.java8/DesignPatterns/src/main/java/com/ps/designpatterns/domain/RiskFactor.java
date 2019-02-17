package com.ps.designpatterns.domain;


public class RiskFactor {
	

	private final Integer limitId;
	private final String description;
	private final String units;
	private final Integer upperLimitValue;
	private final Integer lowerLimitValue;
	private final Integer logicId;
	private final Integer limitType;
	
	public RiskFactor(BuilderWithLogic builder) {
		this.limitId = builder.limitId;
		this.description = builder.description;
		this.units = builder.units;
		this.upperLimitValue = builder.upperLimitValue;
		this.lowerLimitValue = builder.lowerLimitValue;
		this.logicId = builder.logicId;
		this.limitType = builder.limitType;
	}

	public RiskFactor(BuilderWithoutLogic builder) {
		this.limitId = builder.limitId;
		this.description = builder.description;
		this.units = builder.units;
		this.upperLimitValue = builder.upperLimitValue;
		this.lowerLimitValue = builder.lowerLimitValue;
		//this.logicId = builder.logicId; There will not be logic without 
		if(null ==  builder.logicId) {
			this.logicId = null;
		} else {
			throw new RuntimeException("Limit Without logic cannot have logic");
		} 
		this.limitType = builder.limitType;
	}

	
	public static class BuilderWithLogic {
		private Integer limitId;
		private String description;
		private String units;
		private Integer upperLimitValue;
		private Integer lowerLimitValue;
		private Integer logicId;
		private Integer limitType;
		
		public BuilderWithLogic() {
			
		}
		
		public BuilderWithLogic limitId(Integer limitId) {
			this.limitId =limitId;
			return this;
		}
		
		public BuilderWithLogic description(String description) {
			this.description =description;
			return this;
		}
		
		public BuilderWithLogic units(String units) {
			this.units =units;
			return this;
		}
		
		public BuilderWithLogic upperLimitValue(Integer upperLimitValue) {
			this.upperLimitValue =upperLimitValue;
			return this;
		}
		
		public BuilderWithLogic lowerLimitValue(Integer lowerLimitValue) {
			this.lowerLimitValue =lowerLimitValue;
			return this;
		}
		

		public BuilderWithLogic logicId(Integer logicId) {
			this.logicId =logicId;
			return this;
		}
		
		public BuilderWithLogic limitType(Integer limitType) {
			this.limitType =limitType;
			return this;
		}
		
		public RiskFactor build () {
			return new RiskFactor(this);
		}
	
	}

	public static class BuilderWithoutLogic {
		private Integer limitId;
		private String description;
		private String units;
		private Integer upperLimitValue;
		private Integer lowerLimitValue;
		private Integer logicId;
		private Integer limitType;
		
		public BuilderWithoutLogic() {
			
		}
		
		public BuilderWithoutLogic limitId(Integer limitId) {
			this.limitId =limitId;
			return this;
		}
		
		public BuilderWithoutLogic description(String description) {
			this.description =description;
			return this;
		}
		
		public BuilderWithoutLogic units(String units) {
			this.units =units;
			return this;
		}
		
		public BuilderWithoutLogic upperLimitValue(Integer upperLimitValue) {
			this.upperLimitValue =upperLimitValue;
			return this;
		}
		
		public BuilderWithoutLogic lowerLimitValue(Integer lowerLimitValue) {
			this.lowerLimitValue =lowerLimitValue;
			return this;
		}
		

		public BuilderWithoutLogic logicId(Integer logicId) {
			this.logicId =logicId;
			return this;
		}
		
		public BuilderWithoutLogic limitType(Integer limitType) {
			this.limitType =limitType;
			return this;
		}
		
		public RiskFactor build () {
			return new RiskFactor(this);
		}
	
	}
	
	public Integer getLimitId() {
		return limitId;
	}

	public String getDescription() {
		return description;
	}

	public String getUnits() {
		return units;
	}

	public Integer getUpperLimitValue() {
		return upperLimitValue;
	}

	public Integer getLowerLimitValue() {
		return lowerLimitValue;
	}

	public Integer getLogicId() {
		return logicId;
	}

	public Integer getLimitType() {
		return limitType;
	}


	@Override
	public String toString() {
		return "RiskFactor [limitId=" + limitId + ", description=" + description + ", units=" + units
				+ ", upperLimitValue=" + upperLimitValue + ", lowerLimitValue=" + lowerLimitValue + ", logicId="
				+ logicId + ", limitType=" + limitType + "]";
	}

}
