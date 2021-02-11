package com.cristian.transit.controller.dao;

import java.util.List;

import com.cristian.transit.model.dto.Historic;

public interface IHistoricDAO {
	List<String> listHistoricsByAgent(String id_agent);
	List<String> listHistoricsByStreet(String street, int number_street);
	Historic createHistoric(Historic historic);
	List<Float> getLevelCongestion(int id_route);
}
