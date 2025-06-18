package com.trabalho;

import java.util.Scanner;

import com.trabalho.entities.especificos.Cachorro;
import com.trabalho.entities.especificos.Gato;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do seu Cachorro: ");
        String nomeCachorro = scanner.nextLine();
        System.out.print("Digite a idade do seu cachorro: ");
        int idadeCachorro = scanner.nextInt();
        scanner.nextLine();

        Cachorro cachorro = new Cachorro(nomeCachorro, idadeCachorro);

        System.out.print("Digite o nome do gato: ");
        String nomeGato = scanner.nextLine();
        System.out.print("Digite a idade do gato: ");
        int idadeGato = scanner.nextInt();

        Gato gato = new Gato(nomeGato, idadeGato);

        System.out.println("Espera ai... Seu animais estão falando com voce!");
        cachorro.fazerSom(nomeCachorro);
        gato.fazerSom(nomeGato);

        scanner.close();

    }
}