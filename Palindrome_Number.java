/**
 * Palindrome_Number
 */
import java.util.*;
public class Palindrome_Number {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int num = sc.nextInt();
        int org_num = num;
        int rev = 0;
        while (num!=0) {
            rev*=10;
            rev+=num%10;
            num/=10;
        }
        if(org_num==rev){
            System.out.println(org_num+ " Palindrome number");
        }
        else
        System.out.println(org_num+ " not palindrome number");
    }
}