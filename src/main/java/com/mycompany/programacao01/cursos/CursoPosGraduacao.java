package com.mycompany.programacao01.cursos;

import com.mycompany.programacao01.Diciplina;
import com.mycompany.programacao01.Estudante;
import com.mycompany.programacao01.enums.TipoPosGraduacao;

import java.util.List;

public class CursoPosGraduacao extends Curso{
    private TipoPosGraduacao tipo;
    private String areaPesquisa;

    public boolean validarDicertacaoTese(){

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
}
