package practice_program;
import java.util.Scanner;

class Array
{
    public static void main(String[]args)
    {
        int i=0;
        // we can declear array by 2 methods
        int arr[]=new int[5];   //array declearation of size 5
        int arr2[]={23,234,43}; //array declearation of size 3(no. of arguments).
        
        Scanner sc=new Scanner(System.in);
        for(i=0;i<arr.length;i++)   
        {
            arr[i]=sc.nextInt();
            
        }
        for(int j:arr)      // for each loop only used for iteration of array
        {
            System.out.println("arrr"+j+"   = "+j);
        }
        
        
        
    }
}
        