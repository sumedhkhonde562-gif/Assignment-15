package question4;

// Matrix Multiplication 
import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		        int[][] A = new int[2][2];
		        int[][] B = new int[2][2];
		        int[][] C = new int[2][2];

		        // Prompt for Matrix A
		        System.out.println("Matrix A (2x2):");
		        for (int i = 0; i < 2; i++) {
		            for (int j = 0; j < 2; j++) {
		                A[i][j] = sc.nextInt();
		            }
		        }

		        // Prompt for Matrix B
		        System.out.println("Matrix B (2x2):");
		        for (int i = 0; i < 2; i++) {
		            for (int j = 0; j < 2; j++) {
		                B[i][j] = sc.nextInt();
		            }
		        }

		        // Matrix Multiplication Logic
		        for (int i = 0; i < 2; i++) {
		            for (int j = 0; j < 2; j++) {
		                for (int k = 0; k < 2; k++) {
		                    C[i][j] += A[i][k] * B[k][j];
		                }
		            }
		        }

		        // Output Result
		        for (int i = 0; i < 2; i++) {
		            for (int j = 0; j < 2; j++) {
		                System.out.print(C[i][j] + " ");
		            }
		            System.out.println();
		        }

		        sc.close();
		    }
		
		
	}
	


