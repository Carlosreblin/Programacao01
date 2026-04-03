package com.mycompany.programacao01.cursos;

import com.mycompany.programacao01.Diciplina;
import com.mycompany.programacao01.Estudante;

import java.util.List;

public class CursoTecnico extends Curso{
    private String eixoTecnologico;
    private float cargaHorariaEstagio;

    public boolean verificarEstagioObrigatorio(){
        if (cargaHorariaEstagio == 0){
            return false;
        }else{
            return true;
        }
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

    public String getEixoTecnologico() {
        return eixoTecnologico;
    }

    public void setEixoTecnologico(String eixoTecnologico) {
        this.eixoTecnologico = eixoTecnologico;
    }

    public float getCargaHorariaEstagio() {
        return cargaHorariaEstagio;
    }

    public void setCargaHorariaEstagio(float cargaHorariaEstagio) {
        this.cargaHorariaEstagio = cargaHorariaEstagio;
    }
}
