import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int c = sc.nextInt();

        int[][] m = new int[l][c];
        int[][] t = new int[c][l];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                t[j][i] = m[i][j];
            }
        }

        System.out.println("Matriz transposta:");

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
