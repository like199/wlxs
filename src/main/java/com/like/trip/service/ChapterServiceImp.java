package com.like.trip.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.like.trip.mapper.ChapterMapper;
import com.like.trip.mapper.UnitMapper;
import com.like.trip.model.Chapter;
import com.like.trip.model.ChapterExample;
import com.like.trip.model.Question;
import com.like.trip.model.QuestionExample;
import com.like.trip.model.Unit;
import com.like.trip.model.UnitExample;

@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
public class ChapterServiceImp {
	@Autowired
	private ChapterMapper chapterMapper;
	@Autowired
	private UnitMapper  unitMapper;
	
	public List<Chapter>  search(ChapterExample chapterExample,Integer page ,Integer pageSize){
		PageHelper.startPage(page,pageSize);
		List<Chapter> chapterList=chapterMapper.selectByExample(chapterExample);
		PageInfo pageInfo = new PageInfo<>(chapterList,pageSize);
		List<Chapter> chapterList2=pageInfo.getList();
		pageInfo.getTotal();
		
		return chapterList2;
	}
		
	private Chapter setChild(Chapter chapter){
		UnitExample  unitExample=new UnitExample();
		unitExample.createCriteria().andChapterIdEqualTo(chapter.getId());
		List<Unit> unitList=unitMapper.selectByExample(unitExample);
		chapter.setUnitList(unitList);
		return chapter;
	}
	public Chapter get(Integer id) {
		Chapter chapter=chapterMapper.selectByPrimaryKey(id);
		return setChild(chapter);	
	}
	public void delete(Integer id) {
		chapterMapper.deleteByPrimaryKey(id);
	}
	public Chapter save(Chapter chapter) {
		if(chapter.getId()==null) {
			chapterMapper.insert(chapter);
		}else {
			chapterMapper.updateByPrimaryKey(chapter);
		}
		return chapter;
	}
}
