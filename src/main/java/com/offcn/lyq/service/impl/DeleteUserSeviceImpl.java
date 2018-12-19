package com.offcn.lyq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.lyq.service.DeleteUserService;
import com.offcn.mapper.ShiroUserMapper;
import com.offcn.pojo.ShiroUser;

@Service
public class DeleteUserSeviceImpl implements DeleteUserService{

	@Autowired
	private ShiroUserMapper mapper;
	
	public int DeleteUser(int id) {
		return mapper.deleteByPrimaryKey(id);
	}

	public int UpdateUser(ShiroUser user) {
		return mapper.updateByPrimaryKey(user);
	}



	public int AddUser(int id) {
		
		return 0;
	}


}
