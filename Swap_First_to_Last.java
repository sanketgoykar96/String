public class Swap_First_to_Last {
    public static void main(String[] args) {
        String s1 = "India";
        StringBuilder sb = new StringBuilder();
        sb.append(s1.charAt(s1.length()-1));
        for(int i=1;i<s1.length()-1;i++)
        sb.append(s1.charAt(i));
        sb.append(s1.charAt(0));
        System.out.println(sb);
    }
}
