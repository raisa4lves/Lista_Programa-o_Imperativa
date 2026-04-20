import java.util.Scanner;

public class Q17 {

    public static int maxSubarray(int[] v) {
        int max = v[0];
        int atual = v[0];

        for (int i = 1; i < v.length; i++) {
            if (atual < 0) {
                atual = v[i];
            } else {
                atual += v[i];
            }

            if (atual > max) {
                max = atual;
            }
        }

        return max;
    }

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
        int idxLinha = 0;

        for (int i = 0; i < l; i++) {
            int soma = maxSubarray(m[i]);

            if (i == 0 || soma > maiorLinha) {
                maiorLinha = soma;
                idxLinha = i;
            }
        }

        int maiorColuna = 0;
        int idxColuna = 0;

        for (int j = 0; j < c; j++) {
            int[] col = new int[l];

            for (int i = 0; i < l; i++) {
                col[i] = m[i][j];
            }

            int soma = maxSubarray(col);

            if (j == 0 || soma > maiorColuna) {
                maiorColuna = soma;
                idxColuna = j;
            }
        }

        System.out.println("Maior soma contigua em linha: " + maiorLinha);
        System.out.println("Linha da maior soma contigua: " + idxLinha);
        System.out.println("Maior soma contigua em coluna: " + maiorColuna);
        System.out.println("Coluna da maior soma contigua: " + idxColuna);

        sc.close();
    }
}
