package practice_program;

import java.awt.BorderLayout;
import java.util.Scanner;

public class ChcekPrime 
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int i,countt=0;
        for(i=2;i<=num1;i++)
        {
            if(num1 % i == 0)
            {
                break;
            }
            countt++;
        }
        if(i==num1)
        {
            System.err.println("prime");
        }else 
            System.out.println("not prime");
        
        System.out.println("");         
    }
}
