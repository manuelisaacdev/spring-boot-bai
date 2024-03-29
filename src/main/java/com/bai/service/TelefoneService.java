package com.bai.service;

import java.util.List;
import java.util.UUID;

import com.bai.model.Telefone;

public interface TelefoneService extends AbstractService<Telefone, UUID> {
	public List<Telefone> findAllByFuncionario(UUID idFuncionario);
	public Telefone createByFuncionario(UUID idFuncionario, Telefone telefone);
	public Telefone deleteByFuncionario(UUID idFuncionario, UUID idTelefone);
}
