package warmUp;

import java.util.Scanner;

public class TheLoveLetterMystery 
{
	public static int palindromeDistance(String str)
	{
		int distance = 0;
		char[] arr = str.toCharArray();
		int begin = 0;
		int end = arr.length - 1;
		
		while(begin < end)
		{
			if(arr[begin] == arr[end])
			{
				begin++; end--;
			}
			else
			{
				while(arr[begin] != arr[end])
				{
					if(arr[end] > arr[begin])
					{
						arr[end]--;
						distance++;
						if(arr[end] == 'a')
							break;
					}
					else
					{
						arr[begin]--;
						distance++;
						if(arr[end] == 'a')
							break;
					}
				}
			}
		}
		return distance;
	}
	
	public static int palindromeDistance2(String str)
	{
		int distance = 0;
		int begin = 0;
		int end = str.length() - 1;
		
		while(begin < end)
			distance += Math.abs(str.charAt(begin++) - str.charAt(end--));
		
		return distance;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		String arr[] = new String[numberOfTestCases];
		for(int i = 0; i < numberOfTestCases; i++)
		{
			arr[i] = sc.nextLine();
		}
		
		for(int i = 0; i < numberOfTestCases; i++)
			System.out.println(palindromeDistance2(arr[i]));
	}
}
