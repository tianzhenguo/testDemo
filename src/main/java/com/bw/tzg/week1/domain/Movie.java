package com.bw.tzg.week1.domain;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@TableName("tb_movie")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Movie implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//主键
	private int id;
	
	private String name;
	
	private String director;
	
	private int price;
	@TableField("release_date")
	private String date;
	@TableField("film_time")
	private int time;
	
	private String type;
	
	private int decade;
	
	private String area;
	
	private String status;
}