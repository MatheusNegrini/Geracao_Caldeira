package org.example.Estruturado;

import java.time.LocalDateTime;
import java.util.Scanner;

public class DesafioJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numSelec;
        double valorConta =2500;
        double valorTransf;


        do {
            System.out.println("******************************************* \n" +
                    "Dados iniciais do cliente\n" +
                    "Nome do cliente: Matheus Negrini\n" +
                    "Tipo de conta: Corrente\n" +
                    "Saldo da conta: R$" + valorConta + "\n" +
                    "*******************************************\n" +
                    "1 - Ver saldo da conta\n" +
                    "2 - Fazer uma transferência\n" +
                    "3 - Receber um depósito\n" +
                    "4 - Sair");
            numSelec = in.nextInt();

            switch (numSelec) {
                case 1:
                    System.out.println("\n\nSaldo da conta: R$" + valorConta+"\n\n");
                break;
                case 2:
                    System.out.println("Qual o valor da tranferência?");
                    valorTransf = in.nextDouble();

                    valorConta = valorConta-valorTransf;
                break;
                case 3:
                    System.out.println("Qual o valor para depósito?");
                    valorTransf = in.nextDouble();

                    valorConta = valorConta+valorTransf;
                    break;
                case 4:
                    break;

                default:
                    System.out.println("Opção inválida!\nTente novamente!");
            }

        }while (numSelec !=4);

        LocalDateTime agora = LocalDateTime.now();
        int hora = agora.getHour();
        if(hora<12) {
            System.out.println("Até a próxima!\nTenha um bom dia!");
        } else if (hora<18) {
            System.out.println("Até a próxima!\nTenha uma boa tarde!");
        }else {
            System.out.println("Até a próxima!\nTenha uma boa noite!");
        }
    }
}
