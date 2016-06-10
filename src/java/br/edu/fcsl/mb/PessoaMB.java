/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fcsl.mb;

import br.edu.fcsl.dao.pessoaDAO;
import br.edu.fcsl.entidade.Pessoa;
import br.edu.fcsl.util.FacesUtil;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Elias
 */
@ManagedBean
@ViewScoped
public class PessoaMB implements Serializable {

    private Pessoa pessoa;
    private List<Pessoa> pessoas;
    private pessoaDAO pessoaDAO;
    private boolean visualizar;

    public void setVisualizar(boolean visualizar) {
        this.visualizar = visualizar;
    }

    public boolean isVisualizar() {
        return visualizar;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void novoAction() {
        visualizar = false;
        pessoa = new Pessoa();
    }

    @PostConstruct
    public void init() {
        pessoaDAO = new pessoaDAO();
        pessoas = pessoaDAO.listar();
    }

    public void salvarAction() {
        visualizar = false;
        pessoaDAO.salvar(pessoa);
        pessoas = pessoaDAO.listar();
        FacesUtil.enviarMensagemSucesso("Pessoa cadastrada com sucesso!");
    }

    public boolean isPessoaExcluivel() {
        return pessoa != null && pessoa.getId() > 0;
    }

    public void excluir() {
        pessoaDAO.excluir(pessoa);
        FacesUtil.enviarMensagemSucesso("Pessoa excluída com sucesso!");
        pessoas = pessoaDAO.listar();
    }

    public void visualizarAction() {
        visualizar = true;
    }

    public void alterarAction() {
        if (pessoa == null || pessoa.getId().equals(0L)) {
            visualizar = true;
        }
    }
}
