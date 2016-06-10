/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fcsl.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author darlisson
 */
public class GenericDAO<T> {

    private EntityManager em;
    private Class classe;

    public GenericDAO(Class classe) {
        em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        this.classe = classe;
    }

    public void salvar(T objeto) {
        em.getTransaction().begin();
        em.merge(objeto);
        em.getTransaction().commit();

    }

    public void excluir(T objeto) {
        em.getTransaction().begin();
        em.remove(objeto);
        em.getTransaction().commit();

    }

    public T recuperar(Long id) {

        return (T) em.find(classe, id);
    }

    public List<T> listar() {
        return em.createQuery("from" + classe.getSimpleName() + " e").getResultList();
    }

}
