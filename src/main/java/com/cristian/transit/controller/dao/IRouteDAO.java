package com.cristian.transit.controller.dao;

import java.util.List;

import com.cristian.transit.model.dto.Route;

public interface IRouteDAO {
	List<Route> listRoutes();
	Route createRoute(Route route);
	Route updateRoute(Route route);
	void deleteRoute(int id_route);
}
