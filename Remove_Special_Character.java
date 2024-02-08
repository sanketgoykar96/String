/**
 * Remove_Special_Character 
 */
public class Remove_Special_Character {

    public static void main(String[] args) {
        String s1 = "hello !! how are you,.. i am fine?? Thank you";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s1.length();i++)
        if(Character.isLetterOrDigit(s1.charAt(i))||Character.isWhitespace(s1.charAt(i)))
        sb.append(s1.charAt(i));
        System.out.println(sb);
    }
}