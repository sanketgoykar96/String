public class First_to_Last {
    public static void main(String[] args) {
        String s1 = "INDIA";
        
        // Approch 1
     //    String s2 ="";
     //    for(int i=1;i<s1.length();i++)
     //    s2+=s1.charAt(i);
     //    s2+=s1.charAt(0);
     //    System.out.println(s2);
 
     // Approch 2 StringBuilder
    
     StringBuilder sb = new StringBuilder();
     for(int i=1;i<s1.length();i++)
     sb.append(s1.charAt(i));
     sb.append(s1.charAt(0));
     System.out.println(sb);
     }

}
