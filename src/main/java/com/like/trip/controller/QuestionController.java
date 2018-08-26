package com.like.trip.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.like.trip.model.Question;
import com.like.trip.service.QuestionServiceImp;

@RestController
@RequestMapping(value = "/question",produces = "application/json;charset=UTF-8")
public class QuestionController {

	@Autowired
	private QuestionServiceImp questionServiceImp;
	Logger logger = LoggerFactory.getLogger(QuestionController.class);
	
	@RequestMapping("/get/{id}")
	public Question get(@PathVariable("id") Integer id) {
		
		return questionServiceImp.get(id);
	}
	
	@RequestMapping("/search/{page}/{pageSize}")
	public List<Question> search(@PathVariable("page") Integer page,@PathVariable("pageSize") Integer pageSize) {
		System.out.println("search"+page+" "+pageSize);
		return questionServiceImp.search(null, page, pageSize);
	}
	
	@RequestMapping("/save")
	public Question save(@RequestBody Question question) {
		System.out.println("aaaa");
		return questionServiceImp.save(question);
	}
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") Integer id) {
		
		 questionServiceImp.delete(id);
		 return "success";
	}
}
