package com.farmcont.domain;

import com.farmcont.domain.enums.EstadoPagamento;

import javax.persistence.*;

@Entity
@Table(name = "PAGAMENTOCARTAO")
public class PagamentoComCartao extends Pagamento {
    private static final long serialVersionUID = 1L;
    private Integer nParcelas;

    public PagamentoComCartao(){

    }
    public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer nParcelas) {
        super(id, estado, pedido);
        this.nParcelas = nParcelas;
    }

    public Integer getnParcelas() {
        return nParcelas;
    }

    public void setnParcelas(Integer nParcelas) {
        this.nParcelas = nParcelas;
    }
}
