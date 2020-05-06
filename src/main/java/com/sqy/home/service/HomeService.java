package com.sqy.home.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sqy.home.domain.Home;
import com.sqy.home.vo.HomeVO;

public interface HomeService {

	/**
	 * 房间预订分页条件查询
	 * @Title: list 
	 * @Description: TODO
	 * @param homeVO
	 * @return
	 * @return: List<Home>
	 */
	PageInfo<Home> list(HomeVO homeVO, Integer pageNum, Integer pageSize);
	
	/**
	 * 批量添加房间预订
	 * @Title: add 
	 * @Description: TODO
	 * @param list
	 * @return
	 * @return: int
	 */
	int insertHomes(List<Home> list);
	/**
	 * 单条添加房间预订
	 * @Title: insertHome 
	 * @Description: TODO
	 * @param h
	 * @return
	 * @return: int
	 */
	int insertHome(Home h);
	
}