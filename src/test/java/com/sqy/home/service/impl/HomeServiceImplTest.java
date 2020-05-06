package com.sqy.home.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageInfo;
import com.sqy.common.utils.DateUtil;
import com.sqy.common.utils.RandomUtil;
import com.sqy.common.utils.StringUtil;
import com.sqy.home.domain.Home;
import com.sqy.home.service.HomeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class HomeServiceImplTest {

	@Resource
	private HomeService homeService;

	@Test
	public void testList() {
		PageInfo<Home> list = homeService.list(null, 3, 10);
		System.out.println(list);
	}

	@Test
	public void testInsertHomes() {

		List<Home> list = new ArrayList<Home>();
		for (int i = 0; i < 100; i++) {
			Home h = new Home();
			// 1. 模拟从2020年5月1日至今任意随机日期
			Calendar c = Calendar.getInstance();
			c.set(2020, 5, 1);
			h.setDate(DateUtil.date(c.getTime(), new Date()));
			// System.out.println(c.getTime());

			// 2.调用StringUtil.generateChineseName()创建
			String name = StringUtil.generateChineseName();
			h.setName(name);
			// System.out.println(name);

			// 3. 11位数字
			int p = RandomUtil.random(100000000, 999999999);
			String a = String.valueOf(p);
			int j = RandomUtil.random(10, 99);
			String b = String.valueOf(j);
			h.setPhone(a + b);
			// System.out.println(a+b);

			// 4.房型id来自房型类型表
			h.setTid(RandomUtil.random(1, 4));
			// System.out.println(RandomUtil.random(1, 4));

			// 5. 备注 随机汉字
			h.setBz(StringUtil.randomChineseString(RandomUtil.random(1, 30)));
			// System.out.println(StringUtil.randomChineseString(RandomUtil.random(1, 30)));
			// System.out.println(h);
			
			list.add(h);
		}
		
		int i = homeService.insertHomes(list);
		System.out.println(i);
	}

	@Test
	public void testInsertHome() {

	}

}
