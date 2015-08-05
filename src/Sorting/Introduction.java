package Sorting;

import java.util.Scanner;

public class Introduction {
	
	public static int binarySearch(int arr[], int key, int begin, int end){
		int medium = (begin + end) / 2;
		if(arr[medium] == key)
			return medium;
		else if(begin >= end)
			return -1;
		else if(arr[medium] > key)
			return binarySearch(arr, key, begin, medium - 1);
		else
			return binarySearch(arr, key, medium + 1, end);
	}
	
	public static int binarySearch(int arr[], int key){
		return binarySearch(arr, key, 0, arr.length - 1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int v = sc.nextInt();
        int n = sc.nextInt();
        int num[] = new int[n];
        sc.nextLine();
        String str = sc.nextLine();
        String arr[] = str.split("\\s+");
        for(int i = 0; i < n; i++)
        	num[i] = Integer.valueOf(arr[i]);
     
        System.out.println(binarySearch(num, v));  	
        sc.close();
	}
}
