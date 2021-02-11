package com.cristian.transit.controller.dao;

import java.util.List;

import com.cristian.transit.model.dto.Agent;

public interface IAgentDAO {
	List<Agent> listAgents();
	//Optional<Agent> findAgentById(String id);
	Agent createAgent(Agent a);
	void deleteAgent(String id);
	Agent updateAgent(Agent a);
}
