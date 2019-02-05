
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
public class CountSmallerElement {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int testCase=sc.nextInt();
        while(testCase-- >0)
        {
            
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<a.length;i++)
            {
                a[i]=sc.nextInt();
            }
            for(int i=0;i<(n-1);i++)
            {
                long c=0;
                for(int j=(i+1);j<n;j++)
                {
                    if(a[j]<a[i])
                    {
                        c++;
                        
                    }
                }
                System.out.print(c+" ");
            }System.out.print("0");
            System.out.println();}
         }
    
    }
    

