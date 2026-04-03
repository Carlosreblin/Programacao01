/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacao01;

import com.mycompany.programacao01.enums.NivelEnsino;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Estudante {
    private static String nome;
    private String cpf;
    private Date dataNascimento;
    private char genero;
    private String matricula;
    private String email;
    private String telefone;
    private int anoIngresso;
    private int semestreIngresso;
    private boolean situacaoAcademica;
    private NivelEnsino nivelEnsino;
    private String digito;
    
    private int obterIdade(Date hoje){
        int idade=0;
        return idade;
    }
    public static String getNome() {
        return nome;
    }

    public static void setNome(String _nome) {
        Estudante.nome = _nome;
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
        return String.valueOf(anoIngresso).toString()+String.valueOf(semestreIngresso).toString()+digito;
    }
    public void setMatricula(String digito) {
        this.digito = digito;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public boolean isAprovado() {
        return situacaoAcademica;
    }

    public void setAprovado(boolean aprovado) {
        this.situacaoAcademica = aprovado;
    }

    public NivelEnsino getNivelEnsino() {
        return nivelEnsino;
    }

    public void setNivelEnsino(NivelEnsino nivelEnsino) {
        this.nivelEnsino = nivelEnsino;
    }

}

