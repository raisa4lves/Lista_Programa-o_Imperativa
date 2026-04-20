import java.util.Scanner;

public class Q2 {

    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double n : notas) {
            soma += n;
        }
        return soma / notas.length;
    }

    public static int contarAprovados(double[] notas) {
        int cont = 0;
        for (double n : notas) {
            if (n >= 7.0) cont++;
        }
        return cont;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] notas = new double[n];

        for (int i = 0; i < n; i++) {
            notas[i] = sc.nextDouble();
        }

        double maior = notas[0];
        double menor = notas[0];

        for (double nota : notas) {
            if (nota > maior) maior = nota;
            if (nota < menor) menor = nota;
        }

        double media = calcularMedia(notas);
        int aprovados = contarAprovados(notas);

        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.printf("Media da turma: %.2f\n", media);
        System.out.println("Quantidade de aprovados: " + aprovados);

        sc.close();
    }
}
