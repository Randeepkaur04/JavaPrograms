
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
public class PrimeNo {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0)
        {
            boolean isPrime=false;
            int n=sc.nextInt();
            for(int i=2;i<=n/2;i++)
            {
                if(n%i==0)
                {
                    isPrime=true;
                    break;
                }
            }
            if(!isPrime)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
     } 
}
