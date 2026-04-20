import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        int maior = v[0];
        int menor = v[0];
        int maiorCrescimento = 0;

        for (int i = 0; i < n; i++) {
            if (v[i] > maior) maior = v[i];
            if (v[i] < menor) menor = v[i];
        }

        for (int i = 1; i < n; i++) {
            int diff = v[i] - v[i - 1];
            if (diff > maiorCrescimento) {
                maiorCrescimento = diff;
            }
        }

        System.out.println("Maior producao: " + maior);
        System.out.println("Menor producao: " + menor);
        System.out.println("Maior crescimento consecutivo: " + maiorCrescimento);

        sc.close();
    }
}
