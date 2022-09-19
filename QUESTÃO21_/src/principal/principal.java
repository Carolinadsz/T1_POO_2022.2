package principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		// // 21. Faça um programa para calcular e mostrar a que distância deve estar uma escada da parede . O usuário deve fornecer o tamanho da escada e a altura em que deseja pregar o quadro . Lembre - se de que o tamanho da escada deve ser maior que a altura que se deseja.
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o tamanho da escada: ");
		  double EscadaTamanho = sc.nextDouble();
		System.out.println("Digite a altura em que deseja pregar o quadro: ");
		  double AlturaQuadro = sc.nextDouble();
		double DistânciaEscada = EscadaTamanho * EscadaTamanho - AlturaQuadro * AlturaQuadro;
		double distfinal = Math.sqrt(DistânciaEscada);
		System.out.println("A distância que a escada é: " + distfinal);

	}

}
