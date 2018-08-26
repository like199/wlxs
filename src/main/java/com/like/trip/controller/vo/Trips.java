package com.like.trip.controller.vo;

import java.util.List;

import com.like.trip.model.Tripitem;

public class Trips {

	private	 List<Tripitem> tripItemList;
	private	 int next_start;
	public List<Tripitem> getTripitemList() {
		return tripItemList;
	}
	public void setTripitemList(List<Tripitem> tripItemList) {
		this.tripItemList = tripItemList;
	}
	public int getNext_start() {
		return next_start;
	}
	public void setNext_start(int next_start) {
		this.next_start = next_start;
	}
	
	
}
