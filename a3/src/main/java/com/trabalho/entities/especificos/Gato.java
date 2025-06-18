package com.trabalho.entities.especificos;

import com.trabalho.entities.Animal;

public class Gato extends Animal{

  public Gato(String nome, int idade) {
    super(nome, idade);
  }

  @Override
  public void fazerSom(String som) {
    
    super.fazerSom(som = "Miau");
  }

  
  
}
