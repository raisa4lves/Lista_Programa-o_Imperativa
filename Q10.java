import java.util.Scanner;

public class Q10 {

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

        int maiorLinha = 0;
        int indiceMaiorLinha = 0;

        for (int i = 0; i < l; i++) {
            int soma = 0;

            for (int j = 0; j < c; j++) {
                soma += m[i][j];
            }

            System.out.println("Soma da linha " + i + ": " + soma);

            if (i == 0 || soma > maiorLinha) {
                maiorLinha = soma;
                indiceMaiorLinha = i;
            }
        }

        int maiorColuna = 0;
        int indiceMaiorColuna = 0;

        for (int j = 0; j < c; j++) {
            int soma = 0;

            for (int i = 0; i < l; i++) {
                soma += m[i][j];
            }

            System.out.println("Soma da coluna " + j + ": " + soma);

            if (j == 0 || soma > maiorColuna) {
                maiorColuna = soma;
                indiceMaiorColuna = j;
            }
        }

        System.out.println("Linha com maior soma: " + indiceMaiorLinha);
        System.out.println("Coluna com maior soma: " + indiceMaiorColuna);

        sc.close();
    }
}
