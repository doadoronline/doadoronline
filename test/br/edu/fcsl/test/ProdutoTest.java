/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fcsl.test;

import br.edu.fcsl.dao.ProdutoDAO;
import br.edu.fcsl.entidade.Produto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author thiago
 */
public class ProdutoTest {

    private ProdutoDAO dao = ProdutoDAO.getInstance();
    private Produto produto;

    public ProdutoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        produto = new Produto();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void salvar() {
        produto.setNome("TEST1");
        
        /*
        int tamanho = dao.listar().size();
        dao.salvar(produto);
        assertEquals(tamanho + 1, dao.listar().size());*/

    }
}
