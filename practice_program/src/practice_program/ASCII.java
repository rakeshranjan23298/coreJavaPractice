package practice_program;
public class ASCII 
{
    public static void main(String[] args) 
    {
        int first='a';
        char ch=97;
//      System.out.println(ch+"="+first);
        
        for(int i=0;i<26;i++)
        {
            System.out.println(ch+"  =  "+first);
            ch++;
            first++;
        }
        
        int firstt='A';
        char chh=65;
//      System.out.println(chh+"="+firstt);
        
        for(int i=0;i<26;i++)
        {
            System.out.println(chh+"  =  "+firstt);
            chh++;
            firstt++;
        }        
        
 
    }
}
