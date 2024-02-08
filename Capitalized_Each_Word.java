/**
 * Capitalized_Each_Word
 */
public class Capitalized_Each_Word {

    public static void main(String args[]){

        String s1 = " hello i am java developer";
        StringBuilder sb = new StringBuilder();
        String s2[] = s1.split("");

        for(int i=0;i<s2.length;i++){
            sb.append(Character.toUpperCase(s2[i].charAt(0)));
            sb.append(s2[i].substring(1));

            if(i<s2.length-1)
            sb.append("");
        }
        System.out.println(sb);
    }
}