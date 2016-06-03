/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fcsl.dao;

import br.edu.fcsl.entidade.Foto;

/**
 *
 * @author darlisson
 */
public class FotoDAO extends GenericDAO{
    
    private static FotoDAO instance;
      
    public FotoDAO(){
        super(Foto.class);
    }
    
    
    public static FotoDAO getInstance() {
        if(instance==null){
            instance = new FotoDAO();
        }
        return instance;
    }
    
    
}
