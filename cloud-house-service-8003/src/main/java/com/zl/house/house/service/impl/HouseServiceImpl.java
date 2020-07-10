package com.zl.house.house.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.house.house.entity.House;
import com.zl.house.house.mapper.HouseMapper;
import com.zl.house.house.service.IHouseService;

@Service
public class HouseServiceImpl implements IHouseService {
	@Autowired
	private HouseMapper houseMapper;
	
	@Override
	public House queryById(int id) throws Exception {
		return houseMapper.selectById(id);
	}

}
