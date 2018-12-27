package com.xc.service;

import com.xc.util.Page;

import java.util.List;

import com.xc.model.Students;

public interface StudentsService {
	
	public int login(Students students);
	
	public Students queryById(String userId);
	
	public Page queryByName(Students students,Integer currPage,Integer PAGE_SIZE);
	
	public List<Students> queryBoss();
	
	/*public void delete(String userId);*/
	
	public void delMore(String[] userIds);
    
    public void update(Students students);
    
    public void updateRole(Students students);
    
    public void add(Students students);
	
}
