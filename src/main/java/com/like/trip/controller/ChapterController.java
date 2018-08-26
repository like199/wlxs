package com.like.trip.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.like.trip.model.Chapter;
import com.like.trip.model.Question;
import com.like.trip.model.Unit;
import com.like.trip.service.ChapterServiceImp;
import com.like.trip.service.UnitServiceImp;

@RestController
@RequestMapping(value = "/chapter",produces = "application/json;charset=UTF-8")
class ChapterController {

	@Autowired
	private ChapterServiceImp chapterServiceImp;
	Logger logger = LoggerFactory.getLogger(QuestionController.class);
	
	@RequestMapping("/get/{id}")
	public Chapter get(@PathVariable("id") Integer id) {
		
		return chapterServiceImp.get(id);
	}
	
	@RequestMapping("/search/{page}/{pageSize}")
	public List<Chapter> search(@PathVariable("page") Integer page,@PathVariable("pageSize") Integer pageSize) {
		System.out.println("search"+page+" "+pageSize);
		return chapterServiceImp.search(null, page, pageSize);
	}
	
	@RequestMapping("/save")
	public Chapter save(@RequestBody Chapter chapter) {
		System.out.println("aaaa"+chapter.getId());
		return chapterServiceImp.save(chapter);
	}
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") Integer id) {
		
		chapterServiceImp.delete(id);
		 return "success";
	}
}
