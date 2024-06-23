package Programa;

import Pessoas.Cliente;
import Pessoas.ClienteFisico;
import Pessoas.ClienteJuridico;
import Banco.Conta;
import Banco.ContaCorrente;
import Banco.ContaPoupanca;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // VARIAVEIS -----------------------------------------------------------
        int opcao = 99;
        Scanner input = new Scanner(System.in);
        
        // OBJETOS -------------------------------------------------------------
        ClienteFisico rafael = new ClienteFisico("pf1", 45875896574L, 425895368L);
        ContaCorrente rafaelCC = new ContaCorrente("rafaelCC", 0.0d, 0.0d);
        ContaPoupanca rafaelCP = new ContaPoupanca("rafaelCP", 0.0d, 0.0d);
        
        ClienteJuridico paloma = new ClienteJuridico("pj1", 489456778456L);
        ContaCorrente palomaCC = new ContaCorrente("palomaCC", 0.0d, 0.0d);
        ContaPoupanca palomaCP = new ContaPoupanca("palomaCP", 0.0d, 0.0d);
        
        // PROGRAMA ------------------------------------------------------------
        System.out.println("Bem vindo(a) ao banco Java!");
        
        while (opcao != 9){
            System.out.println("\n-----------------------------");
            System.out.println("O que deseja realizar agora?");
            System.out.println("[1] Exibir Saldo ");
            System.out.println("[2] Sacar Dinheiro ");
            System.out.println("[3] Depositar Dinheiro ");
            System.out.println("[4] Trasferir para Poupanca");
            System.out.println("[9] Sair");
            opcao = input.nextInt();
            
            switch (opcao) {
                case 1 -> {
                    rafaelCC.exibirSaldo();
                }
                
                case 2 -> {
                    double valor;
                    boolean resultado;
                    
                    System.out.println("");
                    System.out.println("Quanto deseja sacar?");
                    valor = input.nextDouble();
                    resultado = rafaelCC.sacarDinheiro(valor);
                    
                    if (resultado = true) {
                        System.out.println("");
                        System.out.println("Saque realizado.");
                    }
                    else {
                        System.out.println("");
                        System.out.println("Erro ao sacar, tente novamente.");
                    }
                }
                
                case 3 -> {
                    double valor;
                    boolean resultado;
                    
                    System.out.println("");
                    System.out.println("Quanto deseja depositar?");
                    valor = input.nextDouble();
                    resultado = rafaelCC.depositarDinheiro(valor);
                    
                    if (resultado = true){
                        System.out.println("");
                        System.out.println("Deposito realizado com sucesso.");
                    }
                    else {
                        System.out.println("");
                        System.out.println("Erro, tente novamente e insira um valor.");
                    }
                }
                
                case 4 -> {
                    double valor;
                    ContaPoupanca destino = palomaCP;
                    byte decisao = 0;
                    byte confirmacao = 0;
                    boolean repetir = true;
                    
                    System.out.println("");
                    System.out.println("Quanto deseja transferir?");
                    valor = input.nextDouble();
                    System.out.println("");
                    System.out.println("Deseja transferir para a propria Poupanca?");
                    System.out.println("Digite '1' para SIM");
                    System.out.println("Digite '0' para NAO ");
                    decisao = input.nextByte();
                    System.out.println("");
                    
                    switch (decisao) {
                        case 1 -> {
                            rafaelCC.guardarPoupanca(valor, rafaelCP);
                            System.out.println("");
                            System.out.println("Transferencia Concluida");
                            System.out.println("Saldo na poupanca de "+rafaelCP.Identificador+": "+rafaelCP.saldo);
                            System.out.println("");
                        }
                        
                        case 0 -> {
                            while (repetir){
                                System.out.println("");
                                System.out.println("Insira o nome da Conta Poupanca de destino");
                                //destino = input.next();
                                System.out.println("");
                                System.out.println("Confirma envio para "+destino+"?");
                                System.out.println("Digite '1' para SIM");
                                System.out.println("Digite '0' para NAO ");
                                System.out.println("");
                                confirmacao = input.nextByte();

                                if (confirmacao == 1){
                                    rafaelCC.guardarPoupanca(valor, destino);
                                    repetir = false;
                                    System.out.println("");
                                    System.out.println("Envio realizado com sucesso");
                                    System.out.println("Saldo em "+destino+": "+destino.saldo);
                                    System.out.println("");
                                    
                                }
                                else {
                                    repetir = true;
                                }
                            }
                        }   
                        
                        default -> System.out.println("Opcao Invalida, tente novamente");
                    
                    }
                    
                }
                
                case 9 -> {
                    System.out.println("");
                    System.out.println("Obrigado por utilizar o banco Java");
                }
                default -> throw new AssertionError();
            }
        }
    }
}
