public class Count_Character {
    public static void main(String args[]){

        String s1 =" hello!! Where are you??? i am fine,..";
        int count=0;
        for(int i=0;i<s1.length();i++)
        if(!(Character.isLetterOrDigit(s1.charAt(i))||Character.isWhitespace(s1.charAt(i))))
        count++;
        System.out.println(count);
    }
}