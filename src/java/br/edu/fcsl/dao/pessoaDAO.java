/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fcsl.dao;

import br.edu.fcsl.entidade.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author darlisson
 */
public class pessoaDAO {
     private EntityManager entityManager;
     private static pessoaDAO instance;
     
     public static pessoaDAO getIntance(){
         if (instance ==null){
             instance = new pessoaDAO();
         }return instance;
     }
     
     public pessoaDAO(){
         entityManager = Persistence.createEntityManagerFactory("PU").createEntityManager();               
             }
        public void salvar(Pessoa pessoa){
            entityManager.getTransaction().begin();
            entityManager.merge(pessoa);
            entityManager.getTransaction().commit();
        }
        
        public void Excluir(Pessoa pessoa){
            entityManager.getTransaction().begin();
            entityManager.remove(pessoa);
            entityManager.getTransaction().commit();
        }
        
        public List<Pessoa> Listar(){
            return entityManager.createQuery("from Pessoa p order by p.nome").getResultList();
        }
        
        public Pessoa recuperar(Long id){
            return entityManager.find(Pessoa.class,id);
            
        }
        public List<Pessoa> recuperarProdutoNome(String nome){
            Query query= entityManager.createQuery(
                    "from Produto p where p.nome LIKE :nome ")
                    ;
            query.setParameter("nome","%"+nome+"%");
            return query.getResultList();
    
    
    
}
    
}
