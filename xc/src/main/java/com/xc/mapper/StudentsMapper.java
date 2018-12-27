package com.xc.mapper;

import java.util.List;

import com.xc.model.Students;

public interface StudentsMapper {
	
    public Students queryByUsername(Students students);
    
    public Students queryById(String userId);
    
    public Integer selCount(Students students);
    
    public List<Students> queryByName(Students students); 
    
    public List<Students> queryBoss();
    
   /* public void delete(String userId);*/
    
    public void delMore(String userId);
    
    public void update(Students students);
    
    public void updateRole(Students students);
    
    public void add(Students students);
    
}
