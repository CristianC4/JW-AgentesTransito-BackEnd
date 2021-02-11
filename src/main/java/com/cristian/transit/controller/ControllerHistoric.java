package com.cristian.transit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cristian.transit.controller.dao.HistoricDAO;
import com.cristian.transit.model.dto.Historic;

@CrossOrigin(origins = "http://localhost:4200" , maxAge = 3600)
@RestController
@RequestMapping({"/historics"})
public class ControllerHistoric {
	@Autowired
	HistoricDAO serviceHistoric;
	@GetMapping("/{id_agent}")
	public List<String> listHistoricByAgent( @PathVariable("id_agent") String id_agent){
		return serviceHistoric.listHistoricsByAgent(id_agent);
	}
	@GetMapping("/{street}/{number_street}")
	public List<String> listHistoricByStreet( @PathVariable("street") String street,  @PathVariable("number_street") int number){
		return serviceHistoric.listHistoricsByStreet(street, number);
	}
	@PostMapping
	public Historic createHistoric(@RequestBody Historic historic) {
		return serviceHistoric.createHistoric(historic);
	}
}
