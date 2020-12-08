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
public class Query2 {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(Query2.class, args);

		FlightServiceImpl fs = ac.getBean(FlightServiceImpl.class);

		FlightDao flightDao = ac.getBean(FlightDao.class);
		
		Flight fdata=new Flight();
		
		fdata.setFlightNumber("AI-840");
		fdata.setOrigin("Delhi");
		fdata.setDestination("Chennai");
		fdata.setFlightDate( LocalDate.of(2020, 11, 21));

		Flight flight = flightDao.findFlightV2(fdata);

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

}
