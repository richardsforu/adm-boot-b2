package com.cts.pss.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class AirlineInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long airlineId;
	private String airlineLogo;
	private String nameOfAirline;

	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name = "flightsInfo", joinColumns = { @JoinColumn(name = "airlineId") }, inverseJoinColumns = {
			@JoinColumn(name = "flightInfoid") })
	private List<FlightInfo> flightInfo;

	public List<FlightInfo> getFlightInfo() {
		return flightInfo;
	}

	public void setFlightInfo(List<FlightInfo> flightInfo) {
		this.flightInfo = flightInfo;
	}

	public long getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(long airlineId) {
		this.airlineId = airlineId;
	}

	public String getAirlineLogo() {
		return airlineLogo;
	}

	public void setAirlineLogo(String airlineLogo) {
		this.airlineLogo = airlineLogo;
	}

	public String getNameOfAirline() {
		return nameOfAirline;
	}

	public void setNameOfAirline(String nameOfAirline) {
		this.nameOfAirline = nameOfAirline;
	}

}
