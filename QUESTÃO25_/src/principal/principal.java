package principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		// // 25. Faça um programa que receba o custo de um espetáculo teatral e o preço do convite desse espetáculo . Esse programa deve calcular e mostrar a quantidade de convites que devem ser vendidos para que pelo menos o custo do espetáculo seja alcançado
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o custo total do espetáculo teatral: ");
		  double custo = sc.nextDouble();
		System.out.println("Insira o preço por convite: ");
		  double convite = sc.nextDouble();
		Double qtd = custo / convite;
		System.out.format("Devem ser vendidos %.2f convites para que o custo total do espetáculo seja alcançado!", Math.ceil(qtd));

	}

}
