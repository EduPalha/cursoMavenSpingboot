package com.farmcont.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "PEDIDO")
public class Pedido implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;
    private Date instante;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "pedido")
    private Pagamento pagamento;

//    @ManyToMany
//    @JoinColumn(name = "idCliente")
//    private Cliente cliente;

//    @ManyToMany
//    @JoinColumn(name="idEnderecoEntrega")
//    private Endereco enderecoEntrega;

    public Pedido() {
    }

    public Pedido(Integer id, Date instante, Cliente cliente, Endereco enderecoEntrega) {
        super();
        this.id = id;
        this.instante = instante;
//        this.pagamento = pagamento;
//        this.cliente = cliente;
//        this.enderecoEntrega = enderecoEntrega;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getInstante() {
        return instante;
    }

    public void setInstante(Date instante) {
        this.instante = instante;
    }

//    public Pagamento getPagamento() {
//        return pagamento;
//    }
//
//    public void setPagamento(Pagamento pagamento) {
//        this.pagamento = pagamento;
//    }

//    public Cliente getCliente() {
//        return cliente;
//    }
//
//    public void setCliente(Cliente cliente) {
//        this.cliente = cliente;
//    }

//    public Endereco getEnderecoEntrega() {
//        return enderecoEntrega;
//    }
//
//    public void setEnderecoEntrega(Endereco enderecoEntrega) {
//        this.enderecoEntrega = enderecoEntrega;
//    }

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
        Pedido other = (Pedido) obj;
        if(id == null){
            if(other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        return true;
    }
}
