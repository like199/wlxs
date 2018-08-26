package com.like.trip.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-07-15
 */
public class Tripitem {
    private Integer id;

    private String name;

    private String coverImageW640;

    private Date createDate;

    private Integer dayCount;

    private String viewCount;

    private String popularPlaceStr;

    private Integer createUser;

    private String waypoints;

    private String recommendations;
  
    private	Author author;
    
    

    public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
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

    public String getCoverImageW640() {
        return coverImageW640;
    }

    public void setCoverImageW640(String coverImageW640) {
        this.coverImageW640 = coverImageW640 == null ? null : coverImageW640.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getDayCount() {
        return dayCount;
    }

    public void setDayCount(Integer dayCount) {
        this.dayCount = dayCount;
    }

    public String getViewCount() {
        return viewCount;
    }

    public void setViewCount(String viewCount) {
        this.viewCount = viewCount == null ? null : viewCount.trim();
    }

    public String getPopularPlaceStr() {
        return popularPlaceStr;
    }

    public void setPopularPlaceStr(String popularPlaceStr) {
        this.popularPlaceStr = popularPlaceStr == null ? null : popularPlaceStr.trim();
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public String getWaypoints() {
        return waypoints;
    }

    public void setWaypoints(String waypoints) {
        this.waypoints = waypoints == null ? null : waypoints.trim();
    }

    public String getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(String recommendations) {
        this.recommendations = recommendations == null ? null : recommendations.trim();
    }
}