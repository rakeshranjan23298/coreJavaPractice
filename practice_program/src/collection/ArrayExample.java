package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayExample 
{
    public static void main(String[] args) 
    {
        int i=0;
        int arr[]=new int[5];
        ArrayList li=new ArrayList();   //- 
        ArrayList<Integer> li2=new ArrayList<Integer>();
        ArrayList<String> strli=new ArrayList<String>();
        
        
        li.add(50);
        li.add(154);
        li.add(550);
        li.add(550);
        
//        li2.set(0, 999);              // use set and get example
//        System.out.println("list 2 element using get="+li.get(0));
        
        Iterator it=li.iterator();              // iterate using iterator
        while(it.hasNext())
        {
            System.out.println("");
        }

        strli.add("hello");
        strli.add("raj");
        strli.add("Goli ");
        strli.add("kahyega");
        
        for(Object arrr: strli)                 // iterate using for each
        {
            System.out.println("list item ="+arrr);
        }
        
    }
}
