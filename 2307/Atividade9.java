import java.util.Scanner;

public class Atividade9 {
        public static void main(String[] args) {
        Scanner objler = new Scanner(System.in);
        System.out.print("Digite o número do mês (1 a 12): ");
        int n = objler.nextInt();
        String mes = null;
        switch (n) {
            case 1:
                mes = "Janeiro";
                break;
            case 2:
                mes = "Fevereiro";
                break;
            case 3:
                mes = "Março";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Maio";
                break;
            case 6:
                mes = "Junho";
                break;
            case 7:
                mes = "Julho";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Setembro";
                break;
            case 10:
                mes = "Outubro";
                break;
            case 11:
                mes = "Novembro";
                break;
            case 12:
                mes = "Dezembro";
                break;
         }
     System.out.println("O nome do mês é: " + mes);
    }
}