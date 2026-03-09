/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacao01;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Estudante {
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private char genero;
    private String matricula;
    private String email;
    
    public int obterIdade(Date hoje){
        int idade=0;
        return idade;
    }
    public Estudante(String nome, String cpf, Date dataNascimento, char genero, String matricula, String email) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setDataNascimento(dataNascimento);
        this.setGenero(genero);
        this.setMatricula(matricula);
        this.setEmail(email);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String _nome) {
        this.nome = _nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
