package com.cristian.transit.model.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "historicagentroute")
public class Historic {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_historic;
	@Column
	private String id_agent;
	@Column
	private int id_route;
	public int getId_historic() {
		return id_historic;
	}
	public void setId_historic(int id_historic) {
		this.id_historic = id_historic;
	}
	public String getId_agent() {
		return id_agent;
	}
	public void setId_agent(String id_agent) {
		this.id_agent = id_agent;
	}
	public int getId_route() {
		return id_route;
	}
	public void setId_route(int id_route) {
		this.id_route = id_route;
	}	
}
