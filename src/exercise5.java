import java.util.Scanner;
/*Write a program that will check whether the number entered
from the keyboard is a palindrome (equally readable in both
directions). For example, 123454321 or 221122 is a palindrome.
The program should output YES if the number is a palindrome,
otherwise NO*/
public class exercise5 {
    public static void main(String[] args) {
        System.out.println("Введите число!");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        String str = Integer.toString(x);
        StringBuilder str2 = new StringBuilder(str);
        str2.reverse() ;
        int y = Integer.parseInt(String.valueOf(str2));
        if (x==y)
            System.out.println("Yes");
        else System.out.println("No");


    }

}
