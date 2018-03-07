package pack;

import java.util.Scanner;

public class HarmonicSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		double sum = 0.0;
		System.out.println("Enter the number:");
		n = sc.nextInt();
		for(int i=1;i<=n; i++)
		{
			sum = sum +(double) 1/i;
			
		}
		
		System.out.println("The nth harmonic value is:" + sum);
          
	}

}
