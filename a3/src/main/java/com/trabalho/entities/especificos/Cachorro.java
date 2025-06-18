package com.trabalho.entities.especificos;

import com.trabalho.entities.Animal;

public class Cachorro extends Animal{

  public Cachorro(String nome, int idade) {
    super(nome, idade);
  }

  @Override
  public void fazerSom(String som) {
    
    super.fazerSom(som = "Au Au");
  }

  
  
}
