package com.sqy.home.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.sqy.home.domain.Home;
import com.sqy.home.service.HomeService;
import com.sqy.home.vo.HomeVO;

@Controller
public class HomeController {

	@Resource
	private HomeService homeService;
	
	@RequestMapping("homes")
	public String list(Model model,HomeVO homeVO,@RequestParam(defaultValue = "1") Integer pageNum,
			@RequestParam(defaultValue = "10")Integer pageSize) {
		
		PageInfo<Home> info = homeService.list(homeVO, pageNum, pageSize);
		
		model.addAttribute("info", info);
		model.addAttribute("homeVO", homeVO);
		
		return "list";
		
	}
}
