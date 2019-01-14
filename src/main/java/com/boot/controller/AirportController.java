package com.boot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Airports;
import com.boot.service.IAirportService;
import org.springframework.http.MediaType;

@RestController
public class AirportController {
   
   @Autowired
   IAirportService airportService ;

@RequestMapping(value = "/")
public String printpage() {
return "airports list : /airports";

}


@RequestMapping(value = "/airports")
   public ResponseEntity<Object> getAirports() {
    
	   HttpHeaders headers = new HttpHeaders();
	    headers.add("Content-Type", "application/json; charset=UTF-8");
      return new ResponseEntity<>(airportService.findAll().toArray(), HttpStatus.OK);

   }

@RequestMapping(value = "/airports/{id}")
public ResponseEntity<Object>  getAirport() {
	
	
	
	return new ResponseEntity<>(airportService.getOne(), HttpStatus.OK);
}



}
