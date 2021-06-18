public class IteratorListaLigada {

    private Elemento elemento;

    public boolean temProximo() {
        return elemento.getProximo() == null ? true : false;
    }

    public Elemento getProximo() {
        elemento = elemento.getProximo();
        return elemento;
    }

    public IteratorListaLigada(Elemento atual) {
        this.elemento = atual;
    }
}
