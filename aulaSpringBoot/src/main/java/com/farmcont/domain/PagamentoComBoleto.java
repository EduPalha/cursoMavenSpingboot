package com.farmcont.domain;

import com.farmcont.domain.enums.EstadoPagamento;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PAGAMENTOBOLETO")
public class PagamentoComBoleto extends Pagamento {
    private static final long serialVersionUID = 1L;
    private Date dataVencimento;
    private Date dataPagamento;

    public PagamentoComBoleto(){

    }
    public PagamentoComBoleto(Integer id, Integer estado, Pedido pedido, Date dataVencimento, Date dataPagamento) {
        super(id, estado, pedido);
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

}
