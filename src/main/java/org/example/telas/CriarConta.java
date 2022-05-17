package org.example.telas;

import org.example.dominios.Conta;
import org.example.dominios.TipoConta;

import java.util.Objects;
import java.util.Scanner;

public class CriarConta {

    public void executar(Scanner scanner){
        System.out.println("Informe a Agência");
        String agencia = scanner.next();
        System.out.println("Informe o tipo de conta");
        StringBuilder builder = new StringBuilder();
        for(TipoConta tipoConta:TipoConta.values()){
            builder.append(String.format("%s - %s", tipoConta.getCode(), tipoConta.getLabel()));
        }
        String opcao = scanner.next();
        TipoConta tipoConta = TipoConta.valueOfCode(opcao);
        if(Objects.isNull(tipoConta)){
            System.out.println("Não foi informado o tipo da conta");
        }else{
            Conta conta = Conta.criarConta()
        }
    }
}
