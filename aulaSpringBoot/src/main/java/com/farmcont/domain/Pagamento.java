package com.farmcont.domain;

import com.farmcont.domain.enums.EstadoPagamento;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.JOINED) //na super classe tu faz isso para relacionar as subclasses
@Table(name = "PAGAMENTO")
public class Pagamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;
    private Integer estadoAtual;

    @OneToOne
    @JoinColumn(name = "idPedido")
    @MapsId
    private Pedido pedido;

    public Pagamento() {
    }


    public Pagamento(Integer id, Integer estadoAtual, Pedido pedido) {
        super();
        this.id = id;
        this.estadoAtual = estadoAtual;
        this.pedido = pedido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(Integer estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pagamento other = (Pagamento) obj;
        if(id == null){
            if(other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        return true;
    }
}
