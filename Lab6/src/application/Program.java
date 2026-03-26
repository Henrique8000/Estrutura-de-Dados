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
					
					int entrada = clientes.dequeue();
					int espera = minuto - entrada;
					
					tempoDeEspera += espera;
					totalClientesAtendidos++;
					
					if (espera > maxEspera) {
						maxEspera = espera;
					}
				}

				int resultado = random.nextInt(3);

				if (resultado == 1) {
					clientes.enqueue(minuto);
				}
				else if (resultado == 2) {
					clientes.enqueue(minuto);
					clientes.enqueue(minuto);
				}

			}
			
			System.out.println("Número total de clientes atendidos: " + totalClientesAtendidos);
			
			if (totalClientesAtendidos > 0) {
				System.out.printf("Tempo médio de espera: %.1f%n", ((double) tempoDeEspera / totalClientesAtendidos));
			}
			else {
				System.out.println("Tempo médio de espera: 0");
			}
			
			System.out.println("Maior tempo de espera na fila: " + maxEspera);
			
		} 
		catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} 
		finally {
			sc.close();
		}
	}
}
