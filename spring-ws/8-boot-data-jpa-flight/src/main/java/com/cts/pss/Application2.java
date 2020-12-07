package com.cts.pss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.pss.dao.AirlineInfoDao;
import com.cts.pss.dao.FlightDao;
import com.cts.pss.entity.AirlineInfo;
import com.cts.pss.entity.FlightInfo;

@SpringBootApplication
public class Application2 {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(Application2.class, args);
		AirlineInfoDao airlineDao = ac.getBean(AirlineInfoDao.class);
		
	
		AirlineInfo info= airlineDao.findById(933L).orElse(null);
		
		System.out.println(info.getAirlineId());
		System.out.println(info.getAirlineLogo());
		System.out.println(info.getNameOfAirline());
		
		for(FlightInfo flightInfo:info.getFlightInfo()) {
			System.out.println(flightInfo.getFlightInfoid());
			System.out.println(flightInfo.getFlightNumber());
			System.out.println(flightInfo.getFlightType());
			System.out.println(flightInfo.getNumberofSeats());
			System.out.println("-------------------------------------");
		}
		
		
		
		
			
			
			

		
	}

}
