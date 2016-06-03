/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fcsl.dao;

import br.edu.fcsl.entidade.Solicitacao;

/**
 *
 * @author darlisson
 */
public class SolicitacaoDAO extends GenericDAO{
    
    private static SolicitacaoDAO instance;
      
    public SolicitacaoDAO(){
        super(Solicitacao.class);
    }
    
    
    public static SolicitacaoDAO getInstance() {
        if(instance==null){
            instance = new SolicitacaoDAO();
        }
        return instance;
    }
    
}
