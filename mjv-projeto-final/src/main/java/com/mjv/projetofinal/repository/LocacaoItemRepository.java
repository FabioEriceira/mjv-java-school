package com.mjv.projetofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjv.projetofinal.model.locacao.LocacaoItem;

public interface LocacaoItemRepository extends JpaRepository<LocacaoItem, Integer>{

}
