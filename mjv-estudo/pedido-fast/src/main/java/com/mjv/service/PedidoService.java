package com.mjv.service;

import com.mjv.model.pedido.Pedido;
import com.mjv.model.pedido.PedidoItem;

import java.util.List;

public class PedidoService {
    //Aqui há toda lógica de negócio do sistema relacionado ao pedido
    public void concluir(Pedido pedido) {
        Double valorTotalPedido = 0.0d;
        List<PedidoItem> itens = pedido.getItens();
        for (PedidoItem item : itens) {
            valorTotalPedido = valorTotalPedido + item.getSubTotal();
        }
        pedido.setValorTotal(valorTotalPedido);
        //Ufa parece que o pedido foi concluido, podemos imprimir ou gravar no banco
    }
}
