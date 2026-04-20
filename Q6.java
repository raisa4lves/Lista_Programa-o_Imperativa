import java.util.Scanner;
import java.util.Arrays;

public class Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] v = new double[n];

        for (int i = 0; i < n; i++) {
            v[i] = sc.nextDouble();
        }

        double menor = v[0];
        double maior = v[0];

        for (int i = 0; i < n; i++) {
            if (v[i] < menor) menor = v[i];
            if (v[i] > maior) maior = v[i];
        }

        Arrays.sort(v);

        System.out.println("Melhor tempo: " + menor);
        System.out.println("Pior tempo: " + maior);
        System.out.println("Tres melhores tempos:");

        for (int i = 0; i < 3; i++) {
            System.out.print(v[i] + " ");
        }

        sc.close();
    }
}
