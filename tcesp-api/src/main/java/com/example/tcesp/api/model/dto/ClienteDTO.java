package com.example.tcesp.api.model.dto;

import com.example.tcesp.api.model.Cliente;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClienteDTO {
	
	
    private Long codigo;
	
	private String nome;
	
	private String email;
	
	private String cpf;
	
	
	public ClienteDTO(){
		
	}
	
	public ClienteDTO(Cliente obj) {
		codigo = obj.getCodigo();
		nome = obj.getNome();
		email = obj.getEmail();
		cpf = obj.getCpf();
	}

}
