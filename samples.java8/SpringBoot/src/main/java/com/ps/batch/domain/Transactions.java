package com.ps.batch.domain;

public class Transactions {

	String transactionId ;
	String traderId ;
	String systemName ;
	String region ;
	String productName ;
	String curr1 ;
	String curr2 ;
	Integer notional ;
	
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getTraderId() {
		return traderId;
	}
	public void setTraderId(String traderId) {
		this.traderId = traderId;
	}
	public String getSystemName() {
		return systemName;
	}
	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCurr1() {
		return curr1;
	}
	public void setCurr1(String curr1) {
		this.curr1 = curr1;
	}
	public String getCurr2() {
		return curr2;
	}
	public void setCurr2(String curr2) {
		this.curr2 = curr2;
	}
	public Integer getNotional() {
		return notional;
	}
	public void setNotional(Integer notional) {
		this.notional = notional;
	}

	
}
