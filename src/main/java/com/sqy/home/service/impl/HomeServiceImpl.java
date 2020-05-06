package com.sqy.home.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sqy.home.dao.HomeMapper;
import com.sqy.home.domain.Home;
import com.sqy.home.service.HomeService;
import com.sqy.home.vo.HomeVO;

@Service
public class HomeServiceImpl implements HomeService {

	@Resource
	private HomeMapper homeMapper;

	@Override
	public int insertHomes(List<Home> list) {
		int i = homeMapper.insertHomes(list);
		return i;
	}


	@Override
	public int insertHome(Home h) {
		int i = homeMapper.insertHome(h);
		return i;
	}


	@Override
	public PageInfo<Home> list(HomeVO homeVO, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Home> list = homeMapper.list(homeVO);
		PageInfo<Home> pageInfo = new PageInfo<Home>(list);
		return pageInfo;
	}

}
