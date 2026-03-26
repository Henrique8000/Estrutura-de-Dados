package application;

import java.util.Random;
import java.util.Scanner;

import entities.utils.FilaCircular;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random(100);

		int totalClientesAtendidos = 0;
		int minuto;
		int tempoDeEspera = 0;
		int maxEspera = 0;
		

		FilaCircular<Integer> clientes = new FilaCircular<>();
		
		System.out.print("Quantidade de minutos: ");
		int duracao = sc.nextInt();
		
		try {
			for (minuto = 0; minuto < duracao; minuto++) {
				
				if (!clientes.qIsEmpty()) {
					
					tempoDeEspera += clientes.dequeue();
					totalClientesAtendidos += 1;
					maxEspera = 0;
				}

				int resultado = random.nextInt(2);

				if (resultado != 0) {
					for (int k = 0; k < resultado; k++) {
						clientes.enqueue(minuto);
						maxEspera +=1;
					}
				}

			}
			
			System.out.println("Número total de clientes atendidos: " + totalClientesAtendidos);
			System.out.println("Tempo médio de espera: " + (totalClientesAtendidos / tempoDeEspera));
			System.out.println("Maior tempo de espera na fila: " + maxEspera);
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			sc.close();
		}
	}
}
