
import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Tamanho: ");
    int n = teclado.nextInt();
    int[] v = new int[n];

    for (int i = 0; i < v.length; i++) {
      System.out.println("digitar um número: ");
      v[i] = teclado.nextInt();
    }
    // ordenamos
    Arrays.sort(v);

    int maior = v[n - 1] - v[0];
    System.out.println("Maior: " + maior);
  }
}