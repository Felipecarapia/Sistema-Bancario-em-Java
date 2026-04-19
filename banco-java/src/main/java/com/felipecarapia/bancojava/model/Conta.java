package com.felipecarapia.bancojava.model;

public class Conta {
    private String nome;
    private int numero;
    private int saldo = 0;

    //construtor
    public Conta (String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }

    //get
    public String getNome(){
        return this.nome;
    }
    public int getNumero(){
        return this.numero;
    }
    public int getSaldo(){
        return this.saldo;
    }

    //set
    public void setNome (String nome){
        this.nome = nome;
    }
    
    //métodos
    public void depositar(double valor){
        if (valor > 0 ){
            this.saldo += valor;
        }
        else {
            throw new IllegalArgumentException("Valor inválido");
        }
    }
    public void sacar(double valor){
        if (valor <= 0){
            throw new IllegalArgumentException("Valor inválido");
        }
        if (valor > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
    this.saldo -= valor;  
    }
    
}
