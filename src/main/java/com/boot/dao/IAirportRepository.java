package com.boot.dao;


import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.boot.model.Airports;




@Repository
public interface IAirportRepository extends JpaRepository<Airports, Long> {


}