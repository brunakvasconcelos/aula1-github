package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class programVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite  um número para produtos");
		int n = sc.nextInt();
		Produto[] vect = new Produto[n];

		for (int i = 0; i < n; i++) {
	
			sc.nextLine();			
			String nome = sc.nextLine();			
			double preco = sc.nextDouble();
			vect[i] = new Produto(nome, preco);
		}
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += vect[i].getPrice();
		}

		double media = soma / n;
		System.out.printf("A média dos preços é: %.2f%n", media);

		sc.close();

	}

}
