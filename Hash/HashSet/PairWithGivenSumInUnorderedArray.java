package Hash.HashSet;

import java.util.HashSet;

public class PairWithGivenSumInUnorderedArray {
    public static void main(String args[])
    {
        int arr1[] = { 1,2,3,4,-1,9};
        int arr2[] = {11, 5, 6};
        int sum = 10;
        System.out.println(sumExist(arr2, sum));
    }
    static boolean sumExist(int arr[], int sum)
    {
        Boolean result = false;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i<arr.length;i++)
        {
            if(hs.contains(sum-arr[i]))
            {
                return true;
            }
            else
            {
                hs.add(arr[i]);
            }
        }
        return result;
    }
}
