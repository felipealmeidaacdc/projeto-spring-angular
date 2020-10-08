package com.example.tcesp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tcesp.api.model.Lancamento;
import com.example.tcesp.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
