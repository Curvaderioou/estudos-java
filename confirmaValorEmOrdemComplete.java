class Main {
  public static void main(String[] args) {

    int[] v={1,2,6,4,5};
    int contC=0, contD=0;

    for (int i=0; i < v.length-1 ; i++){
      if (v[i] < v[i+1]) {
        contC++;
      }
        if (v[i] > v[i+1]) {
      contD++;
    }
    }
    if (contC==v.length-1) {
      System.out.println("Esta em ordem Crescente");
    } else if (contD==v.length-1) {
      System.out.println("Esta em ordem Descrescente");
    } else {
      System.out.println("Não está ordenado")
    }
  }
}
