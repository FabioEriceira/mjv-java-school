package com.mjv.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjv.projetofinal.model.cadastro.Equipamento;
import com.mjv.projetofinal.repository.EquipamentoRepository;

@RestController
@RequestMapping("/equipamentos") 
public class EquipamentoController {

	@Autowired					
	private EquipamentoRepository equipamentoRepository;
	
	@PostMapping 				 
	public void gravar(@RequestBody Equipamento equipamento) {  
		equipamentoRepository.save(equipamento); 
	}
	
	@PutMapping								
	public void alterar(@RequestBody Equipamento equipamento){
		equipamentoRepository.save(equipamento);
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable ("id") Integer id) {
		equipamentoRepository.deleteById(id);
	}
	
	@GetMapping								
	public List<Equipamento> listar(){
		return equipamentoRepository.findAll();	 
	}
	
	@GetMapping("/{id}")								
	public Equipamento buscar(@PathVariable ("id") Integer id){
		return equipamentoRepository.findById(id).orElse(null);	 
	}
}
