

import java.util.*;

public class Palindrome_String {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String : " );
        

        String str = sc.next();
        String org_str = str;
        String rev ="";
        int len = str.length();
        for(int i = len-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if(org_str.equals(rev)){
            System.out.println(org_str+" is palindrome Strign");

        }
        else
        System.out.println(org_str+ " is not Palindrome number");
    }
}
