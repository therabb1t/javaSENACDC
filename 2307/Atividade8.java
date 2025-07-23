import java.util.Scanner;

public class Atividade8 {

    public static void main(String[] args) {
        Scanner objler = new Scanner(System.in);
        String nome;
        int nota1, nota2, nota3, frequencia;
        double media;
        System.out.print("Qual o nome do aluno? ");
        nome = objler.nextLine();
        System.out.print("Informe a Nota 1: ");
        nota1 = objler.nextInt();
        System.out.print("Nota 2: ");
        nota2 = objler.nextInt();
        System.out.print("Nota 3: ");
        nota3 = objler.nextInt();
        System.out.print("Qual a porcentagem de frequência do aluno? ");
        frequencia = objler.nextInt();
        media = (nota1 + nota2 + nota3) / 3.0;
        System.out.println("O aluno(a) " + nome + " está com a média de: " + media);
        if (media >= 6) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
         if (frequencia >= 75) {
            System.out.println("Sua frequência está dentro dos conformes!");
        } else {
            System.out.println("Sua frequência está abaixo dos conformes, reprovado.");
        }
        System.exit(0);
    }
}
