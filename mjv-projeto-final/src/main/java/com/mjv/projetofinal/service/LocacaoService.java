package com.mjv.projetofinal.service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mjv.projetofinal.model.cadastro.Equipamento;
import com.mjv.projetofinal.model.locacao.Locacao;
import com.mjv.projetofinal.model.locacao.LocacaoItem;
import com.mjv.projetofinal.repository.EquipamentoRepository;
import com.mjv.projetofinal.repository.LocacaoRepository;

@Service
public class LocacaoService {
	@Autowired
    private LocacaoRepository locacaoRepository;
	
	@Autowired
	private EquipamentoRepository equipRepository;
	
	@Transactional
	public  void calcularLocacao(Locacao locacao) {
		
		Integer qtDias = calcularDias(locacao.getDataDevolucao(), locacao.getDataRetirada());
				
		Double vTotal = 0.0;
				
		for (LocacaoItem it : locacao.getItens()) {
			vTotal += it.getSubtotal()*qtDias;
			it.setQtdDiasLocacao(qtDias);
			Equipamento equi = equipRepository.findById(it.getEquipamentoId()).orElse(null);
			if(equi!=null) {
				equi.setQtdDisponivel(equi.getQtdDisponivel() - 1);
				equipRepository.save(equi);
			}
		}
		locacao.setValorFinal(vTotal);
		locacaoRepository.save(locacao);
	}
	
	public Integer calcularDias(LocalDateTime devolucao, LocalDateTime retirada) {
		Integer qtDias = Math.toIntExact(ChronoUnit.DAYS.between(retirada, devolucao));
		return qtDias;
	}
	
	
	
}	
	


