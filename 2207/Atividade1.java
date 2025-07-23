import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
        Scanner objler = new Scanner(System.in);
        String nome;
        int idade;
        System.out.printf("Informe o seu nome: ");
        nome = objler.nextLine();
        System.out.printf("Informe a sua idade: ");
        idade = objler.nextInt();
        System.out.println("Seu nome é " + nome + " e você tem " + idade + " anos.");
        System.exit(0);
    }
}

    
}
