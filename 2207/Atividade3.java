import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        Scanner objler = new Scanner(System.in);
        int x, y, subtrai;
        System.out.printf("Informe o primeiro valor: ");
        x = objler.nextInt();
        System.out.printf("Informe o segundo valor: ");
        y = objler.nextInt();
        subtrai = x - y;
        System.out.println("A subtração é: " + subtrai);
        System.exit(0);
    }
}


