import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // array();
        // buscaLinear();
        // listaEncadiada();
        // buscaLinearAula9();
        // buscaBinaria();
        // bubbleSort();
        // insertionSort();
        // selectionSort();
        // heapSort();
        // new Recursividade().execute();

        int[] vetor = new int[1000000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) Math.floor(Math.random() * vetor.length);
        }

        System.out.print("desordenado ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        quickSort(vetor, 0, vetor.length - 1);
    }

    private static void array() {
        int[] vetorzao = new int[10];
        vetorzao[0] = 3;
        vetorzao[1] = 4;
        vetorzao[2] = 8;
        vetorzao[3] = 13;
        vetorzao[4] = 22;
        vetorzao[5] = 51;
        vetorzao[6] = 33;

        for (int i = 0; i < vetorzao.length; i++) {
            System.out.println(vetorzao[i]);
        }
    }

    private static void buscaLinear() {
        String[] estados = new String[10];
        estados[0] = "AC";
        estados[1] = "DF";
        estados[2] = "CE";
        estados[3] = "DF";
        estados[4] = "AM";
        estados[5] = "AP";
        estados[6] = "Pb";
        estados[7] = "RN";
        estados[8] = "MS";
        estados[9] = "SP";

        for (String estado : estados) {
            System.out.println(estado);
        }

        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual sigla de estado vc quer buscar?");
        String sigla = leitor.nextLine();
        leitor.close();

        boolean encontrou = false;
        for (int i = 0; i < estados.length; i++) {
            String elemento = estados[i];
            if (elemento.equals(sigla)) {
                encontrou = true;

                break;
            }
        }

        if (encontrou) {
            System.out.println("acheeeei");
        } else {
            System.out.println("não achei");
        }
    }

    private static void listaEncadiada() {
        ListaLigada<Integer> lista = new ListaLigada<Integer>();
        System.out.println("tamanho agora " + lista.getTamanho());
        lista.adicionar(1);
        lista.adicionar(11);
        lista.adicionar(22);
        lista.adicionar(33);
        System.out.println("primeiro " + lista.getPrimeiro().getValor());
        System.out.println("ultimo " + lista.getUltimo().getValor());
        System.out.println("na posição 1: " + lista.get(1).getValor());
        System.out.println("na posição 2: " + lista.get(2).getValor());
        System.out.println("tamanho agora " + lista.getTamanho());
        System.out.println("----------------------------- ");
        lista.remover(1);
        lista.remover(11);
        lista.remover(22);
        lista.remover(33);
        lista.adicionar(44);
        lista.remover(44);
        System.out.println("tamanho agora " + lista.getTamanho());
    }

    private static void buscaLinearAula9() {
        int[] vetor = new int[8];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 100);
            System.out.println(vetor[i]);
        }

        System.out.println("qual número vc busa");
        Scanner leitor = new Scanner(System.in);
        int buscado = leitor.nextInt();

        boolean achou = false;
        for (int i = 0; i > vetor.length; i++) {
            if (vetor[i] == buscado) {
                achou = true;
                break;
            }
        }
        if (achou)
            System.out.println("achou");
        else
            System.out.println("não achou");
    }

    private static void buscaBinaria() {
        int[] vetor = new int[10000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 2;
            // System.out.println(vetor[i]);
        }

        int cont = 0;
        boolean achou = false;
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;

        System.out.println("qual número vc busa");
        Scanner leitor = new Scanner(System.in);
        int buscado = leitor.nextInt();

        while (inicio <= fim) {
            meio = (int) ((inicio + fim) / 2);
            cont++;
            if (vetor[meio] == buscado) {
                achou = true;
                break;
            } else if (vetor[meio] < buscado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        System.out.println("testes cont " + cont);
        if (achou)
            System.out.println("achou ");
        else
            System.out.println("não achou");

    }

    private static void bubbleSort() {
        int[] vetor = new int[100000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
            // System.out.println(vetor[i]);
        }

        long inicio = System.currentTimeMillis();
        // BUBBLE SORT 0(N^2)
        int aux;
        for (int i = 0; i < vetor.length; i++) { // complexidade de O (N)
            for (int j = i; j < vetor.length; j++) {// complexidade de O (N-1)
                if (vetor[i] > vetor[j]) {
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }
        long fim = System.currentTimeMillis();

        System.out.println("tempo: " + (fim - inicio));
        System.out.println("-------------");
        for (int i = 0; i < vetor.length; i++) {
            // System.out.println(vetor[i]);
        }
    }

    private static void insertionSort() {
        int[] vet = new int[10];

        for (int i = 0; i < vet.length; i++) {
            vet[i] = (int) (Math.random() * vet.length);
        }
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
        System.out.println("-----------------");

        int aux, j;
        for (int i = 1; i < vet.length; i++) {
            aux = vet[i];
            j = i - 1;
            while (j >= 0 && vet[j] > aux) {
                vet[j + 1] = vet[j];
                j--;
            }
            vet[j + 1] = aux;
        }

        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
    }

    private static void selectionSort() {
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println("---------------------");

        int menor, aux;
        for (int i = 0; i < vetor.length; i++) {
            menor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }
            aux = vetor[menor];
            vetor[menor] = vetor[i];
            vetor[i] = aux;
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

    }

    private static void heapSort() {
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) Math.floor(Math.random() * vetor.length);
        }

        System.out.print("desordenado ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        int n = vetor.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            aplicarHeap(vetor, n, i);
        }

        System.out.print("quase ordenado ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        for (int j = n - 1; j > 0; j--) {
            int aux = vetor[0];
            vetor[0] = vetor[j];
            vetor[j] = aux;

            aplicarHeap(vetor, j, 0);
        }

        System.out.print("ordenado ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    private static void aplicarHeap(int[] vetor, int n, int i) {
        int raiz = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;

        if (esquerda < n && vetor[esquerda] > vetor[raiz]) {
            raiz = esquerda;
        }
        if (direita < n && vetor[direita] > vetor[raiz]) {
            raiz = direita;
        }

        if (raiz != i) {
            int aux = vetor[i];
            vetor[i] = vetor[raiz];
            vetor[raiz] = aux;

            aplicarHeap(vetor, n, raiz);
        }
    }

    private static void quickSort(int[] vetor, int esquerda, int direita) {
        if (esquerda < direita) {
            int pivo = particao(vetor, esquerda, direita);
            quickSort(vetor, esquerda, pivo);
            quickSort(vetor, pivo + 1, direita);
        }
    }

    static int particao(int[] vetor, int esquerda, int direita) {
        int meio = (int) (esquerda + direita) / 2;
        int pivo = vetor[meio];
        int i = esquerda - 1;
        int j = direita + 1;
        while (true) {
            do {
                i++;
            } while (vetor[i] < pivo);
            do {
                j--;
            } while (vetor[j] > pivo);
            if (i >= j) {
                return j;
            }
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }
    }

}
