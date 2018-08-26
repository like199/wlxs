package com.like.trip.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.like.trip.mapper.TripitemMapper;
import com.like.trip.model.Tripitem;

@Service
public class TripItemService {
	
	@Autowired
	private TripitemMapper tripitemMapper;
	
	public List<Tripitem> getPageTripItem(int startPage,int pageSize){
		PageHelper.startPage(startPage,pageSize);
	     //startPage后紧跟的这个查询就是分页查询
	     List<Tripitem> emps = tripitemMapper.selectByExample(null);
	      //使用PageInfo包装查询结果，只需要将pageInfo交给页面就可以
	      PageInfo pageInfo = new PageInfo<>(emps,pageSize);
	       //pageINfo封装了分页的详细信息，也可以指定连续显示的页
	      return pageInfo.getList();
	}
}
