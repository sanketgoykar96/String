public class LongestWord {
    public static void main(String args[]){
        String s1 = "Welcome to international airport";
        int max =0;

        String s2[] = s1.split(" ");
        for(int i=0;i<s2.length;i++)
        if(max<s2[i].length())
        max = s2[i].length();
        
        for(int i=0;i<s2.length;i++)
        if(max==s2[i].length())
        System.out.println(s2[i]);

        
    }
}
