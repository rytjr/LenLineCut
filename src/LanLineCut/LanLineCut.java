package LanLineCut;

import java.util.Scanner;

public class LanLineCut {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Num1 = sc.nextInt();
		int Num2 = sc.nextInt();
		
		int[] arr = new int[Num1];
		
		for(int i = 0; i < Num1; i++) {
			arr[i] = sc.nextInt();
		}
		
		long max = Integer.MAX_VALUE;
		long min = 0;
		long Maximum = 0;
		
		while(min <= max) {
			
			long middle = min + (max - min) / 2;
			
			int count = 0;
			
			for(int i = 0; i < Num1; i++) {
				count += arr[i]/middle;
			}
			
			if(count >= Num2 ) Maximum = middle;
			
			if(count >= Num2) {
				min = middle + 1;
			}
			else {
				max = middle - 1;
			}
		}
		
		System.out.print(Maximum);
	}

}
