package com.xc.model;

import java.util.List;

public class Role {
	
	private int id;
	
	private Integer roleId;
	
	private String roleName;
	
	private Integer parentId;
	
	private List<Role> children;

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public List<Role> getChildren() {
		return children;
	}

	public void setChildren(List<Role> children) {
		this.children = children;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + "]";
	}

	
	

}
