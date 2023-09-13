package practice_program;

public class ArmStrong {

    public static void main(String[] args) {
        int num = 153;
        int temp=num;
        int re=0,d=0;
        for (; num>0; ) 
        {
            re=num%10;
            d=d+(re*re*re);
            num=num/10;
            
        }
        if(temp==d)
        {
            System.out.println("armstrong");
        }else
        {
            System.out.println("not armstrong");
        }
    }

}
