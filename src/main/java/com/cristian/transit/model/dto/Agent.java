package com.cristian.transit.model.dto;

import javax.persistence.*;

@Entity
@Table(name = "agent")
public class Agent {
	@Id
	@Column
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id_agent;
	@Column
	private String name_agent;
	@Column
	private float experience_years;
	@Column
	private String id_secretary_traffic;
	public String getId_agent() {
		return id_agent;
	}
	public void setId_agent(String id_agent) {
		this.id_agent = id_agent;
	}
	public String getName_agent() {
		return name_agent;
	}
	public void setName_agent(String name_agent) {
		this.name_agent = name_agent;
	}
	public float getExperience_years() {
		return experience_years;
	}
	public void setExperience_years(float experience_years) {
		this.experience_years = experience_years;
	}
	public String getId_secretary_traffic() {
		return id_secretary_traffic;
	}
	public void setId_secretary_traffic(String id_secretary_traffic) {
		this.id_secretary_traffic = id_secretary_traffic;
	}
}
