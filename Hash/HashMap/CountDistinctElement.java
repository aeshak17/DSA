package HashMap;

import java.util.HashMap;

public class CountDistinctElement {
    public static  void main(String args[])
    {
        int arr[] = { 1,4,5,6,1,2,3,4,1,2,1,1,1,4,7};
        countElements(arr);

    }
    static void countElements(int arr[])
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr)
        {
            if(map.containsKey(i))
            {
                //increment the count by 1
                int count = map.get(i)+1;
                map.put(i, count);
            }
            else
            {
                map.put(i, 1);
            }
        }
        map.forEach((key, value) -> System.out.println(key + " = "+value));
//        map.forEach(
//                (key, value)
//                        -> System.out.println(key + " = " + value));
    }
}
