package warmUp;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AngryProfessor {

	public static class TestCase {
		 public int N;
	     public int K;
	     public int students[]; 
	     
	     public TestCase()
	     {
	    	 this.N = 0;
	    	 this.K = 0;
	    	 students = null;
	     }
	     
	     @Override
	     public String toString() {
	     	String str = "" + N + " " + K + " ";
	     	
	     	for(int i = 0; i < students.length; i++)
	     		str += students[i] + " ";
	     	return str;
	     }
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();
        TestCase testCases[] = new TestCase[numberOfTestCases];
        for(int i = 0; i < testCases.length; i++)
        	testCases[i] = new TestCase();
        String ars = sc.nextLine();
 
        
        for(int i = 0; i < numberOfTestCases; i++){
            String line1 = sc.nextLine();
            String str[] = line1.split("\\s+");
            testCases[i].N = Integer.valueOf(str[0]);
            testCases[i].K = Integer.valueOf(str[1]);
            String line2 = sc.nextLine();
            String str2[] = line2.split("\\s+");
            testCases[i].students = new int[str2.length];
            for(int j = 0; j < str2.length; j++)
                testCases[i].students[j] = Integer.valueOf(str2[j]);
        }
        
        for(int i = 0; i < testCases.length; i++)
        {
        	TestCase temp = testCases[i];
        	int counter = 0;
        	for(int j = 0; j < temp.students.length; j++)
        		if(temp.students[j] <= 0)
        			counter++;
        	if(counter >= temp.K)
        		System.out.println("NO");
        	else
        		System.out.println("YES");
        }
        
        sc.close();
        
    }
}
