package Hash.HashSet;

import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String args[])
    {
        int arr1[] = { 1,2,3,4,5,1,2,3,2};
        int arr2[] = { 11,32,12,11,2,1,1,5};
        int result = intersectionOfArrays(arr1, arr2);
        System.out.print(result);

    }
    static int intersectionOfArrays(int arr1[], int arr2[])
    {
        HashSet<Integer> hs = new HashSet<Integer>();
        int result = 0;
        for(int i=0;i<arr1.length;i++)
        {
            hs.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++)
        {
            if(hs.contains(arr2[i]))
            {
                hs.remove(arr2[i]);
                result++;

            }
        }

        return result;
    }
}
