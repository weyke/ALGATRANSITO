package com.algaworks.algatransito.domain.service;

import org.springframework.stereotype.Service;

import com.algaworks.algatransito.domain.model.Autuacao;
import com.algaworks.algatransito.domain.model.Veiculo;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class RegistroAutuacaoService {

	private RegistroVeiculoService registroVeiculoService;

	@Transactional
	public Autuacao registrar(Long veiculoId, Autuacao novaAutuacao) {
		Veiculo veiculo = registroVeiculoService.buscar(veiculoId);

		return veiculo.adicionarAutuacao(novaAutuacao);

	}

}