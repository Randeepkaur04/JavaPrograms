
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
public class Factorial {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int testCase=sc.nextInt();
        while(testCase-- >0)
        {
            int n=sc.nextInt();
            long fac=1;
            for(int i=1;i<=n;i++)
            {
                fac=(fac*i);
            }
            System.out.println(fac);
        }
   }
}
