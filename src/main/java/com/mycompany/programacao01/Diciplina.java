/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacao01;

/**
 *
 * @author aluno
 */
public class Diciplina {
    private String codigo;
    private String nome;
    private int cargaHoraria;
    private String ementa;
    private String objetivos[];
    private String conteudosProgramaticos[];
    private String referenciasBibliograficas[];

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public String[] getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String[] objetivos) {
        this.objetivos = objetivos;
    }

    public String[] getConteudosProgramaticos() {
        return conteudosProgramaticos;
    }

    public void setConteudosProgramaticos(String[] conteudosProgramaticos) {
        this.conteudosProgramaticos = conteudosProgramaticos;
    }

    public String[] getReferenciasBibliograficas() {
        return referenciasBibliograficas;
    }

    public void setReferenciasBibliograficas(String[] referenciasBibliograficas) {
        this.referenciasBibliograficas = referenciasBibliograficas;
    }

}
