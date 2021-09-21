import java.util.Arrays;

class Main {
  public static void main(String[] args) {

    int[] v = { 17, 5, 7, 15, 1 };

    // devemos ordenar o v[0] e v[1], mas se simplesmente copiarmos o 1 no lugar do
    // 0 iremos sobrescrever a informação.
    int aux;
    for (int j = 0; j < v.length - 1; j++) {
      for (int i = 0; i < v.length - 1; i++) {
        if (v[i] > v[i + 1]) {
          aux = v[i];
          v[i] = v[i + 1];
          v[i + 1] = aux;
        }
      }
    }
    System.out.println(Arrays.toString(v));
  }
}