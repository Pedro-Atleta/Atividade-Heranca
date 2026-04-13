/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

/**
 *
 * @author aluno
 */
public class CursoTecnico extends Cursos {
private String eixoTecnologico;
private int chEstagio;

public CursoTecnico(String codigo, String nome, int chTotal, String tipoDuracao, String modalidade, boolean ativo, String eixoTecnologico, int chEstagio) {
    this.eixoTecnologico = eixoTecnologico;
    this.chEstagio = chEstagio;
}

public void operacao() {
    System.out.println("Estágio obrigatório? " + (chEstagio > 0));
}
}
