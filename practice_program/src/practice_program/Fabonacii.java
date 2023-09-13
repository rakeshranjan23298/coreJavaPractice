package practice_program;

import java.util.Scanner;

public class Fabonacii 
{

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number upto Which you want fabonacci series ----");
        int num=sc.nextInt();
        
        int pre=0;
        int val=1;
        int next=0;
  
        System.out.println(pre+","+val+",");
        
        for(;next<num;)
        {
            next=val+pre;
            System.out.println(next+",");
            pre=val;            
            val=next;
        }
        
        
        
        
    }
}
