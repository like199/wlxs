package com.like.trip.model;

import java.util.List;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-08-20
 */
public class Chapter {
    private Integer id;

    private String name;

    private String info;

    private List<Unit> unitList;
    
    public List<Unit> getUnitList() {
		return unitList;
	}

	public void setUnitList(List<Unit> unitList) {
		this.unitList = unitList;
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