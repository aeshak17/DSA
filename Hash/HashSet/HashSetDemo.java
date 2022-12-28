package Hash.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String args[]) {

        HashSet<String> hs = new HashSet<String>();
        hs.add("A");
        hs.add("E");
        hs.add("S");
        hs.add("H");
        hs.add("A");

        for(String s : hs)
        {
            System.out.print(s+" ");
        }
        // remove()
        System.out.println(hs.remove("Y"));
        // size()
        System.out.println(hs.size());
        // isEmpty()
        System.out.println(hs.isEmpty());
        // contains
        System.out.println(hs.contains("A"));

        // clear()
        hs.clear();

        // second way to iterate
        Iterator<String> i = hs.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        // clear()
        hs.clear();

    }
}
