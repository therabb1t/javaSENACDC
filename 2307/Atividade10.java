import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
    int n = 1;
    int P = 0; 
    while (n <= 50) {
      int a = 0;
      n = n + 1;
      
      if (a % 2 == 0) {
        a = P;
        P = P + 1;
      }
    }
    System.out.printf("A quantidade de números pares é: ", P);
  }
}

