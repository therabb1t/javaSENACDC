import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner objler = new Scanner(System.in);
        int A, B, C, soma;
        System.out.println("Insira um valor:");
        A = objler.nextInt();
        System.out.println("Insira outro valor:");
        B = objler.nextInt();
        System.out.println("Insira mais um:");
        C = objler.nextInt();
        soma = A + B;
        if (soma < C)
            System.out.println("Soma é menor que C");
        else
            System.out.println("Soma não é menor que C");

        System.exit(0);
    }
}


