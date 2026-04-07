package com.mycompany.programacao01.cursos;

import com.mycompany.programacao01.Diciplina;
import com.mycompany.programacao01.Estudante;
import com.mycompany.programacao01.enums.TipoGraduacao;

import java.util.List;

public class CursoGraduacao extends Curso{
    private TipoGraduacao tipoGraduacao;
    private boolean tccObrigatorio;

    public boolean validarTcc(){

    }

    @Override
    public void realizarMatricula(){
        
    }

    @Override
    public List<Diciplina> obterDiciplinas() {
        return List.of();
    }

    @Override
    public List<Estudante> obterAlunosAtivos() {
        return List.of();
    }

    @Override
    public List<Estudante> obterAlunosEgressos() {
        return List.of();
    }

    public TipoGraduacao getTipo() {
        return tipoGraduacao;
    }

    public void setTipo(TipoGraduacao tipoGraduacao) {
        this.tipoGraduacao = tipoGraduacao;
    }

    public boolean isTccObrigatorio() {
        return tccObrigatorio;
    }

    public void setTccObrigatorio(boolean tccObrigatorio) {
        this.tccObrigatorio = tccObrigatorio;
    }
}
