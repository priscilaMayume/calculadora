import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   
		int num1, num2, soma, subtracao, multiplicacao, divisao;

		System.out.println("Insira o primeiro numero: ");
		Scanner n1 = new Scanner(System.in);
		num1 = n1.nextInt();

		System.out.println("Insira o segundo numero: ");
		Scanner n2 = new Scanner(System.in);
		num2 = n2.nextInt();

		soma = num1 + num2;
		System.out.println("O resultado da soma é: " + soma);

		subtracao = num1 - num2;
		System.out.println("O resultado da subtração é: " + subtracao);

		multiplicacao = num1 * num2;
		System.out.println("O resultado da multiplicação é: " + subtracao);

		divisao = num1 * num2;
		System.out.println("O resultado da divisão é: " + subtracao);

		System.out.println("");

		System.out.println("               *********FIM***********");
  }
}