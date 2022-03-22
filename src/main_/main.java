package main_;

import entidades.*;
import servicos.*;

import java.util.ArrayList;
import java.util.Scanner;


public class main extends metodos {

    private static int op;
    static Scanner scan = new Scanner(System.in);
    static String[] menu={" 1) Número da sorte ", " 2) Jogos Hoje Champions League", " 3) BlackJack 3.0" , " 4) Resultados Champions League " ,
            " 5) Informação da conta " , " 6) Ajuda "};

    public static void funcao() {
        System.out.println(" Digite o seu nome e sobrenome: " );
        pessoa.nome=scan.nextLine();
        System.out.println(" Digite o seu CPF: ");
        pessoa.cpf=scan.nextLine();
        System.out.println(" Digite sua idade: ");
        pessoa.idade=scan.nextLine();
        System.out.println(  "Seja Bem vindo " + pessoa.nome+ "! \n Escolha uma das opções abaixo para jogar: " );
        for (int i=0; i<menu.length;i++){
            System.out.println(menu[i]);
        }
        aposta.escolha=scan.nextInt();
        InicioAposta();
    }

    public static void InicioAposta() {
        if (aposta.escolha == 1) {
            dinheiro();
        } else if (aposta.escolha == 4) {
            listacrud lista = new listacrud();
            lista.adicionar("| BARCELONA ");
            lista.adicionar("| REAL MADRID ");
            lista.adicionar("| SEVILLA ");
            lista.adicionar("| BORUSSIA DORTMUND ");
            System.out.println("|> Times Classificados: " + lista.getTamanho());
            System.out.println("|> Cabeça de chave do pote 1: " + lista.getPrimeiro().getValor());
            System.out.println("|> Cabeça de chave do pote 2: " + lista.getUltimo().getValor());

            for(int i=0; i < lista.getTamanho(); i++){
                System.out.println(lista.get(i).getValor());
            }


            lista.remover("Liverpool");
            System.out.println("====  Liverpool foi desclassificado\n");
            lista.adicionar("Barcelona");
            System.out.println("====   Barcelona se classificou para as semi-finais\n");
            lista.remover("CHELSEA");
            System.out.println("====   Chelsea foi desclassificado\n");
            lista.adicionar("Real Madrid ");
            System.out.println("====   Real Madrid se classificou para as semi-finais\n");
            lista.remover("Manchester City");
            System.out.println("====   Manchester City foi desclassificado\n");
            lista.adicionar("Sevilla");
            System.out.println("====   Sevilla se Classificou para as semi-finais\n");
            lista.remover("Juventus");
            System.out.println("====   Juventus foi desclassificada\n");
            lista.adicionar("Borussia Dortmundo");
            System.out.println("====   Borussia Dortmundo se classificou para as semi-finais\n");


            System.out.println("Total de equipes na Quarta de final: " + lista.getTamanho() +" \n=== APERTE (0) PARA PARAR O PROGRAMA ===");
            for(int i=0; i < lista.getTamanho(); i++){

            }

        } else if (aposta.escolha == 3) {

            {
                System.out.println("|BlackJack 3.0, é um novo método de apostar. Você vai jogar com apenas um oponente," +
                        "a roleta Sorteará um número de 0-100.| \n|Vence quem tiver o número mais alto. \n Você tem 500 reais.");


                while (dinapost > 0) {
                    roletaNum();
                    System.out.println("Jogando...");

                    ganhador();
                }
                System.out.println("Você não tem dinheiro suficiente. |JOGO FINALIZADO, APERTE (0) PARA FINALIZAR. \n |PARA UMA NOVA \n" +
                                              " APOSTA, REINICIE O PROGRAMA.");


            }



            }else if (aposta.escolha == 2) {
            ArrayList<jogos_hoje> x = new ArrayList();
            x.add(new jogos_hoje("BARCELONA X LIVERPOOL", "17:30"));
            x.add(new jogos_hoje("REAL MADRID X CHELSEA", "17:00"));
            x.add(new jogos_hoje("SEVILLA X MANCHESTER CITY", "15:30"));
            x.add(new jogos_hoje("JUVENTUS X BORUSSIA DORTMUND", "13:15"));
            ArrayList<jogos_hoje> vx;
            vx(x);
            vx = x;
            System.out.println(vx);
            System.out.println("| PARA APOSTAR" +
                    "\n APOSTA, REINICIE O PROGRAMA." );


        }else if (aposta.escolha == 5) {
            System.out.println(" | Nome: " +pessoa.nome+ "\n | Idade: " +pessoa.idade+
                    "\n | CPF: " +pessoa.cpf+ "\n | Carteira: " +conta.dinheiro );

            System.out.println("|(0) PARA APOSTAR E" +
                    "\n  REINICIAR O PROGRAMA." );
        }else if (aposta.escolha == 6) {
            help();
        }


        else {
            System.out.println("Opção invalida, selecione novamente uma opção valida: ");
        }

            aposta.escolha = scan.nextInt();
            if (aposta.escolha == 1) {
                System.out.println(" Você tem R$" + conta.dinheiro+ " Reais   ||");
                apos();
            } else if (aposta.escolha == 2) {
                help2();
            } else {
                System.out.println("||   Programa parado   ||");

            }
        }

    private static void vx(ArrayList<jogos_hoje> x) {

    }


    public static void dinheiro(){
        conta.dinheiro=500;
        System.out.println("Você tem "+ conta.dinheiro+ " reias para apostar");
        apos();

    }
    public static void apos(){
        System.out.println("Escolha um número de 1 a 9? \n lembre-se, 9 números para acertar apenas 1! ");
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
        System.out.println("==================================== \nSiga as intruções: \nNo Betaposta você tem direito a 3 jogos para apostar, além de " +
                "jogos que acontecem no dia de hoje. \n====================================");

        System.out.println("\n| PARA APOSTAR" +
                "\n, REINICIE O PROGRAMA." );

        menu();
    }

    private static void menu() {
        op = scan.nextInt();

        switch (op){

            case 0:
                System.out.println("| PARA APOSTAR" +
                    "\n APOSTA, REINICIE O PROGRAMA." );


        }
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
                System.out.println("Você perdeu todo seu dinheiro! \n |JOGO FINALIZADO, APERTE (0) PARA FINALIZAR.  \n |PARA UMA NOVA" +
                        " APOSTA, REINICIE O PROGRAMA.");
            }else{
                apos();
            }
        }
    }
    public static void main(String[] args){
        funcao();
    }

}
