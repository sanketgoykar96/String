public class Seperate_Vowels {
    public static void main(String[] args) {
         
        String s1 = " hello i am java developer";
       
        String s2[] =  s1.split(" ");
        String vowels = "AEIOUaeiou";
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<s2.length;i++)
        {
            String temp = s2[i];
            for(int j=0;j<temp.length();i++)
            if(!vowels.contains(String.valueOf(temp.charAt(j))))
            sb.append(temp.charAt(j));
            for(int j=0;j<temp.length();j++)
            if (vowels.contains(String.valueOf(temp.charAt(j))))
            sb.append(temp.charAt(j));

            if(i<s2.length-1)
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
