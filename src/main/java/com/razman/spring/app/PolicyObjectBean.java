package com.razman.spring.app;

public class PolicyObjectBean {
	
	private String policyNo;
	private String quotationNo;
	private MasterPolicy masterPolicy;
	
	public PolicyObjectBean(String policyNo, String quotationNo, MasterPolicy masterPolicy) {
		super();
		this.policyNo = policyNo;
		this.quotationNo = quotationNo;
		this.masterPolicy = masterPolicy;
	}
	
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getQuotationNo() {
		return quotationNo;
	}
	public void setQuotationNo(String quotationNo) {
		this.quotationNo = quotationNo;
	}
	public MasterPolicy getMasterPolicy() {
		return masterPolicy;
	}
	public void setMasterPolicy(MasterPolicy masterPolicy) {
		this.masterPolicy = masterPolicy;
	}
	

}
