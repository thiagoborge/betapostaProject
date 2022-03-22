package main_;

import entidades.aposta;
import entidades.conta;
import entidades.num_sorte;

import java.util.Random;
import java.util.Scanner;

public class metodos extends num_sorte {

    public static void dinheiro(){
        conta.dinheiro=500;
        System.out.println("Você tem "+ conta.dinheiro+ " reias para apostar");
        apos();

    }
    public static void apos(){
        System.out.println("Escolha um número de 1 a 9? \n lembre-se, 9 números para acertar apenas 1! ");
        Scanner scan = null;
        aposta.tipoaposta=scan.nextInt();
        if(aposta.tipoaposta>=10){
            System.out.println("NÃO É UMA OPÇÃO VALIDA!!!");
            dinheiro();
        }else{
            userBet();
        }
    }
    public static void userBet(){
        System.out.println("Quanto você gostaria de apostar??");
        Scanner scan = null;
        aposta.dinaposta=scan.nextInt();
        if(aposta.dinaposta> conta.dinheiro){
            System.out.println("Você não tem dinheiro o suficiente!!");
            userBet();
        }else if(conta.dinheiro==0){
            System.out.println("Desculpe, você perdeu todo seu dinheiro");

        }else{
            conta.dinheiro= conta.dinheiro- aposta.dinaposta;
            System.out.println("Você perdeu R$: "+ aposta.dinaposta+ " Reais. Dinheiro restante: R$" + conta.dinheiro);
            game();
        }
    }


    public static void help(){
        System.out.println("Siga as intruções: \n Você inicia com uma quantidade de dinheiro limitado, podendo ganhar ou perder esse dinheiro. \n " +
                "o objetivo do jogo é fazer com que você permaneça com o dinheiro o maior tempo possível, sendo assim contar com a sua sorte. \n" +
                "Você escolherar um número de 0 a 10, se o seu número for o sorteado, você ganhara ou permanecera com o seu dinheiro disponível na carteira.");
        dinheiro();
    }

    public static void help2(){
        System.out.println("Siga as intruções ");
        apos();
    }

    public static void game(){
        int randomnumber=(int)Math.round(Math.random()*4+1);
        int pot=(int) Math.round(Math.random()*249+1);
        if (aposta.tipoaposta==randomnumber){
            System.out.println("Parabens você ganhou R$"+pot+ "reais");
            conta.dinheiro= conta.dinheiro+pot;
            InicioAposta();
        }else{
            if (conta.dinheiro==0){
                System.out.println("Você perdeu todo seu dinheiro! \n TENTE NOVAMENTE");
            }else{
                apos();
            }
        }
    }

    private static void InicioAposta() {
    }
     {
        System.out.println("BlackJack 3.0, é um novo método de apostar. Você vai jogar com apenas um oponente," +
                "a roleta Sorteará um número de 0-100. \nVence quem tiver o número mais alto");


        while(dinapost > 0) {
            roletaNum();
            System.out.println("Jogando...");

            ganhador();
        }
        System.out.println("Você não tem dinheiro suficiente.");

    }
}
