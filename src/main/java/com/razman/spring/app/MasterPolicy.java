package com.razman.spring.app;

public class MasterPolicy {
	
	private boolean masterPolInd;
	private String masterPolNo;
	private String masterPolCommDate;
	
	public MasterPolicy(boolean masterPolInd, String masterPolNo, String masterPolCommDate) {
		super();
		this.masterPolInd = masterPolInd;
		this.masterPolNo = masterPolNo;
		this.masterPolCommDate = masterPolCommDate;
	}
	public boolean isMasterPolInd() {
		return masterPolInd;
	}
	public void setMasterPolInd(boolean masterPolInd) {
		this.masterPolInd = masterPolInd;
	}
	public String getMasterPolNo() {
		return masterPolNo;
	}
	public void setMasterPolNo(String masterPolNo) {
		this.masterPolNo = masterPolNo;
	}
	public String getMasterPolCommDate() {
		return masterPolCommDate;
	}
	public void setMasterPolCommDate(String masterPolCommDate) {
		this.masterPolCommDate = masterPolCommDate;
	}
}
