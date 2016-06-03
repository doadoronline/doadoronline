/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fcsl.dao;

import br.edu.fcsl.entidade.Pessoa;
import static com.mchange.v2.log.MLog.instance;


/**
 *
 * @author darlisson
 */
public class pessoaDAO extends GenericDAO{
      private static pessoaDAO instance;
      
      
    public pessoaDAO(){
        super(Pessoa.class);
    }
    
    
    public static pessoaDAO getInstance() {
        if(instance==null){
            instance = new pessoaDAO();
        }
        return instance;
    }
}