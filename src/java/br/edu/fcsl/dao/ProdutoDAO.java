/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fcsl.dao;


import br.edu.fcsl.entidade.Produto;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author darlisson
 */
public class ProdutoDAO extends GenericDAO{
    private static ProdutoDAO instance;
      
    public ProdutoDAO(){
        super(Produto.class);
    }
    
    
    public static ProdutoDAO getInstance() {
        if(instance==null){
            instance = new ProdutoDAO();
        }
        return instance;
    }
    }
    
    

