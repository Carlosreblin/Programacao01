package com.mycompany.programacao01.cursos;

import com.mycompany.programacao01.Diciplina;
import com.mycompany.programacao01.Estudante;
import com.mycompany.programacao01.enums.Modalidade;
import com.mycompany.programacao01.enums.TipoDuracao;

import java.util.List;

public abstract class Curso {
    private String codigo;
    private String nome;
    private float ch;
    private byte duracao;
    private TipoDuracao tipoDuracao;
    private Modalidade modalidade;
    private boolean status;
    private List<Diciplina> diciplinas = new ArrayList<Diciplina>();

    public abstract void realizarMatricula();

    public List<Diciplina> obterDiciplinas(){
        return dicplinas;
    }

    public abstract List<Estudante> obterAlunosAtivos();

    public abstract List<Estudante> obterAlunosEgressos();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getCh() {
        return ch;
    }

    public void setCh(float ch) {
        this.ch = ch;
    }

    public byte getDuracao() {
        return duracao;
    }

    public void setDuracao(byte duracao) {
        this.duracao = duracao;
    }

    public TipoDuracao getTipoDuracao() {
        return tipoDuracao;
    }

    public void setTipoDuracao(TipoDuracao tipoDuracao) {
        this.tipoDuracao = tipoDuracao;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
