package com.cristian.transit.controller.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristian.transit.model.dto.Route;

@Service
public class RouteDAO implements IRouteDAO {

	@Autowired
	private RouteRepository repository;
	
	@Override
	public List<Route> listRoutes() {
		return repository.findAll();
	}

	@Override
	public Route createRoute(Route route) {
		return repository.save(route);
	}

	@Override
	public Route updateRoute(Route route) {
		return repository.save(route);
	}

	@Override
	public void deleteRoute(int id_route) {
		repository.deleteById(id_route);
	}
}
