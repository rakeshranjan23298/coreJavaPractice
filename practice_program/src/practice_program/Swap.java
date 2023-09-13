package practice_program;
import java.util.*;
public class Swap 
{
    public static void main(String [] args)
    {
        System.out.println("Enter 2 value in num1 and num2=====");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        
        System.out.println("before swap num1 = "+num1+" num2 = "+num2);        
        // without taking 3rd variable

//        num1=num1+num2;
//        num2=num1-num2;
//        num1=num1-num2;


// using 3rd variable
        int num3=num1;
        num1=num2;
        num2=num3;
        
        System.out.println("after swap num1 = "+num1+" num2 = "+num2);
        
        
    }
}
