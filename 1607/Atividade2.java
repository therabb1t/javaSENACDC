import java.util.Scanner;
public class Atividade2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;
 
        System.out.println("Digite um número:");
        numero = ler.nextInt();
 
        if (numero % 2 == 0)
            System.out.println("O número é par");
        else
            System.out.println("O número é ímpar");
        if (numero >= 0)
            System.out.println("O número é positivo");
        else
            System.out.println("O número é negativo");
 
        System.exit(0);
    }
}