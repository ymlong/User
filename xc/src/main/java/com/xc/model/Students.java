package com.xc.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Students {
	
	private int id;
	
	private String userId;
	
	private String username;
	
	private String password;
	
	private String phone;
	
	private String mail;
	
	private String gender;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date birth;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date time;
	
	private String state;
	
	private String level;
	
	private Integer salary;
	
	private Integer departId;
	
	private String parentId;
	
	private Integer roleId;
	
	private Integer postId;
	
	private Integer companyId;
	
	private Company company;
	
	private Post post;
	
	private Role role;
	
	private Department department;
	

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Integer getDepartId() {
		return departId;
	}

	public void setDepartId(Integer departId) {
		this.departId = departId;
	}


	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", userId=" + userId + ", username=" + username + ", password=" + password
				+ ", phone=" + phone + ", mail=" + mail + ", gender=" + gender + ", birth=" + birth + ", time=" + time
				+ ", state=" + state + ", level=" + level + ", salary=" + salary + ", departId=" + departId
				+ ", parentId=" + parentId + ", roleId=" + roleId + ", postId=" + postId + ", companyId=" + companyId
				+ ", company=" + company + ", post=" + post + ", role=" + role + ", department=" + department + "]";
	}
	

}
