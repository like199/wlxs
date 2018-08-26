package com.like.trip.model;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-08-20
 */
public class Knowledgepoint {
    private Integer id;

    private String info;

    private Integer unitId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }
}