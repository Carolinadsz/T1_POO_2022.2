package principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		// // 22- Sabe-se que o quilowatt de energia custa um quinto do salário mínimo . Faça um pro grama que receba o valor do salário mínimo e a quantidade de quilowatts consumida por uma residência . 
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o valor do salário mínimo: ");
		  float vlrSal = sc.nextFloat();
		System.out.println("Insira a quantidade de quilowatts consumida por residência: ");
		  float qtdKw = sc.nextFloat();
		float vlrKw = vlrSal / 5;
		float vlrReais = vlrKw * qtdKw;
		float desc = vlrReais * 15 / 100;
		float vlrDesc = vlrReais - desc;
		System.out.format("O valor do quilowatt é %.2f reais.\n", vlrKw);
		System.out.format("O valor que deve ser pago por essa residência é: %.2f reais.\n", vlrReais);
		System.out.format("O valor que deve ser pago com o desconto é: %.2f reais.\n", vlrDesc);

	}

}
