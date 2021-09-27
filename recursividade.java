class Main {

  public static void main(String[] args) {

    System.out.println(fat(2));

  }

  // modulo recursivo

  public static int fat(int n) {
    // quando N é 1 ou 0
    if (n <= 1) {
      return 1;
    } else {
      return n * fat(n - 1);
    }
  }
}
