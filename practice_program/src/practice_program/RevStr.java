package practice_program;

import java.util.Scanner;

class RevStr
{
    public static void main(String[]args)
    {
        String str="";
        String rev="";
        System.out.println(" enter any String value -");
        
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        System.out.println(" Str value ="+str+" before reverse" );
        
        // =--------------------------------------------  2nd way -------------------------        
        for(int i=str.length()-1;i>=0;i--)
        {
            rev+=str.charAt(i);
        }
        System.out.println(" after reverse ="+rev);
        
        // =--------------------------------------------  1 way -------------------------
//        String [] rev=str.split("");
//        String newstr="";
//        for(int i=rev.length-1;i>=0;i--)
//        {
//            newstr+=rev[i];
//        }
//        System.out.println("after revesring ="+newstr);

    }
}