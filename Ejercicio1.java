import java.util.Arrays;
public class Main{
  public static void main(String[] args) {
  int [] matriz = [1, 2, 3, 4, 5];
  int [] matrizInversa = new int [matriz.length];
  int cuenta = 0;
  for (int i=matriz.length -1; i>=0; i++){
    matrizInversa[cuenta] = matriz[i];
    cuenta++;
  }
  Sytem.out.println(Arrays.toString(matriz));
  Sytem.out.println(Arrays.toString(matrizInversa));
  }
}
