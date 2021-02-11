package com.cristian.transit.controller.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.cristian.transit.model.dto.Agent;

public interface AgentRepository extends JpaRepository<Agent,Integer>{
	
	@Modifying
    @Query(value = "delete from agent where id_agent = ?1", nativeQuery = true)
	@Transactional
    void deleteAgentById(String id_agent);
	
}
