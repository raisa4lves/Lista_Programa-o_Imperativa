import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] m = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        boolean diagZero = true;

        int maior = m[0][1];
        int li = 0, lj = 1;

        for (int i = 0; i < n; i++) {

            if (m[i][i] != 0) {
                diagZero = false;
            }

            for (int j = 0; j < n; j++) {

                if (i != j) {
                    if (m[i][j] > maior) {
                        maior = m[i][j];
                        li = i;
                        lj = j;
                    }
                }
            }
        }

        int menorSoma = 0;
        int idxMenor = 0;

        for (int i = 0; i < n; i++) {
            int soma = 0;

            for (int j = 0; j < n; j++) {
                soma += m[i][j];
            }

            if (i == 0 || soma < menorSoma) {
                menorSoma = soma;
                idxMenor = i;
            }
        }

        System.out.println("Diagonal principal com zeros: " + (diagZero ? "sim" : "nao"));
        System.out.println("Maior valor fora da diagonal: " + maior + " (" + li + "," + lj + ")");
        System.out.println("Linha com menor soma: " + idxMenor);

        sc.close();
    }
}
