import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int c = sc.nextInt();

        int[][] m = new int[l][c];

        double somaTotal = 0;
        int total = l * c;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = sc.nextInt();
                somaTotal += m[i][j];
            }
        }

        int maiorLinha = 0;
        int idxMaiorLinha = 0;

        for (int i = 0; i < l; i++) {
            int soma = 0;

            for (int j = 0; j < c; j++) {
                soma += m[i][j];
            }

            if (i == 0 || soma > maiorLinha) {
                maiorLinha = soma;
                idxMaiorLinha = i;
            }
        }

        int menorColuna = 0;
        int idxMenorColuna = 0;

        for (int j = 0; j < c; j++) {
            int soma = 0;

            for (int i = 0; i < l; i++) {
                soma += m[i][j];
            }

            if (j == 0 || soma < menorColuna) {
                menorColuna = soma;
                idxMenorColuna = j;
            }
        }

        double media = somaTotal / total;
        int acima = 0;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if (m[i][j] > media) {
                    acima++;
                }
            }
        }

        System.out.println("Linha com maior soma: " + idxMaiorLinha);
        System.out.println("Coluna com menor soma: " + idxMenorColuna);
        System.out.printf("Media geral: %.2f\n", media);
        System.out.println("Quantidade acima da media: " + acima);

        sc.close();
    }
}
