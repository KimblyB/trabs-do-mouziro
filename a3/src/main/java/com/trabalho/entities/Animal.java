package com.trabalho.entities;

public class Animal {
  private String nome;
  private int idade;

  public Animal() {}

  public Animal(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public void fazerSom(String som) {
    System.out.println(getNome() + " diz: " + som);
  }

  

}
