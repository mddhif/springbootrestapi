package com.boot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Airports")
public class Airports {
    
    @Id
	private int id;
	private String icao ;
	private String type;
	private String name ;
	private double latitude;
	private double longitude ;
	private int elevation ;
	private String continent ;
	private String country_iso;
	private String region_iso;
	private String municipality;
	private String scheduled_service ;
	private String gps ;
	private String iata;
	private String local_code ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIcao() {
		return icao;
	}
	public void setIcao(String icao) {
		this.icao = icao;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public int getElevation() {
		return elevation;
	}
	public void setElevation(int elevation) {
		this.elevation = elevation;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public String getCountry_iso() {
		return country_iso;
	}
	public void setCountry_iso(String country_iso) {
		this.country_iso = country_iso;
	}
	public String getRegion_iso() {
		return region_iso;
	}
	public void setRegion_iso(String region_iso) {
		this.region_iso = region_iso;
	}
	public String getMunicipality() {
		return municipality;
	}
	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}
	public String getScheduled_service() {
		return scheduled_service;
	}
	public void setScheduled_service(String scheduled_service) {
		this.scheduled_service = scheduled_service;
	}
	public String getGps() {
		return gps;
	}
	public void setGps(String gps) {
		this.gps = gps;
	}
	public String getIata() {
		return iata;
	}
	public void setIata(String iata) {
		this.iata = iata;
	}
	public String getLocal_code() {
		return local_code;
	}
	public void setLocal_code(String local_code) {
		this.local_code = local_code;
	}
	
	
	
}