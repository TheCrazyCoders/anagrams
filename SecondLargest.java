package Testing;


import java.lang.*;
import java.util.Scanner;
import java.io.*;

class GFG {
	public static void main (String[] args)
	{
	    Scanner s = new Scanner(System.in);
	    int n=s.nextInt();
	    for(int k=0;k<n;k++)
	    {
	        int m=s.nextInt();
	        int arr[]= new int[m];
	        for(int j=0;j<m;j++)
	        {
	            arr[j]=s.nextInt();
	        }
	        int i, first,second;
	        
       
      
            int arr_size=arr.length;
        first = second = 0; 
        for (i = 0; i < arr_size ; i++) 
        { 
            
            if (arr[i] > first) 
            { 
                second = first; 
                first = arr[i]; 
            } 
       
           
            else if (arr[i] > second && arr[i] != first) 
                second = arr[i]; 
        } 
          
        System.out.println(second);
        System.out.println(s);
	    }
	    
	}
}