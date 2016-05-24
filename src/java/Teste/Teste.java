/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import br.edu.fcsl.util.CriaConexao;
import javax.persistence.EntityManager;

/**
 *
 * @author Elias
 */
public class Teste {

    public static void main(String[] args) {
        EntityManager entityManager = CriaConexao.getEntityManager();
    }
}
