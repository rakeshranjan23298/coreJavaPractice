//package practice_program;
//import java.util.Scanner;
//public class ChkVowelInString 
//{
//    public static void main(String [] args)
//    {
//        String str="";
//        System.out.println(" enter String value to check vowel");
//        Scanner sc=new Scanner(System.in);
//        str=sc.next();
//        int count=1;
//        for(int i=0;i<str.length()-1;i++)   // 1st way 
//        {
//            if(str.charAt(i)=='a'||str.charAt(i)=='A' ||str.charAt(i)=='e'||str.charAt(i)=='E' || str.charAt(i)=='i'||str.charAt(i)=='I' ||str.charAt(i)=='o'||str.charAt(i)=='O' ||str.charAt(i)=='u'||str.charAt(i)=='U')
//            {
//                System.out.println(" vowel found at index"+count +" and vowel ="+str.charAt(i));
//            }
//            count++;
//        }
//        
//        
//    }
//}




public class ChkVowelInString {

	public static void main(String[] args) {
		System.out.println(stringContainsVowels("Hello")); // true
		System.out.println(stringContainsVowels("TV")); // false
	}

	public static boolean stringContainsVowels(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	}

}
