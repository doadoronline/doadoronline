/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fcsl.dao;

import br.edu.fcsl.entidade.Endereco;

/**
 *
 * @author darlisson
 */
public class EnderecoDAO extends GenericDAO{
     private static EnderecoDAO instance;
      
    public EnderecoDAO(){
        super(Endereco.class);
    }
    
    
    public static EnderecoDAO getInstance() {
        if(instance==null){
            instance = new EnderecoDAO();
        }
        return instance;
    }
    
}
