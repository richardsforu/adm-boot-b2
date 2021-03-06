package com.cts.pss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.pss.dao.FlightDao;
import com.cts.pss.entity.FlightInfo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(Application.class, args);
		FlightDao flightDao = ac.getBean(FlightDao.class);
		
		flightDao.findAll().forEach(flight->{
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
			

		});
	}

}
