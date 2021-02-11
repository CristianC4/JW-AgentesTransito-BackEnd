package com.cristian.transit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cristian.transit.controller.dao.AgentDAO;
import com.cristian.transit.model.dto.Agent;

@CrossOrigin(origins = "http://localhost:4200" , maxAge = 3600)
@RestController
@RequestMapping({"/agents"})
public class Controller {
	
	@Autowired
	AgentDAO serviceAgent;
	
	@GetMapping
	public List<Agent> listAgents(){
		return serviceAgent.listAgents();
	}

	@PostMapping
	public Agent createAgent(@RequestBody Agent agent) {
		return serviceAgent.createAgent(agent);
	}
	/*@GetMapping(path = {"/agents/{id_agent}"})
	public Agent findAgentById(@PathVariable("id_agent") String id) {
		return serviceAgent.findAgentById(id);
	}*/ 

	@PutMapping("/{id_agent}")
	public Agent updateAgent( @PathVariable("id_agent") String id_agent, @RequestBody Agent agent) {
		agent.setId_agent(id_agent);
		return serviceAgent.updateAgent(agent);
	}
	
	@DeleteMapping("/{id_agent}")
	public void deleteAgent(@PathVariable("id_agent") String id_agent) {
		serviceAgent.deleteAgent(id_agent);
	}
}
