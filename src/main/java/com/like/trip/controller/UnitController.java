package com.like.trip.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.like.trip.model.Question;
import com.like.trip.model.Unit;
import com.like.trip.service.QuestionServiceImp;
import com.like.trip.service.UnitServiceImp;

@RestController
@RequestMapping(value = "/unit",produces = "application/json;charset=UTF-8")
public class UnitController {

	@Autowired
	private UnitServiceImp unitServiceImp;
	Logger logger = LoggerFactory.getLogger(QuestionController.class);
	
	@RequestMapping("/get/{id}")
	public Unit get(@PathVariable("id") Integer id) {
		
		return unitServiceImp.get(id);
	}
	
	@RequestMapping("/search/{page}/{pageSize}")
	public List<Unit> search(@PathVariable("page") Integer page,@PathVariable("pageSize") Integer pageSize) {
		System.out.println("search"+page+" "+pageSize);
		return unitServiceImp.search(null, page, pageSize);
	}
	
	@RequestMapping("/save")
	public Unit save(@RequestBody Unit unit) {
		System.out.println("aaaa");
		return unitServiceImp.save(unit);
	}
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") Integer id) {
		
		unitServiceImp.delete(id);
		 return "success";
	}
}
