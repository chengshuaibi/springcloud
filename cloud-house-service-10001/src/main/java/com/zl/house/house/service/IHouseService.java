package com.zl.house.house.service;

import com.zl.house.house.entity.House;

public interface IHouseService {
	/**
	 * 根据id查询房屋
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public House queryById(int id) throws Exception;
	
}
