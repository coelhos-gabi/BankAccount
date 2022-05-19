package org.example;

import org.example.telas.CriarConta;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao banco 000");
        System.out.println("O que deseja fazer?");

        int opcao;
        do{
            System.out.println("1 - Criar uma nova conta \n2 - Acessar minha conta\n3 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao){
                case 1:
                    CriarConta.executar(scanner);
                    break;
                default:
                    System.out.println("Opcao inválida");
            }

        }while(opcao != 3);
    }
}
