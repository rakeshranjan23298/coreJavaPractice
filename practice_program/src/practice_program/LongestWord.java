package practice_program;

import java.util.Scanner;
public class LongestWord 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        str=str.replace("^", " ");
        str=str.replace("!", " ");
        str=str.replace("&", " ");
        str=str.replace("/", " ");
        str=str.replace("~", " ");
        
        String split[]=str.split(" ");
        
        int size=0;
        String sizeStr="";
        for(int i=0;i<split.length;i++)
        {
            if(size<split[i].length())
            {
                size=split[i].length();
                sizeStr=split[i];
            }
            
        }
        System.out.println("max size is ="+size+" for "+sizeStr);
        
    }
}
