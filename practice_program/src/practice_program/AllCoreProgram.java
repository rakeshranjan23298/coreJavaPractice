package practice_program;

import java.util.Scanner;

public class AllCoreProgram 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        
        int num=sc.nextInt();
        AllCoreProgram a1=new AllCoreProgram();
        
//        boolean armstrong=a1.isArmstring(num);
//        System.out.println(""+armstrong);


        
        
    }
// to check a number is armstrong or not eg- 153= 1cube+5 cube+3 cube= 153 
    boolean isArmstring(int num)
    {
        int temp=num;
        int newnum=0;
        while(num>0)
        {
            int d=num%10;
            newnum=newnum+(d*d*d);
            num=num/10;
        }
        if(newnum==temp)
        {
            return true;
        }else 
            return false;
        
    }
    
    
    
}
