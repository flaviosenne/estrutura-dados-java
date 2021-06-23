public class ListaLigada {
    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;

    public ListaLigada() {
        this.tamanho = 0;
    }

    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }

    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public Elemento getPrimeiro() {
        return this.primeiro;
    }

    public Elemento getUltimo() {
        return this.ultimo;
    }

    public void adicionar(Integer novoValor) {
        Elemento novoElemento = new Elemento(novoValor);
        if (this.primeiro == null && this.ultimo == null) {
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
        } else {
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
        }
        this.tamanho++;
    }

    public void remover(Integer valorProcurado) {
        Elemento anterior = null;
        Elemento atual = this.primeiro;
        for (int i = 0; i < this.getTamanho(); i++) {
            if (atual.getValor().equals(valorProcurado)) {
                if (this.tamanho == 1) {
                    this.primeiro = null;
                    this.ultimo = null;
                } else if (atual == primeiro) {
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);
                } else if (atual == ultimo) {
                    this.ultimo = anterior;
                    anterior.setProximo(null);
                } else {
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }

    public Elemento get(int posicao) {
        Elemento atual = this.primeiro;
        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }
        return atual;
    }

    public IteratorListaLigada getIterator() {
        return new IteratorListaLigada(this.primeiro);
    }
}
