package com.like.trip.model;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-07-17
 */
public class ModelColumn {
    private Integer id;

    private String name;

    private String type;

    private String wxType;

    private String contractObject;

    private Integer contractType;

    private Integer contractColumn;

    private String label;

    private Integer modelId;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getWxType() {
        return wxType;
    }

    public void setWxType(String wxType) {
        this.wxType = wxType == null ? null : wxType.trim();
    }

    public String getContractObject() {
        return contractObject;
    }

    public void setContractObject(String contractObject) {
        this.contractObject = contractObject == null ? null : contractObject.trim();
    }

    public Integer getContractType() {
        return contractType;
    }

    public void setContractType(Integer contractType) {
        this.contractType = contractType;
    }

    public Integer getContractColumn() {
        return contractColumn;
    }

    public void setContractColumn(Integer contractColumn) {
        this.contractColumn = contractColumn;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }
}