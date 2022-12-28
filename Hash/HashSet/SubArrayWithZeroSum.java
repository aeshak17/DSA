package Hash.HashSet;

import java.util.HashSet;

public class SubArrayWithZeroSum {
    public static void main(String args[])
    {
        int arr[] = { 3,4,3,-1,1};
        int arr2[] = { 5,1,4,7,1,4,7};

        System.out.println(is0SubArray(arr));
    }
    static boolean is0SubArray(int arr[])
    {
        HashSet<Integer> hs = new HashSet<Integer>();
        int pre_sum = 0;

        for(int i=0; i< arr.length; i++)
        {
            //System.out.println(hs.toString());
            pre_sum += arr[i];
            if(hs.contains(pre_sum)) {
                //System.out.println(i);
                // means i == 0
                return true;
            }
            if(pre_sum == 0)
            {
               // System.out.println(i+" ggg");
                return true;
            }

            hs.add(pre_sum);
        }
        return false;
    }
}
