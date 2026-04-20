import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int c = sc.nextInt();

        int[][] m = new int[l][c];

        double soma = 0;
        int maior = 0;
        int total = l * c;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = sc.nextInt();

                soma += m[i][j];

                if (i == 0 && j == 0) {
                    maior = m[i][j];
                } else if (m[i][j] > maior) {
                    maior = m[i][j];
                }
            }
        }

        int k = sc.nextInt();
        int acima = 0;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if (m[i][j] > k) {
                    acima++;
                }
            }
        }

        double media = soma / total;

        System.out.printf("Media dos elementos: %.2f\n", media);
        System.out.println("Maior elemento: " + maior);
        System.out.println("Quantidade acima de " + k + ": " + acima);

        sc.close();
    }
}
