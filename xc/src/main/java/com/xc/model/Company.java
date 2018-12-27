package com.xc.model;

public class Company {
	
	private int id;
	
	private Integer companyId;
	
	private String companyName;

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}


	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", company=" + companyName + "]";
	}

	
	
	

}
