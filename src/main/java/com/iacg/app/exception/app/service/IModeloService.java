package com.iacg.app.exception.app.service;

import java.util.List;

import com.iacg.app.exception.app.model.Modelo;

public interface IModeloService {

	List<Modelo> findAll();
	Modelo getById(Long id);
}
