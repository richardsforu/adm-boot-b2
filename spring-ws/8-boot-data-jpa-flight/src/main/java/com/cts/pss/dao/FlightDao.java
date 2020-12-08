package com.cts.pss.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cts.pss.entity.Flight;

public interface FlightDao extends JpaRepository<Flight, Long> {

	List<Flight> findByOriginAndDestinationAndFlightDate(String origin, String destination, LocalDate flightDate);

	Flight findByFlightNumberAndOriginAndDestinationAndFlightDate(String flightNumber, String origin,
			String destination, LocalDate flightdate);

	@Query(name = "q1", value = "from Flight")
	List<Flight> getFlights();
	
	@Query(name = "q2", value = "from Flight as f where f.flightNumber=?1 and f.origin=?2 and f.destination=?3 and f.flightDate=?4")
	Flight findFlight(String flightNumber, String origin,String destination, LocalDate flightdate);
	
	
	@Query(name = "q3", value = "from Flight as f where f.flightNumber=:fn and f.origin=:origin and f.destination=:destination and f.flightDate=:flightDate")
	Flight findFlightV1(@Param("fn") String flightNumber, String origin,String destination, LocalDate flightDate);
	
	@Query(name = "q4", value = "from Flight as f where f.flightNumber=:#{#flight.flightNumber} and f.origin=:#{#flight.origin} and f.destination=:#{#flight.destination} and f.flightDate=:#{#flight.flightDate}")
	Flight findFlightV2(@Param("flight") Flight flight);
	

	
}
