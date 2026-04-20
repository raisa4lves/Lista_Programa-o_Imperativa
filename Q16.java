import java.util.Scanner;

public class Q16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] m = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        int[] saidas = new int[n];
        int[] chegadas = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                saidas[i] += m[i][j];
                chegadas[j] += m[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Saidas do terminal " + i + ": " + saidas[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Chegadas no terminal " + i + ": " + chegadas[i]);
        }

        int maiorDiff = 0;
        int idx = 0;

        for (int i = 0; i < n; i++) {
            int diff = Math.abs(saidas[i] - chegadas[i]);

            if (i == 0 || diff > maiorDiff) {
                maiorDiff = diff;
                idx = i;
            }
        }

        boolean simetrica = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (m[i][j] != m[j][i]) {
                    simetrica = false;
                }
            }
        }

        System.out.println("Terminal com maior diferenca absoluta entre saidas e chegadas: " + idx);
        System.out.println("Matriz simetrica: " + (simetrica ? "sim" : "nao"));

        sc.close();
    }
}
