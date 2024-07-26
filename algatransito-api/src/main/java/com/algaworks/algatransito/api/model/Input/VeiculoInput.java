package com.algaworks.algatransito.api.model.Input;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class VeiculoInput {

	@NotBlank
	@Size(max = 20)
	private String marca;

	@NotBlank
	@Size(max = 20)
	private String modelo;

	@NotBlank
	@Pattern(regexp = "[A-Z]{3}[0-9][0-9A-Z][0-9]{2}")
	private String placa;

	@NotBlank
	@Valid
	private ProprietarioIdInput proprietario;

}
