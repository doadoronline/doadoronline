/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fcsl.dao;

/**
 *
 * @author darlisson
 */
public class ProdutoServicoDAO extends GenericDAO{
    
    private static ProdutoServicoDAO instance;
      
    public ProdutoServicoDAO(){
        super(ProdutoServicoDAO.class);
    }
    
    
    public static ProdutoServicoDAO getInstance() {
        if(instance==null){
            instance = new ProdutoServicoDAO();
        }
        return instance;
    }
    
}
