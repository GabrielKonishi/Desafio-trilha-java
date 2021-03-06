package com.trilha.back.finacys.repository;

import com.trilha.back.finacys.entity.Lancamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{
	
	@Query(value = "select l from Lancamento l where paid = ?1")
	public List<Lancamento> listarLancamentosPagos(boolean paid);

}


