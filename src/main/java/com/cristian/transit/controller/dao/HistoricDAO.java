package com.cristian.transit.controller.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristian.transit.model.dto.Historic;

@Service
public class HistoricDAO implements IHistoricDAO{
	
	@Autowired
	private HistoricRepository repository;
	@Override
	public List<String> listHistoricsByAgent(String id_agent) {
		// TODO Auto-generated method stub
		return repository.listHistoricByAgent(id_agent);
	}

	@Override
	public List<String> listHistoricsByStreet(String street, int number_street) {
		// TODO Auto-generated method stub
		return repository.listHistoricByStreet(street, number_street);
	}

	@Override
	public Historic createHistoric(Historic historic) {
		Float level = repository.getLevelCongestion(historic.getId_route()).get(0);
		if(level >= 30) {
			return repository.save(historic);
		}else {
			return null;
		}		
	}

	@Override
	public List<Float> getLevelCongestion(int id_route) {
		return repository.getLevelCongestion(id_route);
	}

}
