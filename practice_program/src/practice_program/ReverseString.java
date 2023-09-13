package practice_program;

import java.net.Socket;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String tmp=str;
        String rev="";
        System.out.println("String length ="+str.length());
        
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        
        System.out.println("String reverse ="+str+" and reverse String ="+rev);
        
        
        
    }
}