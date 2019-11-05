package com.bw.tzg.week1.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bw.tzg.week1.dao.MovieMapperDao;
import com.bw.tzg.week1.domain.Movie;
import com.bw.tzg.week1.service.MovieService;
@Service
public class MovieServiceImpl extends ServiceImpl<MovieMapperDao, Movie> implements MovieService{

}
