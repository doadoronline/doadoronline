/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fcsl.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Elias
 */
public class CriaConexao {

    private static EntityManagerFactory factory;

    protected static void criarSessionFactory() {
        // A SessionFactory is set up once for an application
        factory = Persistence.createEntityManagerFactory("doadoronline");
    }

    public static EntityManager getEntityManager() {
        if (factory == null) {
            criarSessionFactory();
        }
        return factory.createEntityManager();
    }
}
