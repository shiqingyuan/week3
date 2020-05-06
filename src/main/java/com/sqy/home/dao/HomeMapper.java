package com.sqy.home.dao;

import java.util.List;

import com.sqy.home.domain.Home;
import com.sqy.home.vo.HomeVO;

public interface HomeMapper {

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
	
	/**
	 * 房间预订分页条件查询
	 * @Title: list 
	 * @Description: TODO
	 * @param homeVO
	 * @return
	 * @return: List<Home>
	 */
	List<Home> list(HomeVO homeVO);
}
