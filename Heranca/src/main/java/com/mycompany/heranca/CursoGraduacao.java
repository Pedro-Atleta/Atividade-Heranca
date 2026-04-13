/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

/**
 *
 * @author aluno
 */
public class CursoGraduacao extends Cursos {
private String tipo; // bacharelado, licenciatura, tecnológico
private boolean tccObrigatorio;

public CursoGraduacao(String codigo, String nome, int chTotal, String tipoDuracao,String modalidade, boolean ativo,String tipo, boolean tccObrigatorio) {
        this.tipo = tipo;
        this.tccObrigatorio = tccObrigatorio;
}

public void operacao() {
    System.out.println("Validando TCC. Obrigatório? " + tccObrigatorio);
}
}