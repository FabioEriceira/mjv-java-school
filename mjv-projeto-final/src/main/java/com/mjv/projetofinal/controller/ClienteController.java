package com.mjv.projetofinal.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjv.projetofinal.model.cadastro.Cliente;
import com.mjv.projetofinal.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes") // toda vez que uma pessoa quiser algo de clientes terá uma funcionalidade de cliente
public class ClienteController {

	@Autowired								//Vou conseguir usar o repositorio do cliente sem instanciar, usando todas as funcionalidades do método
	private ClienteRepository clienteRepository;
	
	@PostMapping 										// eu quero gravar na web eu uso um POST direcionada ao cliente, e já traz todos os métodos. 
	public void gravar(@RequestBody Cliente cliente) {  // neste caso vou o usar o método save() passando só o cliente que será salvo
		clienteRepository.save(cliente); 
		
	}
	
	@GetMapping										// obtem os clientes que estão no banco de dados
	public List<Cliente> listar(){
		return clienteRepository.findAll();			// o repositorio delega, ou informa os clientes 
	}

	
//	@DeleteMapping("/{id}")
//	public void deletar(@PathVariable ("id") Integer id) {
//		clienteRepository.deleteById(id);
//	}
}
