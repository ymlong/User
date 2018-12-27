package com.xc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.xc.util.Page;
import com.xc.mapper.StudentsMapper;
import com.xc.model.Students;

@Service
public class StudentsServiceImpl implements StudentsService{
	
	@Autowired
	private StudentsMapper studentsMapper;

	public int login(Students students) {
		// TODO Auto-generated method stub
		int flag=0;
		Students stu = studentsMapper.queryByUsername(students);
		if(stu==null) flag=1;
		else if(!stu.getPassword().equals(students.getPassword())) {
			flag = 2;
		}
		return flag;
	}

	public Page queryByName(Students students,Integer currPage,Integer PAGE_SIZE) {
		// TODO Auto-generated method stub
		if(currPage == null) currPage=1;        
        Page page = new Page();
        page.setCurrPage(currPage);
        page.setPAGE_SIZE(PAGE_SIZE);
        //page.setPAGE_SIZE(PAGE_SIZE);
        //查总记录数
        page.setTotalCount(this.studentsMapper.selCount(students));     
        //计算总页数
        page.init();
        PageHelper.startPage(currPage, PAGE_SIZE);
        page.setData(this.studentsMapper.queryByName(students));
        return page;
	}

/*	public void delete(String userId) {
		// TODO Auto-generated method stub
		this.studentsMapper.delete(userId);	
	}*/
	
	public void delMore(String[] userIds) {
		// TODO Auto-generated method stub
		for(String userId:userIds) {
			this.studentsMapper.delMore(userId);
		}		
	}


	public void update(Students students) {
		// TODO Auto-generated method stub
		this.studentsMapper.update(students);
	}

	public void add(Students students) {
		// TODO Auto-generated method stub
		this.studentsMapper.add(students);
		
	}

	public Students queryById(String userId) {
		// TODO Auto-generated method stub
		return this.studentsMapper.queryById(userId);
	}

	public List<Students> queryBoss() {
		// TODO Auto-generated method stub
		return this.studentsMapper.queryBoss();
	}

	public void updateRole(Students students) {
		// TODO Auto-generated method stub
		this.studentsMapper.updateRole(students);
		
	}
	

}
