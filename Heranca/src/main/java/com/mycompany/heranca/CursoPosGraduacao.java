/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

/**
 *
 * @author aluno
 */
public class CursoPosGraduacao extends Cursos {
private String tipo; // lato sensu / stricto sensu
private String areaPesquisa;

public CursoPosGraduacao(String codigo, String nome, int chTotal, String tipoDuracao,String modalidade, boolean ativo,String tipo, String areaPesquisa) {
    this.tipo = tipo;
    this.areaPesquisa = areaPesquisa;
}

public void operacao() {
    System.out.println("Validando dissertação/tese na área: " + areaPesquisa);
}
}
