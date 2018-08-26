package com.like.trip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.like.trip.controller.vo.Trips;
import com.like.trip.mapper.TripitemMapper;
import com.like.trip.model.Model;
import com.like.trip.model.Tripitem;
import com.like.trip.model.TripitemExample;
import com.like.trip.service.ModelSqlService;
import com.like.trip.service.TripItemService;

@RestController
@RequestMapping(value = "/tripItem",produces = "application/json;charset=UTF-8")
public class TripItemController {
	

	@Autowired
	private TripItemService tripItemService;
	@Autowired
	private ModelSqlService modelSqlService;
	
	@RequestMapping("/index")
	public String findTripItem(@RequestParam("next_start")Integer next_start){
		/*
		int startpage=(int)Math.round(next_start/20+0.5);
		List<Tripitem> tripitemList= tripItemService.getPageTripItem(startpage, 20);
		next_start=+tripitemList.size();
		Trips trips=new Trips();
		trips.setNext_start(next_start);
		trips.setTripitemList(tripitemList);
		*/
		try {
			 Model model=modelSqlService.getModelById(1);
			 modelSqlService.createObject(model);
			 return "Success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}
		
		
	}
	
}
