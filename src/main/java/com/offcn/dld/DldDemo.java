package com.offcn.dld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.mapper.ShiroUserMapper;

@Service
public class DldDemo {
	@Autowired
	private ShiroUserMapper mapper;
	public int deleteByPrimaryKey(Integer id) {
		System.out.println("哈哈哈");
		System.out.println("我来捣乱");
		return mapper.deleteByPrimaryKey(id);
		
	}

}
