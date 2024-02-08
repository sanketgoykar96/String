/**
 * Palindrome_Word
 */
public class Palindrome_Word {
  
        public static void main(String args[]) {
        String s1 = " hello nayan nitin how are you";
        String s2[] = s1.split(" " );
    
        for(int i =0;i<s2.length;i++)
        
        if(s2[i].equalsIgnoreCase(new StringBuilder(s2[i]).reverse().toString()))
        System.out.println(s2[i]);
        }
    }
    