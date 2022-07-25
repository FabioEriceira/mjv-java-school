package com.mjv.repository;

import com.mjv.model.cadastro.Cliente;
import com.mjv.model.cadastro.Endereco;

import java.util.HashMap;
import java.util.Map;

public class ClienteFakeRepository {
    private Map<Integer, Cliente> clientes = new HashMap();
    public ClienteFakeRepository() {
        Cliente paulo = new Cliente();
        paulo.setCpf("12312");
        paulo.setId(1);
        paulo.setNome("GLEYSON SAMPAIO");
        paulo.setWhatsapp("11958940362");
        Endereco endGleyson = new Endereco();
        endGleyson.setBairro("CENTRO");
        endGleyson.setNumero("SN");
        endGleyson.setLogradouro("RUA DO COMERCIO");
        paulo.setEndereco(endGleyson);

        //adicionando no mapa de clientes
        clientes.put(1, paulo);

        Cliente frank = new Cliente();
        frank.setCpf("986889089");
        frank.setId(2);
        frank.setNome("FRANK MARLON");
        frank.setWhatsapp("98954357976");
        Endereco endfrank = new Endereco();
        endfrank.setBairro("VILA MILITAR");
        endfrank.setNumero("123");
        endfrank.setLogradouro("AV DOS NAVIOS");
        frank.setEndereco(endfrank);

        //adicionando no mapa de clientes
        clientes.put(2, paulo);
    }
    public Cliente buscarPorId(Integer id) {
        return clientes.get(id);
    }
}

