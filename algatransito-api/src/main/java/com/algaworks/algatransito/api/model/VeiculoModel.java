package com.algaworks.algatransito.api.model;

import java.time.OffsetDateTime;

import com.algaworks.algatransito.domain.model.StatusVeiculo;

import lombok.Data;


@Data
public class VeiculoModel {

	 private Long id;
	    private ProprietarioResumoModel proprietario;
	    private String marca;
	    private String modelo;
	    private String numeroPlaca;
	    private StatusVeiculo status;
	    private OffsetDateTime dataCadastro;
	    private OffsetDateTime dataApreensao;

	}
