package com.cristian.transit.controller.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.cristian.transit.model.dto.Route;

public interface RouteRepository extends JpaRepository<Route,Integer>{
}
