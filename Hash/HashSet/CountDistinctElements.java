package Hash.HashSet;

import java.util.Arrays;
import java.util.HashSet;

public class CountDistinctElements {
    public static void main(String args[])
    {
        int arr[] = { 1,1,2,3,2,4,5,3,7,4,1};
        int result = countDistinctElement(arr);
        System.out.println(result);

        Integer arr1[] = {1,2,3,4,4,2};
        System.out.println(countDistinctElement(arr1));
    }
    static int countDistinctElement(int arr[])
    {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i= 0; i<arr.length; i++)
        {
            hs.add(arr[i]);
        }
        return hs.size();
    }
    static int countDistinctElement(Integer arr[])
    {
        HashSet<Integer> hs = new HashSet<Integer>(Arrays.asList(arr));
        return hs.size();
    }
}
