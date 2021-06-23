import java.util.ArrayList;

public class Comparacao {
    public static void main(String[] args) {
        ListaLigada<Integer> lista = new ListaLigada<Integer>();

        ArrayList<Integer> vetor = new ArrayList<>();

        // adicionar elementos
        int limit = 100000;
        long tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < limit; i++) {
            vetor.add(i);
        }
        long tempoFinal = System.currentTimeMillis();
        System.out.println("--------------vetor----------------");
        System.out.println("adicionou " + limit + " elemntos no vetor");
        System.out.println("tempo: " + (tempoFinal - tempoInicial));

        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < limit; i++) {
            lista.adicionar(i);
        }
        tempoFinal = System.currentTimeMillis();
        
        System.out.println("--------------lista ligada----------------");
        System.out.println("adicionou " + limit + " elemntos no vetor");
        System.out.println("tempo: " + (tempoFinal - tempoInicial));
        
        // ler valores
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < vetor.size(); i++) {
            vetor.get(i);
        }
        tempoFinal = System.currentTimeMillis();
        
        System.out.println("--------------vetor----------------");
        System.out.println("ler arquivo");
        System.out.println("tempo: " + (tempoFinal - tempoInicial));


        tempoInicial = System.currentTimeMillis();
        IteratorListaLigada iterator = lista.getIterator();
        while(iterator.temProximo()){
            iterator.getProximo();
        }
        tempoFinal = System.currentTimeMillis();
        
        System.out.println("--------------lista ligada----------------");
        System.out.println("ler arquivo");
        System.out.println("tempo: " + (tempoFinal - tempoInicial));
    }
}
