package Hash.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String args[])
    {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Aesha", 10);
        map.put("Anurag", 11);
        map.put("Test1", 1);
        map.put("Test2", 2);
        System.out.println(map.size());
        map.remove("Test1");

        // for iteration
        for(Map.Entry<String, Integer> e : map.entrySet())
        {
            System.out.println(e.getKey()+" => "+e.getValue());
        }

        if(map.containsValue(1))
        {
            System.out.println("yes exist");
        }
        // get() return value of the key, if key doesn't exist it returns null
        System.out.println(map.get("ccc"));

        //
        map.containsValue(10);

    }
}
