package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao banco 000");
        System.out.println("O que deseja fazer?");

        int opcao = scanner.nextInt();
        do{
            System.out.println("1 - Criar uma nova conta \n2 - Acessar minaconta\n3 - Sair");
            opcao = scanner.nextInt();
            switch (opcao){
                case 1:

                    break;
                default:
                    System.out.println("Opcao inválida");
            }

        }while(opcao != 3);
    }
}
