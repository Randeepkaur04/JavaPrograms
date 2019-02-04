
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
public class gpSeries {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0)
        {
           int n=sc.nextInt();
           int fac=1;
           if(n<=4)
           {
           for(int i=1;i<=n;i++)
           {
               fac=fac*i;
           }
            System.out.println(fac%10);
           }else
           {
               System.out.println("0");
           
           }
        }
    
    }
    
}
