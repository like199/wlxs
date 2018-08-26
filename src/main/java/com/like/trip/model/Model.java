package com.like.trip.model;

import java.util.List;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-07-17
 */
public class Model {
    private Integer id;

    private String name;

    private String info;
    private List<ModelColumn> modelColumns;
    

    public List<ModelColumn> getModelColumns() {
		return modelColumns;
	}

	public void setModelColumns(List<ModelColumn> modelColumns) {
		this.modelColumns = modelColumns;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }
}