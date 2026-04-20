import java.util.Scanner;

public class Q4 {

    public static int buscar(int[] v, int x) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] codigos = new int[n];

        for (int i = 0; i < n; i++) {
            codigos[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        int pos = buscar(codigos, x);

        if (pos != -1) {
            System.out.println("Codigo encontrado");
            System.out.println("Primeira posicao: " + pos);
        } else {
            System.out.println("Codigo nao encontrado");
        }

        sc.close();
    }
}
