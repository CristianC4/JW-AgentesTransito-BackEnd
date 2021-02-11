package com.cristian.transit.controller.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristian.transit.model.dto.Agent;

@Service
public class AgentDAO implements IAgentDAO {

	@Autowired
	private AgentRepository repository;
	
	@Override
	public List<Agent> listAgents() {
		return repository.findAll();
	}

	@Override
	public Agent createAgent(Agent agent) {
		return repository.save(agent);
	}

	@Override
	public void deleteAgent(String id) {
		repository.deleteAgentById(id);
	}

	@Override
	public Agent updateAgent(Agent agent) {
		return repository.save(agent);
	}

	/**@Override
	public Optional<Agent> findAgentById(String id) {
		int idInt = Integer.parseInt(id);
		return repository.findById(id).orElse(null);
	}*/

}
