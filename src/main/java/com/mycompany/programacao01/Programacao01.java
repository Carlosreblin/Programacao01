/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programacao01;

/**
 *
 * @author aluno
 */
public class Programacao01 {

    public static void main(String[] args) {
        Estudante camada = new Estudante();
        Estudante leonardo = new Estudante();
        Estudante jefferson = new Estudante();
        
        camada.setNome("Marcos");
        leonardo.setNome("leonardo");
        jefferson.setNome("jefferson");
        
        System.out.println(camada.getNome());
        System.out.println(leonardo.getNome());
        System.out.println(jefferson.getNome());
    }
}
