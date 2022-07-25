package com.mjv.model.pedido;

import com.mjv.model.cadastro.Cliente;

public class PedidoItem {

    private Integer id;
    private Double quantidade;
    private Double valorUnitario;
    private Double subTotal;
    //Em alguns projetos usa-se o próprio produto, mas hoje as API's Rest usam mais somente o id
    private Integer idProduto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    @Override
    public String toString() {
        return "PedidoItem{" +
                "id=" + id +
                ", quantidade=" + quantidade +
                ", valorUnitario=" + valorUnitario +
                ", subTotal=" + subTotal +
                ", idProduto=" + idProduto +
                '}';
    }
}
