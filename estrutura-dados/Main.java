import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        array();
        buscaLinear();
        listaEncadiada();
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

}
