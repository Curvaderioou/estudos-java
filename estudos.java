import java.util.Arrays; //é necessário para importar o arrays
import java.util.Scanner; // é necessário importar a função scanner

class Main {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);// pronto para ler teclado

    System.out.print("Escolha o tamanho: ");
    int tamanho = teclado.nextInt();
    int[] v = new int[tamanho];

    // entrada via teclado
    for (int i = 0; i < tamanho; i++) {
      System.out.println("Digite um número: ");
      v[i] = teclado.nextInt();
    }

    Arrays.sort(v); // ordena o array escolhido em crescente

    // saída
    for (int i = 0; i < tamanho; i++)
      System.out.println(v[i]);

  }
}