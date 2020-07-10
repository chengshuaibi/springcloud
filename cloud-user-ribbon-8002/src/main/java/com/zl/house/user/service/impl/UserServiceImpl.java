package com.zl.house.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zl.house.user.entity.User;
import com.zl.house.user.mapper.UserMapper;
import com.zl.house.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User queryById(int id) throws Exception {
		return userMapper.selectById(id);
	}

	@Override
	public User login(String name, String password) throws Exception {
		QueryWrapper<User> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq("name", name).eq("password", password);
		return userMapper.selectOne(queryWrapper);
	}

}
