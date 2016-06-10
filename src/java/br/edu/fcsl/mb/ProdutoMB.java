/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fcsl.mb;

import br.edu.fcsl.dao.ProdutoDAO;
import br.edu.fcsl.entidade.Produto;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author thiago
 */
@ManagedBean
@ViewScoped
public class ProdutoMB implements Serializable {

    private ProdutoDAO dao;
    private Produto produto;
    private List<Produto> produtos;
    private UploadedFile file;

    @PostConstruct
    public void init() {
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

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public void novoAction() {
        produto = new Produto();
    }

    public void alterarAction() {

    }

    public void excluirAction() {
        dao.excluir(produto);
        produtos = dao.listar();
        produto = null;
    }

    public void visualizarAction() {

    }

    public void salvarAction() {
        dao.salvar(produto);
        produtos = dao.listar();
    }

    public void upload() {
        if (file != null) {
            //FacesMessage message = new FacesMessage("Sucesso", file.getFileName() + " is uploaded.");
            //FacesContext.getCurrentInstance().addMessage(null, message);
        }
    }
}
