/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fcsl.dao;

import br.edu.fcsl.entidade.Comunicacao;

/**
 *
 * @author darlisson
 */
public class ComunicacaoDAO extends GenericDAO{
    private static ComunicacaoDAO instance;
      
    public ComunicacaoDAO(){
        super(Comunicacao.class);
    }
    
    
    public static ComunicacaoDAO getInstance() {
        if(instance==null){
            instance = new ComunicacaoDAO();
        }
        return instance;
    }
    
}
