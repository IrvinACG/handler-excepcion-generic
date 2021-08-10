package com.iacg.app.exception.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Modelo {

	private String objeto;
	private String atributo1;
	private String atributo2;
	private String atributo3;
	private String atributo4;
	
}
