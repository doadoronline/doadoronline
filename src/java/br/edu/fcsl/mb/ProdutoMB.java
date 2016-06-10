/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fcsl.mb;

import br.edu.fcsl.dao.ProdutoDAO;
import br.edu.fcsl.entidade.Produto;
import br.edu.fcsl.util.FacesUtil;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author thiago
 */
@ManagedBean
@ViewScoped
public class ProdutoMB implements Serializable {

    private ProdutoDAO produtoDAO;
    private Produto produto;
    private List<Produto> produtos;
    private UploadedFile file;

    @PostConstruct
    public void init() {
        produtoDAO = new ProdutoDAO();
        produto = new Produto();
        produtos = produtoDAO.listar();
    }

    public ProdutoDAO getDao() {
        return produtoDAO;
    }

    public void setDao(ProdutoDAO produtoDAO) {
        this.produtoDAO = produtoDAO;
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
        produtoDAO.excluir(produto);
        produtos = produtoDAO.listar();
        produto = null;
    }

    public void visualizarAction() {
        
    }

    public void salvarAction() {
        produtoDAO.salvar(produto);
        produtos = produtoDAO.listar();
        FacesUtil.enviarMensagemSucesso("Produto cadastrado com sucesso!");
    }

    public void upload() {
        if (file != null) {
            //FacesMessage message = new FacesMessage("Sucesso", file.getFileName() + " is uploaded.");
            //FacesContext.getCurrentInstance().addMessage(null, message);
        }
    }
}
