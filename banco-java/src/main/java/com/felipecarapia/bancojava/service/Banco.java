package com.felipecarapia.bancojava.service;
import com.felipecarapia.bancojava.model.Conta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Banco {
    private List<Conta> contas = new ArrayList<>();
    private Map<Integer, Conta> mapaContas = new HashMap<>();
    private int numeroConta = 1;

    //métodos
    public Conta criarConta (String nome){
        Conta novaConta = new Conta(nome, numeroConta);
        contas.add(novaConta);
        mapaContas.put(numeroConta, novaConta);
        numeroConta++;
        return novaConta;
    }
    public Conta buscarConta(int numero){
        Conta conta = mapaContas.get(numero);
        if (conta == null){
            throw new IllegalArgumentException("Conta não encontrada");
        }
        return conta;
    }
    public void listarContas (){
        for (Conta listaConta : contas){
        System.out.println("Usuário: " + listaConta.getNome() );        
        System.out.println("Número da conta: " + listaConta.getNumero());
        System.out.println("Saldo: " + listaConta.getSaldo());
        System.out.println("---------------------");
        }
    }
    public void depositar(int numero, double valor){
        Conta conta = buscarConta(numero);
        conta.depositar(valor);
    }
    public void sacar (int numero, double valor){
        Conta conta = buscarConta(numero);
        conta.sacar(valor);
    }
    public void verSaldo (int numero){
        Conta conta = buscarConta(numero);
        System.out.println("Saldo: " + conta.getSaldo());
    }
}
