import java.util.Scanner;

public class Teste1{
    
    public static void main(String[]args){
        Scanner objler = new Scanner(System.in);
        int x, y, soma;
        System.out.printf("Informe o primeiro valor: ");
        x = objler.nextInt();
        System.out.printf("Informe o segundo valor: ");
        y = objler.nextInt();
        soma = x + y;
        System.out.print(soma);
        System.exit(0);
    }
}