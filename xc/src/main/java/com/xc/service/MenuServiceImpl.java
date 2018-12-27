package com.xc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.mapper.MenuMapper;
import com.xc.model.Menu;
import com.xc.util.TreeMenu;

@Service
public class MenuServiceImpl implements MenuService{
	
	@Autowired
	private MenuMapper menuMapper;

	public List<Menu> query() {
		// TODO Auto-generated method stub
		return TreeMenu.buildByRecursive(this.menuMapper.query()) ;
	}

}
