/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fcsl.mb;

import br.edu.fcsl.dao.ProdutoDAO;
import br.edu.fcsl.entidade.Produto;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author thiago
 */
@ManagedBean
@ViewScoped
public class ProdutoMB {
    
    private ProdutoDAO dao;
    private Produto produto;
    private List<Produto> produtos;
    
    @PostConstruct
    public void init(){
        dao = ProdutoDAO.getInstance();
        produto = new Produto();
        produtos = dao.listar();
    }

    public ProdutoDAO getDao() {
        return dao;
    }

    public void setDao(ProdutoDAO dao) {
        this.dao = dao;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
    public void novoAction(){
        
    }
    
    public void salvarAction(){
        
    }
    
    public void alterarAction(){
        
    }
    
    public void excluirAction(){
        
    }
    
    public void visualizarAction(){
        
    }
}
