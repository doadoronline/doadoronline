/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fcsl.entidade;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.ws.rs.Encoded;

/**
 *
 * @author Elias
 */
@Entity
public class Solicitacao implements Serializable {

    private Long id;
    private Pessoa pessoaSolicitante;
    private Produto produtoSolicitado;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    public Pessoa getPessoaSolicitante() {
        return pessoaSolicitante;
    }

    public void setPessoaSolicitante(Pessoa pessoaSolicitante) {
        this.pessoaSolicitante = pessoaSolicitante;
    }

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    public Produto getProdutoSolicitado() {
        return produtoSolicitado;
    }

    public void setProdutoSolicitado(Produto produtoSolicitado) {
        this.produtoSolicitado = produtoSolicitado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Solicitacao other = (Solicitacao) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
