public class ReverseAnArray {

    public static void main(String args[])
    {
        int arr[] = { 1,2,3,4,5};
        for(int i=0; i < arr.length; i++)
        {
            System.out.println(i+" index = "+arr[i]);
        }
        reverseArray(arr);
        for(int i=0; i < arr.length; i++)
        {
            System.out.println(i+" index = "+arr[i]);
        }
    }
    static void reverseArray(int arr[])
    {
        int j= arr.length-1;
        for(int i=0; i<j; i++, j--)
        {
            int temp;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
