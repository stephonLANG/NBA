package com.offcn.lyq.service;

import com.offcn.pojo.ShiroUser;

public interface DeleteUserService {
	public int DeleteUser(int id);
	public int UpdateUser(ShiroUser user);
	
	public int AddUser(int id);

}
