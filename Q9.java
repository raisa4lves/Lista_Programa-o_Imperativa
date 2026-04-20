import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] m = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        int diagPrincipal = 0;
        int diagSecundaria = 0;

        for (int i = 0; i < n; i++) {
            diagPrincipal += m[i][i];
            diagSecundaria += m[i][n - 1 - i];
        }

        int total = diagPrincipal + diagSecundaria;

        if (n % 2 == 1) {
            int meio = n / 2;
            total -= m[meio][meio];
        }

        System.out.println("Soma da diagonal principal: " + diagPrincipal);
        System.out.println("Soma da diagonal secundaria: " + diagSecundaria);
        System.out.println("Soma total das diagonais sem repetir o centro: " + total);

        sc.close();
    }
}
