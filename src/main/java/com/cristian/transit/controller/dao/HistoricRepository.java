package com.cristian.transit.controller.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.cristian.transit.model.dto.Agent;
import com.cristian.transit.model.dto.Historic;

public interface HistoricRepository extends JpaRepository<Historic,Integer>{
	
	@Modifying
    @Query(value = "SELECT his.id_historic, ag.name_agent, ro.street, ro.number_street FROM agent AS ag, route AS ro, historicagentroute AS his WHERE ag.id_agent=his.id_agent AND ro.id_route=his.id_route AND ag.id_agent=?1", nativeQuery = true)
	@Transactional
    List<String> listHistoricByAgent(String id_agent);
	
	@Modifying
    @Query(value = "SELECT his.id_historic, ag.name_agent, ro.street, ro.number_street FROM agent AS ag, route AS ro, historicagentroute AS his WHERE ag.id_agent=his.id_agent AND ro.id_route=his.id_route AND ro.street=?1 AND ro.number_street=?2", nativeQuery = true)
	@Transactional
    List<String> listHistoricByStreet(String street, int number_street);
	
	@Modifying
    @Query(value = "SELECT level_congestion FROM route WHERE id_route=?1", nativeQuery = true)
	@Transactional
    List<Float> getLevelCongestion(int id_route);
}
