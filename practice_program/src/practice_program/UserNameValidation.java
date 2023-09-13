package practice_program;

import java.util.Scanner;
public class UserNameValidation 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        boolean status = true;

        if (name.length() < 4 || name.length() > 25) {
            status = false;
        }

        for (int i = 0; i < name.length(); i++) 
        {
            char c = name.charAt(i);

            if (!Character.isLetter(c) && !Character.isDigit(c) && c != '_') {
                status = false;
                break;
            }
        }
        if (!Character.isLetter(name.charAt(0))) {
            status = false;
        }
        if (!name.contains("_")) {
            status = false;
        }
        System.out.println("name =" + name + " and status =" + status);
    }
}
