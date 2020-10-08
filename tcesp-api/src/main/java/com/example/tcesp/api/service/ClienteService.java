package com.example.tcesp.api.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.tcesp.api.model.Cliente;
import com.example.tcesp.api.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;

	public Cliente atualizar(Long codigo, Cliente cliente) {
		Cliente clienteSalva = buscarClientePeloCodigo(codigo);
		
		BeanUtils.copyProperties(cliente, clienteSalva, "codigo");
		return clienteRepository.save(clienteSalva);
	}


	public Cliente buscarClientePeloCodigo(Long codigo) {
		Optional<Cliente> clienteSalva = clienteRepository.findById(codigo);
		if (!clienteSalva.isPresent()) {
			throw new EmptyResultDataAccessException(1);
		}
		return clienteSalva.get();
	}
	
	public Page<Cliente> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return clienteRepository.findAll(pageRequest);
	}
	
}
