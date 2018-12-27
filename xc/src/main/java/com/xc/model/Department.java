package com.xc.model;

import java.util.List;

public class Department {
	
	private int id;
	
	private Integer departId;
	
	private String departName;
	
	private Integer partId;
	
	private List<Department> children;
	 
	public List<Department> getChildren() {
		return children;
	}

	public void setChildren(List<Department> children) {
		this.children = children;
	}

	public Integer getPartId() {
		return partId;
	}

	public void setPartId(Integer partId) {
		this.partId = partId;
	}

	public Integer getDepartId() {
		return departId;
	}

	public void setDepartId(Integer departId) {
		this.departId = departId;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "department [departId=" + departId + ", departName=" + departName + "]";
	}
	
	

}
