package warmUp;

import java.util.Scanner;

public class FindDigits {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfTestCases = sc.nextInt();
		
		long arr[] = new long[numberOfTestCases];
		
		for(int i = 0; i < numberOfTestCases; i++)
			arr[i] = sc.nextInt();
		
		for(int i = 0 ; i < numberOfTestCases; i++){
			long number = arr[i];
			int counter = 0;
			while(number != 0){
				long digit = number % 10;
				if(digit != 0 && arr[i] % digit == 0)
					counter++;
				number /= 10;
			}
			System.out.println(counter);
		}		
	}
}
