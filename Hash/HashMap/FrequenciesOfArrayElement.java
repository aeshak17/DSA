package Hash.HashMap;

import java.util.HashMap;
import java.util.Map;

public class FrequenciesOfArrayElement {
    public static void main(String args[])
    {
        int arr[]= {1,2,3,3,3,3,3,1,1,1,1,2,2,2,2,4,2,3,1,2,3};
        frequenciesOfArrayElements(arr);
    }
    static void frequenciesOfArrayElements(int arr[])
    {
        HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
        for(int i = 0; i<arr.length; i++)
        {
            // either this
            //int count = hs.containsKey(arr[i]) ? hs.get(arr[i]) +1 : 0;
            // hs.put(arr[i], count);
            // or this
            hs.put(arr[i], hs.getOrDefault(arr[i], 0) +1);
        }

        for(Map.Entry<Integer, Integer> m : hs.entrySet())
        {
            System.out.println(m.getKey() + " -> "+ m.getValue());

        }
        System.out.println(hs.getOrDefault(6, 0));

    }
}
