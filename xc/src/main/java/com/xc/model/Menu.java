package com.xc.model;

import java.util.List;

public class Menu {
	
	private Integer id;
	
	private String menuId;
	
	private String menuName;
	
	private String parentId;
	
	private String router;
	
	private List<Menu> children;

	public String getRouter() {
		return router;
	}

	public void setRouter(String router) {
		this.router = router;
	}

	public List<Menu> getChildren() {
		return children;
	}

	public void setChildren(List<Menu> children) {
		this.children = children;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMenuId() {
		return menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

}
