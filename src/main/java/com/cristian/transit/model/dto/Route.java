package com.cristian.transit.model.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "route")
public class Route {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_route;
	@Column
	private String type_route;
	@Column
	private String street;
	@Column
	private int number_street;
	@Column
	private float level_congestion;
	
	public int getId_route() {
		return id_route;
	}
	public void setId_route(int id_route) {
		this.id_route = id_route;
	}
	public String getType_route() {
		return type_route;
	}
	public void setType_route(String type_route) {
		this.type_route = type_route;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getNumber_street() {
		return number_street;
	}
	public void setNumber_street(int number_street) {
		this.number_street = number_street;
	}
	public float getLevel_congestion() {
		return level_congestion;
	}
	public void setLevel_congestion(float level_congestion) {
		this.level_congestion = level_congestion;
	}
}
