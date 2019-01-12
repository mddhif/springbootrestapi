package com.boot.service;


import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Page;

import com.boot.model.Airports;



public interface IAirportService {
	
public List<Airports>  findAll();


}