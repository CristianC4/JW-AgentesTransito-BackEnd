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

import com.cristian.transit.controller.dao.RouteDAO;
import com.cristian.transit.model.dto.Route;

@CrossOrigin(origins = "http://localhost:4200" , maxAge = 3600)
@RestController
@RequestMapping({"/routes"})
public class ControllerRoute {
	@Autowired
	RouteDAO serviceRoute;
	
	@GetMapping
	public List<Route> listRoutes(){
		return serviceRoute.listRoutes();
	}

	@PostMapping
	public Route createAgent(@RequestBody Route route) {
		return serviceRoute.createRoute(route);
	}
	/*@GetMapping(path = {"/agents/{id_agent}"})
	public Agent findAgentById(@PathVariable("id_agent") String id) {
		return serviceAgent.findAgentById(id);
	}*/ 

	@PutMapping("/{id_route}")
	public Route updateRoute( @PathVariable("id_route") int id_route, @RequestBody Route route) {
		route.setId_route(id_route);
		return serviceRoute.updateRoute(route);
	}
	
	@DeleteMapping("/{id_route}")
	public void deleteRoute(@PathVariable("id_route") int id_route) {
		serviceRoute.deleteRoute(id_route);
	}
}
