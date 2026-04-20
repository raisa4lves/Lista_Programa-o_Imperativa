import java.util.Scanner;

public class Q20 {

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

        int k = sc.nextInt();

        int melhorTam = 0;
        int melhorLinha = 0;
        int melhorIni = 0;
        int melhorFim = 0;

        for (int i = 0; i < l; i++) {

            int atualTam = 0;
            int atualIni = 0;

            for (int j = 0; j < c; j++) {

                if (m[i][j] > k) {
                    if (atualTam == 0) {
                        atualIni = j;
                    }
                    atualTam++;
                } else {
                    if (atualTam > melhorTam) {
                        melhorTam = atualTam;
                        melhorLinha = i;
                        melhorIni = atualIni;
                        melhorFim = j - 1;
                    }
                    atualTam = 0;
                }
            }

            if (atualTam > melhorTam) {
                melhorTam = atualTam;
                melhorLinha = i;
                melhorIni = atualIni;
                melhorFim = c - 1;
            }
        }

        System.out.println("Maior sequencia acima de " + k + ": " + melhorTam);
        System.out.println("Linha da sequencia: " + melhorLinha);
        System.out.println("Indice inicial: " + melhorIni);
        System.out.println("Indice final: " + melhorFim);

        sc.close();
    }
}
