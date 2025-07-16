import java.util.Scanner;
public class Atividade4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;
 
        System.out.println("Insira um número:");
        numero = ler.nextInt();
 
        System.out.println("Antecessor: " + (numero - 1));
        System.out.println("Sucessor: " + (numero + 1));
 
        System.exit(0);
    }
}