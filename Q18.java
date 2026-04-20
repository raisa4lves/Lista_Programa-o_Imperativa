import java.util.Scanner;

public class Q18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int c = sc.nextInt();

        int[][] m = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        int quantidade = 0;
        int maior = Integer.MIN_VALUE;
        int li = -1, lj = -1;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {

                int atual = m[i][j];
                boolean pico = true;

                if (i > 0 && m[i - 1][j] >= atual) pico = false;
                if (i < l - 1 && m[i + 1][j] >= atual) pico = false;
                if (j > 0 && m[i][j - 1] >= atual) pico = false;
                if (j < c - 1 && m[i][j + 1] >= atual) pico = false;

                if (pico) {
                    quantidade++;

                    if (atual > maior) {
                        maior = atual;
                        li = i;
                        lj = j;
                    }
                }
            }
        }

        System.out.println("Quantidade de pontos de pico: " + quantidade);

        if (quantidade > 0) {
            System.out.println("Posicao do maior ponto de pico: " + li + " " + lj);
            System.out.println("Valor do maior ponto de pico: " + maior);
        } else {
            System.out.println("Posicao do maior ponto de pico: -1 -1");
            System.out.println("Valor do maior ponto de pico: 0");
        }

        sc.close();
    }
}
