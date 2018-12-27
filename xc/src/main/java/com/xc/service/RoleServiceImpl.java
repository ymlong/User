package com.xc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.mapper.RoleMapper;
import com.xc.model.Role;
import com.xc.util.TreeRole;
import com.xc.util.TreeUtil;

@Service
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	private RoleMapper roleMapper;

	public List<Role> query() {
		// TODO Auto-generated method stub
		return TreeRole.buildByRecursive(this.roleMapper.query());
	}
	
	

}
