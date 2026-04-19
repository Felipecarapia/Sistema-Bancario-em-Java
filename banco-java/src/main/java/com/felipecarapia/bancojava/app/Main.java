package com.felipecarapia.bancojava.app;
import com.felipecarapia.bancojava.service.Banco;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner fp = new Scanner (System.in);
        Banco banco = new Banco();
        int numero;
        String nome;
        int operacao;
        double valor;
        System.out.println("Digite qual opçao deseja");
        System.out.println("-------------------------");
        System.out.println("1 - Criar Conta");
        System.out.println("2 - Listar Contas");
        System.out.println("3 - sair");
        int opcao = fp.nextInt();
        while (opcao != 3){
            if(opcao == 1){
                System.out.println("Digite seu nome");
                fp.nextLine();
                nome = fp.nextLine();
                banco.criarConta(nome); 
                System.out.println("Conta criada com sucesso!");
            }
            else if(opcao == 2){
                banco.listarContas();
                System.out.println("------------------------");
                System.out.println("Digite o numero da conta que voce deseja entrar");
                numero = fp.nextInt();
                fp.nextLine();
                try {
                    banco.buscarConta(numero);
                    System.out.println("Digite qual operação deseja realizar");
                    System.out.println("-----------------------------------");
                    System.out.println("1 - Depositar");
                    System.out.println("2 - Sacar");
                    System.out.println("3 - Ver saldo");
                    System.out.println("4 - Sair");
                    operacao = fp.nextInt();
                    while ( operacao != 4){
                        if (operacao == 1){
                            System.out.println("Digite o valor que deseja depositar");
                            valor = fp.nextDouble();
                            fp.nextLine();
                            banco.depositar(numero, valor);
                        }
                        else if (operacao == 2 ){
                            System.out.println("Digite o valor que deseja sacar");
                            valor = fp.nextDouble();
                            fp.nextLine();
                            banco.sacar(numero, valor);
                        }
                        else if (operacao == 3 ){
                            banco.verSaldo(numero);
                        }
                    System.out.println("Escolha uma opção:");
                    System.out.println("1 - Depositar");
                    System.out.println("2 - Sacar");
                    System.out.println("3 - Ver saldo");
                    System.out.println("4 - Sair");
                    operacao = fp.nextInt();
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Erro: " + e.getMessage());
                    
                }
            }
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Criar Conta");
        System.out.println("2 - Listar Contas");
        System.out.println("3 - sair");
        opcao = fp.nextInt();    
        }
        
    }
}


