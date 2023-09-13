package practice_program;

import java.util.Scanner;

public class InterSection {

    public static void main(String[] args) {
//      int arr1[] = new int[5];
        int arr1[] = {1, 23, 12, 6};
        int arr2[] = {12, 23, 43, 56};

        int max_size = arr2.length+arr1.length;
        int[] arr_sum=new int[max_size];
        int intArr[]=new int[max_size];
        
        
        Scanner sc = new Scanner(System.in);
        
//        int j=0;
//        //Sum
//        for (int i = 0,k=0; i < max_size;) 
//        {
//            for(;j<arr1.length;j++,i++)
//            {
//                arr_sum[i]=arr1[j];
//            }
//            arr_sum[i]=arr2[k];
//            k++;
//            i++;
//        }
        

//check duplicate 
        int k,i;
        for(i=0,k=0;i<arr1.length;i++)
        {  
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    arr_sum[k]=arr1[i];
                }
            }
            k++;
        }
        

        for (int j = 0; j < max_size;j++) 
        {
            if(arr_sum[j]!=0)
            {
                System.out.println("sum of all array is ="+arr_sum[j]);
            }
        }
        
    }

}
