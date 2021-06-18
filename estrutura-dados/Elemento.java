public class Elemento {
    private Integer valor;
    private Elemento proximo;

    public Elemento(Integer novoValor){
        this.valor = novoValor;
    }
    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Elemento getProximo() {
        return this.proximo;
    }

    public Integer getValor() {
        return this.valor;
    }

}
