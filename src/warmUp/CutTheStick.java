package warmUp;

import java.util.Scanner;

public class CutTheStick 
{
	public static int min(int arr[])
	{
		int min = Integer.MAX_VALUE;
		int minIndex = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] < min && arr[i] != 0)
			{
				min = arr[i];
				minIndex = i;
			}
		}
		
		return minIndex;
	}
	
	public static int cutSticks(int arr[])
	{
		int minElement = arr[min(arr)];
		int numberOfStics = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] != 0)
			{
				arr[i] = arr[i] - minElement;
			}				
		}
		for(int i = 0; i < arr.length; i++)
			if(arr[i] != 0)
				numberOfStics++;
		return numberOfStics;
	}
	
	public static void printArray(int arr[])
	{
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfSticks = sc.nextInt();
		sc.nextLine();
		int sticks[] = new int[numberOfSticks];
		String str = sc.nextLine();
		String arr[] = str.split("\\s+");
		for(int i = 0; i < arr.length; i++)
			sticks[i] = Integer.valueOf(arr[i]);
		
		int cuttingSticks = sticks.length;
		System.out.println(numberOfSticks);
		while(cuttingSticks != 0)
		{
			cuttingSticks = cutSticks(sticks);
			if(cuttingSticks != 0)
				System.out.println(cuttingSticks);
		}
	}
}
