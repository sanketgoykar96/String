/**
 * Vowels
 */
public class Vowels {

    public static void main(String args[]){
        int vowels=0;
        int cons= 0;

        String str = " I am Java Developer";
        System.out.println("Original String " +str);
        str = str.toLowerCase();

        for(int i=0;i<str.length();i++)
        if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
            vowels++;
            
        }
        else if (str.charAt(i)>='a' && str.charAt(i)<='z') {
            cons++;
        }
        System.out.println("Total Vowels of String "+ vowels);
        System.out.println("Total Consonants of String " +cons);
    }
}