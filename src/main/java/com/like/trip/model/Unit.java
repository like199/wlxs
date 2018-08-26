package com.like.trip.model;

import java.util.List;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-08-20
 */
public class Unit {
    private Integer id;

    private Integer chapterId;

    private Integer unitType;

    private String info;

    private String name;
    private List<Question> questionList;
    private List<Knowledgepoint> knowledgepointList;
    private List<Knowledgepoint> delteKnowledgepointList;

   

	public List<Knowledgepoint> getKnowledgepointList() {
		return knowledgepointList;
	}

	public void setKnowledgepointList(List<Knowledgepoint> knowledgepointList) {
		this.knowledgepointList = knowledgepointList;
	}

	public List<Knowledgepoint> getDelteKnowledgepointList() {
		return delteKnowledgepointList;
	}

	public void setDelteKnowledgepointList(List<Knowledgepoint> delteKnowledgepointList) {
		this.delteKnowledgepointList = delteKnowledgepointList;
	}

	public List<Question> getQuestionList() {
		return questionList;
	}

	public void setQuestionList(List<Question> questionList) {
		this.questionList = questionList;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public Integer getUnitType() {
        return unitType;
    }

    public void setUnitType(Integer unitType) {
        this.unitType = unitType;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}