package com.bw.tzg.week1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bw.tzg.week1.domain.Movie;
import com.bw.tzg.week1.service.MovieService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class MovieController {
	@Autowired
	private MovieService service;
	
	@RequestMapping("/")
	public ModelAndView getList(
			@RequestParam(value = "pageNo" , required = false) Integer pageNum
			) {
		ModelAndView mav = new ModelAndView("movie-list");
		PageHelper pageHelper = new PageHelper();
		pageHelper.startPage(pageNum, 4);
		List<Movie> list = service.list();
		PageInfo<Movie> page = new PageInfo<Movie>(list);
		mav.addObject("page", page);
		mav.addObject("list", list);
		return mav;
	}
}