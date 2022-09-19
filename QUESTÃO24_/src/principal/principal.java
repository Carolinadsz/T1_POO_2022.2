package principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		// // 24. Faça um programa que receba uma hora formada por hora e minutos ( um número real ) , calcule e mostre a hora digitada apenas em minutos . Lembre - se de que : para quatro e meia deve - se digitar 4.30 : os minutos vão de 0 a 60 .
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira que horas são: ");
		  double hora = sc.nextDouble();
		double h = Math.floor(hora);
		double m = hora - h;
		double conversao = (h * 60) - (m * 100);
		System.out.format("%.2f horas são %.2f minutos!",hora,conversao);

	}

}
