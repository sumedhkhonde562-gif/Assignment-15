package question3;

// check identity matrix 

import java.util.Scanner;

public class IdentityMatrix {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] mat = new int [n][n];
		 boolean Identity = true;
		 
		 for( int i = 0; i< n; i++) {
			 for (int j = 0; j < n; j++) {
				 mat[i][j] = sc.nextInt();
				 
				 
				 if( i == j && mat[i][j] !=1) {
					 Identity = false;
					 
				 }
				 
				 if( i !=j && mat[i][j] !=0) {
					 Identity = false;
				 }
			 }
		 }
		 
		 if(Identity)
			 System.out.println("Yes");
		 else
			 System.out.println("No");
		 
	}

}
