package org.example.dominios;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Conta {

    private String numeroConta;
    private String agencia;
    private TipoConta tipoConta;

    public Conta(String numeroConta, String agencia, TipoConta tipoConta) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.tipoConta = tipoConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public BigDecimal depositar(BigDecimal valor){
        return BigDecimal.ZERO;
    }

    public BigDecimal sacar(BigDecimal valor){
        return BigDecimal.ZERO;
    }

    public BigDecimal transferir(BigDecimal valor){
        return BigDecimal.ZERO;
    }

    public BigDecimal saldo(){
        return BigDecimal.ZERO;
    }
    public ArrayList<BigDecimal> extrato(LocalDate dateStart, LocalDate dateEnd){
        return (ArrayList<BigDecimal>) Arrays.asList(BigDecimal.ZERO);
    }

    public static Conta criarConta(Cliente cliente, TipoConta tipoConta, String agencia ){
        String numeroConta = String.format("%04d", new Random().nextInt());
        Conta conta = new Conta(numeroConta, agencia, tipoConta);
        cliente.addConta(conta);
        return conta;
    }
}
