package question2;

/// Largest element in each rowss

import java.util.Scanner;

public class LargestElement {
	public static void main(String[] args) {
		Scanner sk= new Scanner(System.in);
		
		int rows=sk.nextInt();
		int cols=sk.nextInt();
		
		for(int i=0; i<rows;i++) {
			int max = Integer.MIN_VALUE;
			for(int j=0; j<cols; j++) {
				int number = sk.nextInt();
				if(number > max)
					max=number;
				
			}
			System.out.println(max +" ");
		}
		sk.close();
	}
	

}
