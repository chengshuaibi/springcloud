package com.zl.house.user.service;

import com.zl.house.user.entity.User;

public interface IUserService {
	/**
	 * 根据id查询用户
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public User queryById(int id) throws Exception;
	
	/**
	 * 登录
	 * @param name
	 * @param password
	 * @return
	 * @throws Exception
	 */
	public User login(String name, String password) throws Exception;
}
