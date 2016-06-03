/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fcsl.dao;

import br.edu.fcsl.entidade.Categoria;

/**
 *
 * @author darlisson
 */
public class CategoriaDAO  extends GenericDAO{
    
    private static CategoriaDAO instance;
      
    public CategoriaDAO(){
        super(Categoria.class);
    }
    
    
    public static CategoriaDAO getInstance() {
        if(instance==null){
            instance = new CategoriaDAO();
        }
        return instance;
    }
    
}
