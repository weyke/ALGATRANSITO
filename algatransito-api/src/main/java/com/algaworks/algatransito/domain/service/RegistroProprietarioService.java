package com.algaworks.algatransito.domain.service;

import org.springframework.stereotype.Service;

import com.algaworks.algatransito.domain.exception.NegocioException;
import com.algaworks.algatransito.domain.model.Proprietario;
import com.algaworks.algatransito.domain.repository.ProprietarioRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class RegistroProprietarioService {

	private final ProprietarioRepository proprietarioRepository;

	@org.springframework.transaction.annotation.Transactional
	public Proprietario salvar(Proprietario proprietario) {
		boolean emailEmUso = proprietarioRepository.findByEmail(proprietario.getEmail()).isPresent();

		if (emailEmUso) {
			throw new NegocioException("Já existe um proprietário cadastrado com este e-mail");

		}

		return proprietarioRepository.save(proprietario);

	}

	@org.springframework.transaction.annotation.Transactional
	public void excluir(Long proprietarioId) {
		proprietarioRepository.deleteById(proprietarioId);

	}

	public Proprietario buscar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}