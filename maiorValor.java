
class Main {
  // Determinar o maior valor do array
  public static void main(String[] args) {

    int[] v = { 4, 1, 8, 9, 3, 2, 51, 20, 12 };

    int maior = v[0];
    int menor = v[0];

    for (int i = 1; i < v.length; i++) {
      if (maior < v[i]) {
        maior = v[i];
      }
    }

    System.out.println("Maior: " + maior);

    // Menor valor do array
    for (int i = 1; i < v.length; i++) {
      if (menor > v[i]) {
        menor = v[i];
      }
    }

    System.out.println("Menor: " + menor);

    int maiorDiferenca = maior - menor;

    System.out.println("A maior Diferença é: " + maiorDiferenca);
  }
}