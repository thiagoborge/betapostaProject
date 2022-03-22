package repositorios;

import entidades.jogos_hoje;
import servicos.Elemento;

import java.util.ArrayList;

public class BaseRepositorio {
    ArrayList<jogos_hoje> x = new ArrayList();

    ArrayList<jogos_hoje> vx;
    private Elemento vencedor;

    public Elemento get(int posicao){
        Elemento atual = this.vencedor;
        for(int i=0; i < posicao; i++){
            if (atual.getProximo() != null){
                atual = atual.getProximo();
            }
        }
        return atual;
    }
}
