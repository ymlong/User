package com.xc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.mapper.CompanyMapper;
import com.xc.model.Company;

@Service
public class CompanyServiceImpl implements CompanyService{
	
	@Autowired
	private CompanyMapper companyMapper;

	public List<Company> query() {
		// TODO Auto-generated method stub
		return this.companyMapper.query();
	}
	
}
