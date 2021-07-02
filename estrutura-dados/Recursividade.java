public class Recursividade {

    public Recursividade() {

    }

    public void execute() {
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        System.out.print("vetor ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.print("soma "+somar(0, 0, vetor));
    }

    private static int somar(int soma, int posicao, int[] vetor) {
        if (posicao < vetor.length) {
            soma = soma + vetor[posicao];
            return somar(soma, posicao + 1, vetor);
        } else {
            return soma;
        }
    }
}
