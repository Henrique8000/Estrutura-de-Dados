package application;

import java.util.Scanner;

import utils.Pilha;

public class ConversaoDeBases {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			
			System.out.print("Digite um numero: ");
			int n = sc.nextInt();

			Pilha<Integer> pilha = new Pilha<>();

			if (n != 0) {
				
				while (n != 0) {
					pilha.push(n % 16);
					n = n / 16;
				}
				
				while (!pilha.isEmpty())  {
					
					int valor = pilha.pop();
					 
					if (valor < 10) {
						System.out.print(valor);
					}
					else {
						System.out.print((char) (valor - 10 + 'A'));
					}
				}
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
