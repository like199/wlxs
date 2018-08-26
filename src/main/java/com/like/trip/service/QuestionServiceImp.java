package com.like.trip.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.like.trip.mapper.AnalysisimageMapper;
import com.like.trip.mapper.QuestionMapper;
import com.like.trip.mapper.QuestionimageMapper;
import com.like.trip.mapper.SelectionanswerMapper;
import com.like.trip.model.Analysisimage;
import com.like.trip.model.AnalysisimageExample;
import com.like.trip.model.Question;
import com.like.trip.model.QuestionExample;
import com.like.trip.model.Questionimage;
import com.like.trip.model.QuestionimageExample;
import com.like.trip.model.Selectionanswer;
import com.like.trip.model.SelectionanswerExample;

@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
public class QuestionServiceImp {
	@Autowired
	private QuestionMapper questionMapper;
	@Autowired
	private QuestionimageMapper questionimageMapper;
	@Autowired
	private SelectionanswerMapper selectionanswerMapper;
	@Autowired
	private AnalysisimageMapper analysisimageMapper;
	
	
	
	public List<Question> search(QuestionExample questionExample,Integer page ,Integer pageSize){
		PageHelper.startPage(page,pageSize);
		List<Question> questionList=questionMapper.selectByExample(questionExample);
		PageInfo pageInfo = new PageInfo<>(questionList,pageSize);
		List<Question> questionList2=pageInfo.getList();
		
		for(Question question:questionList2) {
			setChild(question);
		}
		return questionList2;
	}
		
	public Question get(Integer id) {
		Question question=questionMapper.selectByPrimaryKey(id);
		return setChild(question);	
	}
	public void delete(Integer id) {
		Question question=get(id);
		deleteChild(question);
	}
	private void deleteChild(Question question) {
		questionMapper.updateByPrimaryKey(question);
		QuestionimageExample questionimageExample=new QuestionimageExample();
		questionimageExample.createCriteria().andQuestionIdEqualTo(question.getId());
		questionimageMapper.deleteByExample(questionimageExample);
		
		SelectionanswerExample selectionanswerExample=new SelectionanswerExample();
		selectionanswerExample.createCriteria().andQuestionIdEqualTo(question.getId());
		selectionanswerMapper.deleteByExample(selectionanswerExample);
		
		AnalysisimageExample analysisimageExample=new AnalysisimageExample();
		analysisimageExample.createCriteria().andQuestionIdEqualTo(question.getId());
		analysisimageMapper.deleteByExample(analysisimageExample);
	}
	private Question setChild(Question question) {
		QuestionimageExample questionimageExample=new QuestionimageExample();
		questionimageExample.createCriteria().andQuestionIdEqualTo(question.getId());
		List<Questionimage> questionimageList=questionimageMapper.selectByExample(questionimageExample);
		question.setQuestionimageList(questionimageList);
		
		SelectionanswerExample selectionanswerExample=new SelectionanswerExample();
		selectionanswerExample.createCriteria().andQuestionIdEqualTo(question.getId());
		List<Selectionanswer> selectionanswerList=selectionanswerMapper.selectByExample(selectionanswerExample);
		question.setSelectionanswerList(selectionanswerList);
		
		AnalysisimageExample analysisimageExample=new AnalysisimageExample();
		analysisimageExample.createCriteria().andQuestionIdEqualTo(question.getId());
		List<Analysisimage> analysisimageList= analysisimageMapper.selectByExample(analysisimageExample);
		question.setAnalysisimageList(analysisimageList);
		return question;
	}
	public Question save(Question  question) {
		if(question.getId()==null) {
			questionMapper.insert(question);
		}else {
			questionMapper.updateByPrimaryKey(question);
			for(Questionimage questionimage:question.getDeleteQuestionimageList()) {
				questionimageMapper.deleteByPrimaryKey(questionimage.getId());
			}
			for(Selectionanswer selectionanswer:question.getDeleteselectionanswerList()) {
				selectionanswerMapper.deleteByPrimaryKey(selectionanswer.getId());
			}
			for(Analysisimage analysisimage:question.getDeleteAnalysisimageList()) {
				analysisimageMapper.deleteByPrimaryKey(analysisimage.getId());
			}
			
		}
		for(Questionimage questionimage:question.getQuestionimageList()) {
			questionimage.setQuestionId(question.getId());
			if(questionimage.getId()==null||questionimage.getId()==-1) {
				
				questionimageMapper.insert(questionimage);
			}else {
				questionimageMapper.updateByPrimaryKey(questionimage);
			}
		}
		for(Selectionanswer selectionanswer:question.getSelectionanswerList()) {
			selectionanswer.setQuestionId(question.getId());
			if(selectionanswer.getId()==null||selectionanswer.getId()==-1) {
				selectionanswerMapper.insert(selectionanswer);
			}else {
				selectionanswerMapper.updateByPrimaryKey(selectionanswer);
			}
		}
		for(Analysisimage analysisimage:question.getAnalysisimageList()) {
			analysisimage.setQuestionId(question.getId());
			if(analysisimage.getId()==null||analysisimage.getId()==-1) {
				analysisimageMapper.insert(analysisimage);
			}else {
				analysisimageMapper.updateByPrimaryKey(analysisimage);
			}
		}
		return question;
		
	}
	
}
