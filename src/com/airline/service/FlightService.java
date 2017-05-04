package com.airline.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class FlightService
 */
@Stateless
public class FlightService implements FlightLocal, FlightRemote {

	/**
	 * Default constructor.
	 */
	public FlightService() {
		// TODO Auto-generated constructor stub
	}

	private Integer id = 2348795;
	private String from = "LA";
	private String to = "NY";
	private Integer price = 400;
	private Integer numOfSeats = 250;
	private String airplaneModel = "Boing 787";

	/* (non-Javadoc)
	 * @see com.airline.service.FlightLocal#getId()
	 */
	@Override
	public Integer getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see com.airline.service.FlightLocal#setId(java.lang.Integer)
	 */
	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see com.airline.service.FlightLocal#getFrom()
	 */
	@Override
	public String getFrom() {
		return from;
	}

	/* (non-Javadoc)
	 * @see com.airline.service.FlightLocal#setFrom(java.lang.String)
	 */
	@Override
	public void setFrom(String from) {
		this.from = from;
	}

	/* (non-Javadoc)
	 * @see com.airline.service.FlightLocal#getTo()
	 */
	@Override
	public String getTo() {
		return to;
	}

	/* (non-Javadoc)
	 * @see com.airline.service.FlightLocal#setTo(java.lang.String)
	 */
	@Override
	public void setTo(String to) {
		this.to = to;
	}

	/* (non-Javadoc)
	 * @see com.airline.service.FlightLocal#getPrice()
	 */
	@Override
	public Integer getPrice() {
		return price;
	}

	/* (non-Javadoc)
	 * @see com.airline.service.FlightLocal#setPrice(java.lang.Integer)
	 */
	@Override
	public void setPrice(Integer price) {
		this.price = price;
	}

	/* (non-Javadoc)
	 * @see com.airline.service.FlightLocal#getNumOfSeats()
	 */
	@Override
	public Integer getNumOfSeats() {
		return numOfSeats;
	}

	/* (non-Javadoc)
	 * @see com.airline.service.FlightLocal#setNumOfSeats(java.lang.Integer)
	 */
	@Override
	public void setNumOfSeats(Integer numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

	/* (non-Javadoc)
	 * @see com.airline.service.FlightLocal#getAirplaneModel()
	 */
	@Override
	public String getAirplaneModel() {
		return airplaneModel;
	}

	/* (non-Javadoc)
	 * @see com.airline.service.FlightLocal#setAirplaneModel(java.lang.String)
	 */
	@Override
	public void setAirplaneModel(String airplaneModel) {
		this.airplaneModel = airplaneModel;
	}

	/* (non-Javadoc)
	 * @see com.airline.service.FlightLocal#toString()
	 */
	@Override
	public String toString() {
		return "FlightService [id=" + id + ", from=" + from + ", to=" + to + ", price=" + price + ", numOfSeats="
				+ numOfSeats + ", airplaneModel=" + airplaneModel + "]";
	}

	
}
