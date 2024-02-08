 public class Vowels_Capital_String {

    public static void main(String[] args) {
        
       String s1 = " hello i am java developer";
       String vowels = "AEIOUaeiou";

       StringBuilder sb = new StringBuilder();

       for(int i=0;i<s1.length();i++)
       if(vowels.contains(String.valueOf(s1.charAt(i))))
       sb.append(Character.toUpperCase(s1.charAt(i)));
       else
       sb.append(s1.charAt(i));
       System.out.println(sb);
        
    }
}