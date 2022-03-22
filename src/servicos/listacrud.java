package servicos;

public class listacrud  {
    private Elemento vencedor;
    private Elemento ultvencedor;
    private int listaTimes;

    public listacrud(){
        this.listaTimes = 0;
    }

    public Elemento getPrimeiro() {
        return vencedor;
    }

    public void setPrimeiro(Elemento primeiro) {
        this.vencedor = primeiro;
    }

    public Elemento getUltimo() {
        return ultvencedor;
    }

    public void setUltimo(Elemento ultimo) {
        this.ultvencedor = ultimo;
    }

    public int getTamanho() {
        return listaTimes;
    }

    public void setTamanho(int tamanho) {
        this.listaTimes = tamanho;
    }

    public void adicionar(String novoValor){
        Elemento novoElemento = new Elemento(novoValor);
        if (this.vencedor == null && this.ultvencedor == null){
            this.vencedor = novoElemento;
            this.ultvencedor = novoElemento;
        }else{
            this.ultvencedor.setProximo(novoElemento);
            this.ultvencedor = novoElemento;
        }
        this.listaTimes++;
    }

    public void remover(String valorProcurado){
        Elemento anterior = null;
        Elemento atual = this.vencedor;
        for(int i=0; i < this.getTamanho(); i++){
            if (atual.getValor().equalsIgnoreCase(valorProcurado)){
                if (this.listaTimes == 1){
                    this.vencedor = null;
                    this.ultvencedor = null;
                }else if (atual == vencedor){
                    this.vencedor = atual.getProximo();
                    atual.setProximo(null);
                }else if (atual == ultvencedor){
                    this.ultvencedor = anterior;
                    anterior.setProximo(null);
                }else{
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                this.listaTimes--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }

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

