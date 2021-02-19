
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int operacao;
        double num1;
        double num2;

        Scanner calc = new Scanner(System.in);

        System.out.println("***************INSTRUÇÕES*****************");

        System.out.println("Digite 1 para somar.");
        System.out.println("Digite 2 para subtrair.");
        System.out.println("Digite 3 para multiplicar.");
        System.out.println("Digite 4 para dividir.");

        System.out.println("******************************************");

        System.out.println("QUAL OPERAÇÃO DESEJA CALCULAR: ");

        operacao = calc.nextInt();

        System.out.println("Digite o primeiro número: ");
        num1 = calc.nextDouble();

        System.out.println("Digite o segundo número: ");
        num2 = calc.nextDouble();

        if (operacao == 1) {
            System.out.println ("A SOMA É IGUAL A: "+(num1 + num2));
        } else {
            if (operacao == 2) {
                System.out.println("A SUBTRAÇÃO É IGUAL A: "+(num1 - num2));
            } else {
                if (operacao == 3) {
                    System.out.println("A MULTIPLICAÇÃO É IGUAL A: "+(num1 * num2));
                } else {
                    if (operacao == 4) {
                        System.out.println("A DIVISÃO É IGUAL A: "+(num1 / num2));
                    } else {
                        System.out.println("OPERAÇÃO INVALIDA - Refaça a operação do inicio");
                    }
                }
            }
        }
    }
}
