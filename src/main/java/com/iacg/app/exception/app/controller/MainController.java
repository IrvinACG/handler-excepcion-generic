package com.iacg.app.exception.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iacg.app.exception.app.model.Modelo;
import com.iacg.app.exception.app.service.IModeloService;

@RestController
@RequestMapping("/modelos/v1/modelos")
public class MainController {

	@Autowired
	private IModeloService modeloService;
	
	@GetMapping
	public ResponseEntity<?> findAll(){
		List<Modelo> listModelos = modeloService.findAll();
		if(listModelos.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		return ResponseEntity.status(HttpStatus.OK).body(listModelos);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable("id") Long id){
		return ResponseEntity.status(HttpStatus.OK).body(modeloService.getById(id));
	}
}
