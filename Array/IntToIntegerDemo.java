package Array;

import java.util.Arrays;

public class IntToIntegerDemo {
    public static void main(String args[])
    {
        int arr[] = { 1,2,3,4};
        Integer arr1[] = new Integer[arr.length];

        // Naive Solution
        for(int i = 0 ; i<arr.length;i++)
        {
            arr1[i] = Integer.valueOf(arr[i]);
            System.out.println(arr1[i]);
            //System.out.println(Arrays.toString(arr1));
            //System.out.println(arr1.getClass());
        }

        // Using Java 8

        Integer arr2[] = Arrays.stream(arr)
                .boxed()
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr2));
    }
}
