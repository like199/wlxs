package com.like.trip.model;

import java.util.List;
/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-08-18
 */
public class Question {
    private Integer id;

    private String questiontype;

    private String info;

    private String answer;

    private String analysis;

    private List<Questionimage> questionimageList;
    private List<Selectionanswer> selectionanswerList;
    private List<Analysisimage> analysisimageList;
    private List<Questionimage> deleteQuestionimageList;
    private List<Selectionanswer> deleteselectionanswerList;
    private List<Analysisimage> deleteAnalysisimageList;
    
    
   

	public List<Selectionanswer> getSelectionanswerList() {
		return selectionanswerList;
	}

	public void setSelectionanswerList(List<Selectionanswer> selectionanswerList) {
		this.selectionanswerList = selectionanswerList;
	}

	public List<Analysisimage> getAnalysisimageList() {
		return analysisimageList;
	}

	public void setAnalysisimageList(List<Analysisimage> analysisimageList) {
		this.analysisimageList = analysisimageList;
	}

	

	public List<Questionimage> getQuestionimageList() {
		return questionimageList;
	}

	public void setQuestionimageList(List<Questionimage> questionimageList) {
		this.questionimageList = questionimageList;
	}

	public List<Questionimage> getDeleteQuestionimageList() {
		return deleteQuestionimageList;
	}

	public void setDeleteQuestionimageList(List<Questionimage> deleteQuestionimageList) {
		this.deleteQuestionimageList = deleteQuestionimageList;
	}

	public List<Selectionanswer> getDeleteselectionanswerList() {
		return deleteselectionanswerList;
	}

	public void setDeleteselectionanswerList(List<Selectionanswer> deleteselectionanswerList) {
		this.deleteselectionanswerList = deleteselectionanswerList;
	}

	public List<Analysisimage> getDeleteAnalysisimageList() {
		return deleteAnalysisimageList;
	}

	public void setDeleteAnalysisimageList(List<Analysisimage> deleteAnalysisimageList) {
		this.deleteAnalysisimageList = deleteAnalysisimageList;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestiontype() {
        return questiontype;
    }

    public void setQuestiontype(String questiontype) {
        this.questiontype = questiontype == null ? null : questiontype.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis == null ? null : analysis.trim();
    }
}