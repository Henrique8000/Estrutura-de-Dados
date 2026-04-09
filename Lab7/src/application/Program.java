package application;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Atleta;

public class Program {
	
	static boolean menu = true;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Atleta> atletas = new ArrayList<>();
		
		atletas.add(new Atleta("Bob", 26, 2.1));
		atletas.add(new Atleta("Henrique", 21, 10.0));
		atletas.add(new Atleta("Josias", 55, 7.3));
		atletas.add(new Atleta("Ana", 18, 3.3));
		
		/*
		System.out.println("a) Exiba os elementos da lista em ordem alfabética do nome dos atletas via implementação da interface Comparable.\n");
		Collections.sort(atletas);
		atletas.forEach(out::println);
		
		System.out.println();
		
		System.out.println("b)Exiba os elementos da lista em ordem crescente de idade dos atletas (necessário ter  um atributo idade do tipo inteiro na classe Atleta). Via implementação da interface Comparator\n");
		Collections.sort(atletas, (a1, a2) -> a1.getIdade().compareTo(a2.getIdade()));
		atletas.forEach(out::println);
		
		System.out.println();
		
		System.out.println("c)Exiba os elementos da lista em ordem decrescente de pontuação dos atletas. Via implementação da interface Comparator.\n");
		
		Collections.sort(atletas, (a1, a2) -> -a1.getPontuacao().compareTo(a2.getPontuacao()));
		atletas.forEach(out::println);
		
		System.out.println();
		
		System.out.println("d) Refaça item a) adotando implementação da interface Comparator\n");
		
		Collections.sort(atletas, (a1, a2) -> a1.getNome().compareTo(a2.getNome()));
		atletas.forEach(out::println);
		*/
		
		do {
			System.out.println("Escolha qual critério de classificação deseja ver:");
			System.out.println("1. Idade");
			System.out.println("2. Nome");
			System.out.println("3. Pontuação");
			
			int op = sc.nextInt();
			
			if (op == 1) {
				System.out.println("Crescente ou Decrescente?");
				
				sc.nextLine();
				String opCriterio = sc.nextLine().toLowerCase();
				System.out.println();
				
				if (opCriterio.equals("crescente")) {
					Collections.sort(atletas, (a1, a2) -> a1.getIdade().compareTo(a2.getIdade()));
					atletas.forEach(out::println);
				}
				else {
					Collections.sort(atletas, (a1, a2) -> -a1.getIdade().compareTo(a2.getIdade()));
					atletas.forEach(out::println);
				}
				
			}
			else if (op == 2) {
				System.out.println("Crescente ou Decrescente?");
				
				sc.nextLine();
				String opCriterio = sc.nextLine().toLowerCase();
				System.out.println();
				
				if (opCriterio.equals("crescente")) {
					Collections.sort(atletas, (a1, a2) -> a1.getNome().compareTo(a2.getNome()));
					atletas.forEach(out::println);
				}
				else {
					Collections.sort(atletas, (a1, a2) -> -a1.getNome().compareTo(a2.getNome()));
					atletas.forEach(out::println);
				}
				
			}
			else if (op == 3) {
				
				System.out.println("Crescente ou Decrescente?");
				
				sc.nextLine();
				String opCriterio = sc.nextLine().toLowerCase();
				System.out.println();
				
				if (opCriterio.equals("crescente")) {
					Collections.sort(atletas, (a1, a2) -> a1.getPontuacao().compareTo(a2.getPontuacao()));
					atletas.forEach(out::println);
					System.out.println();
				}
				else {
					Collections.sort(atletas, (a1, a2) -> -a1.getPontuacao().compareTo(a2.getPontuacao()));
					atletas.forEach(out::println);
					System.out.println();
				}
				
			}
			else {
				menu = false;
			}
			
		}
		while (menu);
		
		sc.close();
	}

}
