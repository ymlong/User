package com.xc.model;

public class Post {
	
	private int id;
	
	private Integer postId;
	
	private String postName;

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Post [postId=" + postId + ", postName=" + postName + "]";
	}
	
	

}
