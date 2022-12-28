package Hash.HashSet;

import java.util.HashSet;

public class UnionOfTwoUnsortedArrays {
    public static void main(String args[])
    {
        int arr1[] = {1,2,3,1,1,2,2,1,1,2,1,2,1,};
        int arr2[] = {4,3,2,2,3,2,1,3,2,1};
        int result = unionOfArrays(arr1, arr2);
        System.out.println(result);

    }
    static int unionOfArrays(int arr1[], int arr2[])
    {

        HashSet<Integer> hs = new HashSet<Integer>();

        // iteration of 1st array
        for(int i : arr1)
        {
            hs.add(i);
        }

        // iteration of 2nd array
        for(int i : arr2)
        {
            hs.add(i);
        }
        System.out.println(hs.toString());


        return hs.size();
    }
}
