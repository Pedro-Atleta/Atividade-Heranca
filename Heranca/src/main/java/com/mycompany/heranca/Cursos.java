/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.heranca;

/**
 *
 * @author aluno
 */
public class Cursos {
    public static void main(String[] args) {

        CursoTecnico tecnico = new CursoTecnico(
                "TEC01", "Informática", 1200, "semestral",
                "presencial", true,
                "Tecnologia da Informação", 200
        );

        CursoGraduacao graduacao = new CursoGraduacao(
                "GRD10", "Engenharia de Software", 3200, "anual",
                "presencial", true,
                "bacharelado", true
        );

        CursoPosGraduacao pos = new CursoPosGraduacao(
                "POS90", "Computação Aplicada", 360, "semestral",
                "EAD", true,
                "stricto sensu", "Inteligência Artificial"
        );

        tecnico.operacao();
        graduacao.operacao();
        pos.operacao();
    }
}
