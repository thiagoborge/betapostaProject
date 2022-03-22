package servicos;

import entidades.pessoa;

import java.util.List;
public class Elemento {
    private String valor;
    private servicos.Elemento proximo;

    public Elemento(String novoValor){
        this.valor = novoValor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public servicos.Elemento getProximo() {
        return proximo;
    }

    public void setProximo(servicos.Elemento proximo) {
        this.proximo = proximo;
    }
}