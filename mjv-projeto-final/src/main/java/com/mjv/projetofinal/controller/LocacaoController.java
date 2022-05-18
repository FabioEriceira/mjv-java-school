package com.mjv.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjv.projetofinal.model.cadastro.Cliente;
import com.mjv.projetofinal.model.locacao.Locacao;
import com.mjv.projetofinal.repository.LocacaoRepository;
import com.mjv.projetofinal.service.LocacaoService;

@RestController
@RequestMapping("/locacoes") 
public class LocacaoController {

	@Autowired						
	private LocacaoRepository locacaoRepository;
	
	@Autowired
	private LocacaoService locacaoService;
	
	@PostMapping
	public void calcularLocacao(@RequestBody Locacao locacao) {
		locacaoService.calcularLocacao(locacao);
	}

	@GetMapping								
	public List<Locacao> listar(){
		return locacaoRepository.findAll(); 
	}
	
	@GetMapping("/{id}")								
	public Locacao buscar(@PathVariable ("id") Integer id){
		return locacaoRepository.findById(id).orElse(null);	 
	}
}
