package servicos;
import entidades.Elemento;

import java.util.ArrayList;


public class jogosHojeServico {
    public static void main(String[] args) {

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


        System.out.println("Total de equipes na Quarta de final: " + lista.getTamanho());
        for(int i=0; i < lista.getTamanho(); i++){

        }

    }
}
