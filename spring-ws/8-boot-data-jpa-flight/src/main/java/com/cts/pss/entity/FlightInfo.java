package com.cts.pss.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FlightInfo {

	@Id
	@GeneratedValue
	private long flightInfoid;
	private String flightNumber;
	private String flightType;
	private int numberofSeats;
	
	
	

	public long getFlightInfoid() {
		return flightInfoid;
	}

	public void setFlightInfoid(long flightInfoid) {
		this.flightInfoid = flightInfoid;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightType() {
		return flightType;
	}

	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}

	public int getNumberofSeats() {
		return numberofSeats;
	}

	public void setNumberofSeats(int numberofSeats) {
		this.numberofSeats = numberofSeats;
	}

}
