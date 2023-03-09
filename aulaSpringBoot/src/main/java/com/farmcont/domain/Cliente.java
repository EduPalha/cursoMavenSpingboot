package com.farmcont.domain;

import com.farmcont.domain.enums.TipoCliente;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "CLIENTE")
public class Cliente implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Column(name = "NOME", length = 50, nullable = false)
    private String nome;
    @Column(name = "EMAIL", length = 50, nullable = false)
    private String email;
    @Column(name = "CPFOUCNPJ", length = 14, nullable = false)
    private String cpfOuCnpj;
    @Column(name = "TIPOCLIENTE", length = 20, nullable = false)
    private Integer tipo;

//    @JsonManagedReference
//    @OneToMany(mappedBy = "cliente")
//    private List<Endereco> enderecos = new ArrayList<>();

    //Set é um conjunto de Strings que não aceitam repetição
    @ElementCollection
    @CollectionTable(name = "TELEFONE")
    private Set<String> telefones = new HashSet<>();

//    @OneToOne(mappedBy = "cliente")
//    private List<Pedido> pedidos = new ArrayList<>();

    public Cliente(){

    }
    public Cliente(Integer id, String nome, String email, String cpfOuCnpj, Integer tipo) {
        super();
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpfOuCnpj = cpfOuCnpj;
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpfOuCnpj() {
        return cpfOuCnpj;
    }

    public void setCpfOuCnpj(String cpfOuCnpj) {
        this.cpfOuCnpj = cpfOuCnpj;
    }

    public TipoCliente getTipo() {
        return TipoCliente.toEnum(tipo);
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo.getCod();
    }

//    public List<Endereco> getEnderecos() {
//        return enderecos;
//    }
//
//    public void setEnderecos(List<Endereco> enderecos) {
//        this.enderecos = enderecos;
//    }

    public Set<String> getTelefones() {
        return telefones;
    }

    public void setTelefones(Set<String> telefones) {
        this.telefones = telefones;
    }

//    public List<Pedido> getPedidos() {
//        return pedidos;
//    }
//    public void setPedidos(List<Pedido> pedidos) {
//        this.pedidos = pedidos;
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
        Cliente other = (Cliente) obj;
        if(id == null){
            if(other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        return true;
    }
}
