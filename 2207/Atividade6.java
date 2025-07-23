import java.util.Scanner;

public class Atividade6 {

    public static void main(String[] args) {
        Scanner objler = new Scanner(System.in);
        int x, y, resultado = 0;
        char operador;
        System.out.print("Informe o primeiro valor: ");
        x = objler.nextInt();
        System.out.print("Informe o segundo valor: ");
        y = objler.nextInt();
        System.out.print("Informe o operador dentre: [+, -, *, /]: ");
        operador = objler.next().charAt(0);
        if (operador == '+') {
            resultado = x + y;
        } else if (operador == '-') {
            resultado = x - y;
        } else if (operador == '*') {
            resultado = x * y;
        } else if (operador == '/') {
            resultado = x / y;
        }
        System.out.println("Operação: " + resultado);
        System.exit(0);
    }
}
