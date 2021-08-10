package com.iacg.app.exception.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.iacg.app.exception.app.exception.BusinessException;
import com.iacg.app.exception.app.exception.GenericException;
import com.iacg.app.exception.app.exception.InvalidDataException;
import com.iacg.app.exception.app.exception.catalog.BusinessCatalog;
import com.iacg.app.exception.app.exception.catalog.InvalidDataCatalog;
import com.iacg.app.exception.app.exception.catalog.LevelException;
import com.iacg.app.exception.app.model.Modelo;
import com.iacg.app.exception.app.repository.ModeloRepository;

@Service
public class ModeloService implements IModeloService {

	@Autowired
	private ModeloRepository modeloRepository; 
	
	@Override
	public List<Modelo> findAll() {
		List<Modelo> listModelo = modeloRepository.findAll();
		listModelo.clear();
		if(listModelo.isEmpty()) {
			throw new BusinessException(HttpStatus.BAD_REQUEST,	//HttpSataus
					BusinessCatalog.ERROR001.getCode(), //Code
					BusinessCatalog.ERROR001.getMessage(),	//Message	//No se encontro recurso
					LevelException.ERROR.toString(),	//Level 
					"Agregar descripcion del error, complemento del message"); //Description
		}
		return listModelo;
	}

	@Override
	public Modelo getById(Long id) {
		if(!modeloRepository.existById(id)) {
			throw new InvalidDataException(HttpStatus.BAD_REQUEST,
					InvalidDataCatalog.ERROR003.getCode(),
					InvalidDataCatalog.ERROR003.getMessage(), 
					LevelException.WARN.toString(),
					"No se encontro recurso en la BD");
		}

		return modeloRepository.getById(id);
	}


}
