package com.iacg.app.exception.app.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.iacg.app.exception.app.exception.InvalidDataException;
import com.iacg.app.exception.app.exception.catalog.InvalidDataCatalog;
import com.iacg.app.exception.app.exception.catalog.LevelException;
import com.iacg.app.exception.app.model.Modelo;

@Repository
public class ModeloRepository {

	// Esta clase representa el origigen de datos

	public List<Modelo> findAll() {
		List<Modelo> listModelo = new ArrayList<>();

		listModelo.add(new Modelo("Objeto 1", "Atri 1", "Atri 2", "Atri 3", "Atri 4"));
		listModelo.add(new Modelo("Objeto 2", "Atri 1", "Atri 2", "Atri 3", "Atri 4"));
		listModelo.add(new Modelo("Objeto 3", "Atri 1", "Atri 2", "Atri 3", "Atri 4"));
		listModelo.add(new Modelo("Objeto 4", "Atri 1", "Atri 2", "Atri 3", "Atri 4"));
		listModelo.add(new Modelo("Objeto 5", "Atri 1", "Atri 2", "Atri 3", "Atri 4"));
		listModelo.add(new Modelo("Objeto 6", "Atri 1", "Atri 2", "Atri 3", "Atri 4"));

		return listModelo;
	}

	public Modelo getById(Long id) {
		Modelo modelo = null;
		if (id == 1) {
			modelo = Modelo.builder()
					.objeto("1")
					.atributo1("Attri 1")
					.atributo2("Attri 2")
					.atributo3("Attri 3")
					.atributo4("Attri 4")
					.build();
		}
		return modelo;
	}

	public Boolean existById(Long id) {
		if (1 == id)
			return true;
		return false;
	}
}
