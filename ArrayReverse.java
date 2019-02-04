
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class ArrayReverse {
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int testCases=sc.nextInt();
        while(testCases-- >0)
        {
            int i;
            int n=sc.nextInt();
            int a[]=new int[n];
            for(i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            for(i=n-1;i>=0;i--)
            {
                System.out.print(a[i]+ " ");
                
            }
           System.out.println();//this step for multiple test cases
        }
    }
}
