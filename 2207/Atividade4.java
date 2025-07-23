import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {
        Scanner objler = new Scanner(System.in);
        int x, y, produto;
        System.out.printf("Informe o primeiro valor: ");
        x = objler.nextInt();
        System.out.printf("Informe o segundo valor: ");
        y = objler.nextInt();
        produto = x * y;
        System.out.println("O produto é: " + produto);
        System.exit(0);
    }
}
