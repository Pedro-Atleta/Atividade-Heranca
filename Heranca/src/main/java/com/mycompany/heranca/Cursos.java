/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.heranca;

/**
 *
 * @author aluno
 */
public abstract class Cursos {
private int Codigo;
private String Nome;
private int CHtotal;
private int Duracao;
private String TipoDuracao;
private String Modalidade;
private String Status;

public int getCodigo(){
    return Codigo;
}
public void setCodigo(int _Codigo){
    this.Codigo = _Codigo;
}
public String getnome(){
    return Nome;
}
public void setnome(String _Nome){
    this.Nome = _Nome;
}
public int getCHtotal(){
   return CHtotal;
}
public void setCHtotal(int _CHtotal){
    this.CHtotal = _CHtotal;
}
public int getDuracao(){
    return Duracao;
}
public void setDuracao(int _Duracao){
    this.Duracao = _Duracao;
}

}
