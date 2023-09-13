package temp;
public class Fact 
{
    public static void main(String[] args) {
        int num=8;
        int fact=1;
        for(int i=1;i<num;i++)
        {
            fact=fact*(i+1);
        }
        
        
        System.out.println("fact ="+fact);
    }
    
}
