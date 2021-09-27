class Main {
  public static void main(String[] args) {

    int[] v = { 1, 7, 8, 10 };
    int cont = 0;

    for (int i = 0; i < v.length - 1; i++) {
      if (v[i] < v[i + 1]) {
        cont++;
      }
      if (cont == 3) {
        System.out.println(true);
      }
    }
  }
}
