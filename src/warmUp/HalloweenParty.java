package warmUp;

import java.util.Scanner;

public class HalloweenParty {
	
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int numberOfTestCases = sc.nextInt();
		
		long arr[] = new long[numberOfTestCases];
		
		for(int i = 0; i < numberOfTestCases; i++)
			arr[i] = sc.nextInt();
		
		for(int i = 0; i < numberOfTestCases; i++){
			if(arr[i] % 2 == 0)
				System.out.println((arr[i] / 2) * (arr[i] / 2));
			else
				System.out.println((arr[i] / 2) * ((arr[i] / 2) + 1));
		}
	}
}
