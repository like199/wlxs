package com.like.trip.model;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-08-15
 */
public class Selectionanswer {
    private Integer id;

    private Integer questionId;

    private String info;

    private String iscorrect;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public String getIscorrect() {
        return iscorrect;
    }

    public void setIscorrect(String iscorrect) {
        this.iscorrect = iscorrect == null ? null : iscorrect.trim();
    }
}