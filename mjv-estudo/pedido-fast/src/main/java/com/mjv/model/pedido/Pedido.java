package com.mjv.model.pedido;

import com.mjv.model.cadastro.Cliente;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {

    private Integer id;
    private LocalDateTime dataHora;
    private Double valorTotal;
    private List<PedidoItem> itens;
    private Cliente cliente;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<PedidoItem> getItens() {
        return itens;
    }

    public void setItens(List<PedidoItem> itens) {
        this.itens = itens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", dataHora=" + dataHora +
                ", valorTotal=" + valorTotal +
                ", itens=" + itens +
                ", cliente=" + cliente +
                '}';
    }
}
