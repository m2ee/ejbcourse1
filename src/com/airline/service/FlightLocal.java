package com.airline.service;

import javax.ejb.Local;

@Local
public interface FlightLocal {

	Integer getId();

	void setId(Integer id);

	String getFrom();

	void setFrom(String from);

	String getTo();

	void setTo(String to);

	Integer getPrice();

	void setPrice(Integer price);

	Integer getNumOfSeats();

	void setNumOfSeats(Integer numOfSeats);

	String getAirplaneModel();

	void setAirplaneModel(String airplaneModel);

	String toString();

}