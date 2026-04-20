import java.util.Scanner;

public class Q19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] m = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        int somaReferencia = 0;

        for (int j = 0; j < n; j++) {
            somaReferencia += m[0][j];
        }

        boolean consistente = true;
        int diferente = 0;

        for (int i = 0; i < n; i++) {
            int somaLinha = 0;
            for (int j = 0; j < n; j++) {
                somaLinha += m[i][j];
            }
            if (somaLinha != somaReferencia) diferente++;
        }

        for (int j = 0; j < n; j++) {
            int somaColuna = 0;
            for (int i = 0; i < n; i++) {
                somaColuna += m[i][j];
            }
            if (somaColuna != somaReferencia) diferente++;
        }

        int diagP = 0, diagS = 0;

        for (int i = 0; i < n; i++) {
            diagP += m[i][i];
            diagS += m[i][n - 1 - i];
        }

        if (diagP != somaReferencia) diferente++;
        if (diagS != somaReferencia) diferente++;

        if (diferente == 0) {
            System.out.println("Matriz consistente: sim");
            System.out.println("Valor comum das somas: " + somaReferencia);
        } else {
            System.out.println("Matriz consistente: nao");
            System.out.println("Quantidade de estruturas com soma diferente da primeira linha: " + diferente);
        }

        sc.close();
    }
}
