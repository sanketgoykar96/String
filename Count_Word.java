
public class Count_Word {

    public static void main(String[] args) {
        String s1 ="hello i am java developer";
        int count =0;
        String s2[] = s1.split(" ");
        for(int i=0;i<s2.length;i++)
        if(s2[i].length()!=0)
        count++;
        System.out.println(count);
    }
}
