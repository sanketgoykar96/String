class Reverse_String{
    public static void main(String args[]){

        String str = "Programming";

        // Approch 1 

        char[]chArr = str.toCharArray();
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(chArr[i]);
        }

        // Approch 2
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }


        // Approch 3

        StringBuilder sb = new StringBuilder(str);
        System.out.print(sb.reverse());

        // Approch 4
        StringBuffer sb1 = new StringBuffer(str);
        System.out.print(sb1.reverse());
    }
}