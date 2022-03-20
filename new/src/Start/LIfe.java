package Start;

import java.util.Scanner;

public class LIfe {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the value");
		int n=sc.nextInt();
		
		if(n%2==0) {
			System.out.println("this is even");
			
		}
		else {
			System.out.println("this is odd");
		}

	}

}
