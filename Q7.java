import java.util.Scanner;

public class Q7 {

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

        int maiorSoma = 0;

        for (int i = 0; i < l; i++) {
            int soma = 0;

            for (int j = 0; j < c; j++) {
                soma += m[i][j];
            }

            System.out.println("Soma da linha " + i + ": " + soma);

            if (i == 0 || soma > maiorSoma) {
                maiorSoma = soma;
            }
        }

        System.out.println("Maior soma: " + maiorSoma);

        sc.close();
    }
}
