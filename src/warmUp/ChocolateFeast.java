package warmUp;

import java.awt.font.NumericShaper;
import java.util.Scanner;

public class ChocolateFeast {
	
	public static class TestCase{
		int N;
		int C;
		int M;
		
		TestCase(){
			this.N = 0;
			this.C = 0;
			this.M = 0;
		}
		@Override
		public String toString() {
			
			return "" + N + " " + C + " " + M;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfTestCase = sc.nextInt();
		TestCase testCases[] = new TestCase[numberOfTestCase];
		sc.nextLine();
		for(int i = 0; i < numberOfTestCase; i++){
			testCases[i] = new TestCase();
			String str = sc.nextLine();
			String arr[] = str.split("\\s+");
			testCases[i].N = Integer.valueOf(arr[0]);
			testCases[i].C = Integer.valueOf(arr[1]);
			testCases[i].M = Integer.valueOf(arr[2]);
		}
		
		for(int i = 0; i < numberOfTestCase; i++){
			int N = testCases[i].N;
			int C = testCases[i].C;
			int M = testCases[i].M;
			
			int numberOfCholateWithMoney = N / C;
			int numberOfCholateWithWrapper = numberOfCholateWithMoney / M;
			int remainder = numberOfCholateWithMoney % M;
			numberOfCholateWithWrapper += (remainder + numberOfCholateWithWrapper) / M;
			System.out.println(numberOfCholateWithMoney + numberOfCholateWithWrapper);
		}
			
		
		sc.close();
		
	}
}
