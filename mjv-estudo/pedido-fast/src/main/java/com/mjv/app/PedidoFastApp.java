package com.mjv.app;

import com.mjv.model.cadastro.Cliente;
import com.mjv.model.cadastro.Produto;
import com.mjv.model.pedido.Pedido;
import com.mjv.model.pedido.PedidoItem;
import com.mjv.repository.ClienteFakeRepository;
import com.mjv.repository.ProdutoFakeRepository;
import com.mjv.service.PedidoService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PedidoFastApp {
    public static void main(String[] args) {
        ClienteFakeRepository clienteRepository = new ClienteFakeRepository();
        Cliente cliente = clienteRepository.buscarPorId(2);
        Pedido pedido1 = new Pedido();
        pedido1.setCliente(cliente);
        pedido1.setId(100212);
        pedido1.setDataHora(LocalDateTime.now());
        pedido1.setValorTotal(0.0);// Vai mudar na hora da conclusao

        ProdutoFakeRepository produtoRepository = new ProdutoFakeRepository();

        Produto produtoSelecionado = produtoRepository.buscarPorId(1);
        System.out.println("Produto Selecionado foi "+ produtoSelecionado.getDescricao());
        List<PedidoItem> itens = new ArrayList();
        //Aqui precisamos de uma classe histórica de como os produtos foram vendidos em cada pedido
        PedidoItem item1 = new PedidoItem();
        item1.setId(1001);
        item1.setIdProduto(produtoSelecionado.getId());
        item1.setQuantidade(2.0);
        //Recebe o valor do preco de vendo do produto mas poderia receber outro por isso do campo fato histórico
        item1.setValorUnitario(produtoSelecionado.getPrecoVenda());
        //Observem que isso poderia ser encapulado na hora da API vai sofrer alguns ajustes
        item1.setSubTotal(item1.getQuantidade() * item1.getValorUnitario());
        //adicionando o item no carrinho
        itens.add(item1);

        produtoSelecionado = produtoRepository.buscarPorId(2);
        System.out.println("Produto Selecionado foi "+ produtoSelecionado.getDescricao());

        PedidoItem item2 = new PedidoItem();
        item2.setId(1002);
        item2.setIdProduto(produtoSelecionado.getId());
        item2.setQuantidade(2.0);
        //Recebe o valor do preco de vendo do produto mas poderia receber outro por isso do campo fato histórico
        item2.setValorUnitario(produtoSelecionado.getPrecoVenda());
        //Observem que isso poderia ser encapulado na hora da API vai sofrer alguns ajustes
        item2.setSubTotal(item1.getQuantidade() * item1.getValorUnitario());
        //Adicionando o item no carrinho
        itens.add(item2);
        //Agora o pedido precisa saber os itens do carrinho
        pedido1.setItens(itens);

        PedidoService service = new PedidoService();
        service.concluir(pedido1);

    }
}
