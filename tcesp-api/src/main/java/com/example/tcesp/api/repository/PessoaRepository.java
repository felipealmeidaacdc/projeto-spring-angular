package com.example.tcesp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tcesp.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
