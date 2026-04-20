import java.util.Scanner;

public class Q3 {

    public static double somar(double[] v) {
        double soma = 0;
        for (double x : v) {
            soma += x;
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] preco = new double[n];
        double[] novoPreco = new double[n];

        for (int i = 0; i < n; i++) {
            preco[i] = sc.nextDouble();
        }

        int p = sc.nextInt();

        double fator = 1 + (p / 100.0);

        System.out.println("Novos precos:");

        for (int i = 0; i < n; i++) {
            novoPreco[i] = preco[i] * fator;
            System.out.printf("%.2f ", novoPreco[i]);
        }

        System.out.println();

        double totalAntes = somar(preco);
        double totalDepois = somar(novoPreco);

        System.out.printf("Total antes do reajuste: %.2f\n", totalAntes);
        System.out.printf("Total depois do reajuste: %.2f\n", totalDepois);

        sc.close();
    }
}
