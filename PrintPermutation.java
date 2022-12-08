public class PrintPermutation {
    static void printPermutation(String str, String perm)
    {
        if(str.length() == 0)
        {
            System.out.println(perm);
            return;
        }
        for(int i=0; i<str.length(); i++)
        {
            char newChar = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1, str.length());
            printPermutation(newStr, perm + newChar);

        }
    }
    public  static  void main(String args[])
    {
        String str = "ABC";
         printPermutation(str, "" + "");

       // System.out.println(str.substring(0, 0)) ;
        //System.out.println((str.substring(1, str.length())));
    }
}
