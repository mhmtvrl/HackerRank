package Sorting;

import java.util.Scanner;

public class InsertionSortPart1 {
	
	public static void print(int num[]){
		for(int i = 0; i < num.length; i++)
			System.out.print(num[i] + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();
        int num[] = new int[n];
        sc.nextLine();
        String str = sc.nextLine();
        String arr[] = str.split("\\s+");
        for(int i = 0; i < n; i++)
        	num[i] = Integer.valueOf(arr[i]);
        
        int target = num[num.length - 1];       
        int i = num.length - 1;
        while(i > 0 && target < num[i - 1]){
        	num[i] = num[i - 1];
        	i--;
        	print(num);
        }
        num[i] = target;
        print(num);
        
        sc.close();
	}
}
