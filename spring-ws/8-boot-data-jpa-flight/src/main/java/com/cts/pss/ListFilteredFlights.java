package com.cts.pss;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.pss.dao.FlightDao;
import com.cts.pss.entity.Flight;
import com.cts.pss.service.FlightServiceImpl;

@SpringBootApplication
public class ListFilteredFlights {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(ListFilteredFlights.class, args);
		
		FlightServiceImpl fs = ac.getBean(FlightServiceImpl.class);

	
		List<Flight> flights=fs.findByOriginAndDestinationAndFlightDate("Delhi", "Chennai", LocalDate.of(2020, 11, 21),900);
		
	
	
		for(Flight flight:flights) {
			System.out.println(flight.getId());
			System.out.println(flight.getOrigin());
			System.out.println(flight.getDestination());
			System.out.println(flight.getFlightNumber());
			System.out.println(flight.getDuration());
			System.out.println(flight.getFlightDate());
			System.out.println(flight.getFlightTime());
			System.out.println(flight.getFlightInfo().getFlightInfoid());
			System.out.println(flight.getFlightInfo().getFlightNumber());
			System.out.println(flight.getFlightInfo().getFlightType());
			System.out.println(flight.getFlightInfo().getNumberofSeats());
		
			
			System.out.println(flight.getFare().getFareId());
			System.out.println(flight.getFare().getFare());
			System.out.println(flight.getFare().getCurrency());
			
			System.out.println(flight.getInventory().getInvId());
			System.out.println(flight.getInventory().getCount());
			
			
			System.out.println("--------------------------------------------");
		}
		
		System.out.println("=====================");
		
		Flight flight=fs.findByFlightNumberAndOriginAndDestinationAndFlightDate("AI-860", "Chennai", "Mumbai",LocalDate.of(2020, 12, 21));
			
		
		if(flight!=null) {
		System.out.println(flight.getId());
		System.out.println(flight.getOrigin());
		System.out.println(flight.getDestination());
		System.out.println(flight.getFlightNumber());
		System.out.println(flight.getDuration());
		System.out.println(flight.getFlightDate());
		System.out.println(flight.getFlightTime());
		System.out.println(flight.getFlightInfo().getFlightInfoid());
		System.out.println(flight.getFlightInfo().getFlightNumber());
		System.out.println(flight.getFlightInfo().getFlightType());
		System.out.println(flight.getFlightInfo().getNumberofSeats());
	
		
		System.out.println(flight.getFare().getFareId());
		System.out.println(flight.getFare().getFare());
		System.out.println(flight.getFare().getCurrency());
		
		System.out.println(flight.getInventory().getInvId());
		System.out.println(flight.getInventory().getCount());
		
		
		System.out.println("--------------------------------------------");
		}else {
			System.out.println("No Flight found");
		}

		
	}

}
