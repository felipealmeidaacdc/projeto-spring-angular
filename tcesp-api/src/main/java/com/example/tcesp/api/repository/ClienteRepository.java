package com.example.tcesp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tcesp.api.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
