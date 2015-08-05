package Sorting;

import java.util.Scanner;

public class InsertionSortPart2 {
	public static void insertionSortPart2(int[] ar){       
		for(int i = 1; i < ar.length; i++){
			insertIntoSorted(ar, i);
			
		}
    }  
    
	public static void insertIntoSorted(int[] ar, int j) {
	    
        int target = ar[j];       
        int i = j;
        while(i > 0 && target < ar[i - 1]){
        	ar[i] = ar[i - 1];
        	i--;
        }
        ar[i] = target;
        printArray(ar);
    }
      
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
