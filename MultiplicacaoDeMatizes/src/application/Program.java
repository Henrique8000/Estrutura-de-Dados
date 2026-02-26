package application;

import java.util.Random;

public class Program {

	static int count = 0;
	
	public static void main(String[] args) {

		int[][] A = new int[10][10];
		int[][] B = new int[10][10];

		// preenche as matrizes A e B com números aleatórios
		preencheA(A);
		preencheB(B);
		
		// cria a matriz C para receber o resultado 
		int[][] C = new int[A.length][B[0].length];
		C = multiplica(A, B); 
		exibeResult(C);
		
		System.out.println("Operações realizadas: " + count);
		

	}

	public static void preencheA(int A[][]) {
		Random gerador = new Random();

		for (int l = 0; l < A.length; l++) {
			for (int c = 0; c < A[l].length; c++) {
				A[l][c] = gerador.nextInt(9);
			}
		}

	}

	public static void preencheB(int B[][]) {
		Random gerador = new Random();

		for (int l = 0; l < B.length; l++) {
			for (int c = 0; c < B[l].length; c++) {
				B[l][c] = gerador.nextInt(9);
			}
		}

	}

	public static void exibeResult(int MAT[][]) {

		for (int l = 0; l < MAT.length; l++) {
			for (int c = 0; c < MAT[l].length; c++) {
				System.out.print(MAT[l][c] + ", ");
			}
			System.out.println();
		}

	}

	public static int[][] multiplica(int[][] A, int[][] B) {
		
		int[][] C = new int[A.length][B[0].length];
		for (int i = 0; i < A.length; i++)
			for (int j = 0; j < B[0].length; j++) {
				C[i][j] = 0;
				for (int k = 0; k < A[0].length; k++) {
					C[i][j] += A[i][k] * B[k][j];
					count += 1;
				}
			}
		return C;
	}

}
