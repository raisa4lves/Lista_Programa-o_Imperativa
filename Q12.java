import java.util.Scanner;

public class Q12 {

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

        int r = sc.nextInt();
        int s = sc.nextInt();

        if (l * c != r * s) {
            System.out.println("Reorganizacao impossivel");
        } else {
            int[] temp = new int[l * c];
            int k = 0;

            for (int i = 0; i < l; i++) {
                for (int j = 0; j < c; j++) {
                    temp[k++] = m[i][j];
                }
            }

            int[][] nova = new int[r][s];
            k = 0;

            System.out.println("Matriz reorganizada:");

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < s; j++) {
                    nova[i][j] = temp[k++];
                    System.out.print(nova[i][j] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
