package com.xc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.mapper.PostMapper;
import com.xc.model.Post;

@Service
public class PostServiceImpl implements PostService{
	
	@Autowired
	private PostMapper postMapper;

	public List<Post> query() {
		// TODO Auto-generated method stub
		return this.postMapper.query();
	}
	

}
