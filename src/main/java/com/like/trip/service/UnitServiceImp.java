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
import com.like.trip.mapper.KnowledgepointMapper;
import com.like.trip.mapper.QuestionMapper;
import com.like.trip.mapper.UnitMapper;
import com.like.trip.model.Analysisimage;
import com.like.trip.model.Chapter;
import com.like.trip.model.ChapterExample;
import com.like.trip.model.Knowledgepoint;
import com.like.trip.model.KnowledgepointExample;
import com.like.trip.model.QuestionExample;
import com.like.trip.model.Questionimage;
import com.like.trip.model.Selectionanswer;
import com.like.trip.model.Unit;
import com.like.trip.model.UnitExample;

@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
public class UnitServiceImp {
	@Autowired
	private KnowledgepointMapper knowledgepointMapper;
	@Autowired
	private QuestionMapper questionMapper;
	@Autowired
	private UnitMapper  unitMapper;
	
	public List<Unit>  search(UnitExample unitExample,Integer page ,Integer pageSize){
		PageHelper.startPage(page,pageSize);
		List<Unit> unitList=unitMapper.selectByExample(unitExample);
		PageInfo pageInfo = new PageInfo<>(unitList,pageSize);
		List<Unit> unitList2=pageInfo.getList();
		return unitList2;
	}
		
	private Unit setChild(Unit unit){
		KnowledgepointExample  knowledgepointExample=new KnowledgepointExample();
		knowledgepointExample.createCriteria().andUnitIdEqualTo(unit.getId());
		List<Knowledgepoint> knowledgepointList=knowledgepointMapper.selectByExample(knowledgepointExample);
		unit.setKnowledgepointList(knowledgepointList);
		return unit;
	}
	public Unit get(Integer id) {
		Unit chapter=unitMapper.selectByPrimaryKey(id);
		return setChild(chapter);	
	}
	public void delete(Integer id) {
		Unit unit=get(id);
		unitMapper.deleteByPrimaryKey(id);
		for(Knowledgepoint knowledgepoint:unit.getKnowledgepointList()) {
			knowledgepointMapper.deleteByPrimaryKey(knowledgepoint.getId());
		}
	}
	public Unit save(Unit unit) {
		
		if(unit.getId()==null) {
			unitMapper.insert(unit);
		}else {
			unitMapper.updateByPrimaryKey(unit);
			for(Knowledgepoint knowledgepoint:unit.getDelteKnowledgepointList()) {
				knowledgepointMapper.deleteByPrimaryKey(knowledgepoint.getId());
			}
			
			
		}
		for(Knowledgepoint knowledgepoint:unit.getKnowledgepointList()) {
			knowledgepoint.setUnitId(unit.getId());
			if(knowledgepoint.getId()==null||knowledgepoint.getId()==-1) {
				
				knowledgepointMapper.insert(knowledgepoint);
			}else {
				knowledgepointMapper.updateByPrimaryKey(knowledgepoint);
			}
		}
		
		return unit;
		
	
	}
}
