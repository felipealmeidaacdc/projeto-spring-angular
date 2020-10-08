package com.example.tcesp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tcesp.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
