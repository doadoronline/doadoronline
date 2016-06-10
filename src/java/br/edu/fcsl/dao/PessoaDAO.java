/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fcsl.dao;

import br.edu.fcsl.entidade.Pessoa;

/**
 *
 * @author darlisson
 */
public class PessoaDAO extends GenericDAO<Pessoa> {

    public PessoaDAO() {
        super(Pessoa.class);
    }

}
