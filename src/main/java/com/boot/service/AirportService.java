package com.boot.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.boot.dao.IAirportRepository;
import com.boot.model.Airports;

@Service
public class AirportService implements IAirportService {
	
@Autowired
private IAirportRepository airportRepository;



@Override
public List<Airports> findAll() {
	@SuppressWarnings("deprecation")
	Pageable pg = new PageRequest(0,5);
	
List<Airports> airports = (List<Airports>) airportRepository.findAll();

return airports;
}


}