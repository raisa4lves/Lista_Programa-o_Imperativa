 import java.util.Scanner;

public class Q1 {

    public static int calcularSoma(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma;
    }

      public static double calcularMedia(int soma, int quantidade) {
        return (double) soma / quantidade;
    }

    public static int contarAcimaMedia(int[] vetor, double media) {
        int contador = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] consumo = new int[n];

        // Lendo os valores
        for (int i = 0; i < n; i++) {
            consumo[i] = sc.nextInt();
        }

        int soma = calcularSoma(consumo);
        double media = calcularMedia(soma, n);
        int acimaMedia = contarAcimaMedia(consumo, media);

        System.out.println("Consumo total: " + soma);
        System.out.println("Consumo medio: " + media);
        System.out.println("Dias acima da media: " + acimaMedia);

        sc.close();
    }
}

