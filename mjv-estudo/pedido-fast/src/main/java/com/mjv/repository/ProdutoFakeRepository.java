package com.mjv.repository;

import com.mjv.model.cadastro.Produto;

import java.util.HashMap;
import java.util.Map;

public class ProdutoFakeRepository {
    private Map<Integer, Produto> produtos = new HashMap();
    public ProdutoFakeRepository() {
        Produto cocacola = new Produto();
        cocacola.setDescricao("COLA COLA LATA 350ml");
        cocacola.setId(1);
        cocacola.setPrecoVenda(3.75d);
        cocacola.setSaldo(13.0);

        produtos.put(1, cocacola);

        Produto pizza = new Produto();
        pizza.setDescricao("PIZZA DOBRADA 4 QUEIJOS");
        pizza.setId(2);
        pizza.setPrecoVenda(7.40d);
        pizza.setSaldo(8.0);

        produtos.put(2, pizza);
    }
    public Produto buscarPorId(Integer id) {
        return produtos.get(id);
    }
}

