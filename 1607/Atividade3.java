import java.util.Scanner;
public class Atividade3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int A, B, C;
 
        System.out.println("Digite um número:");
        A = ler.nextInt();
 
        System.out.println("Digite um número:");
        B = ler.nextInt();
 
        if (A == B)
            C = A + B;
        else
            C = A * B;
 
        System.out.println("O valor de C é: " + C);
 
        System.exit(0);
    }
}