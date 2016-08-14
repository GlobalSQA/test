package collections;

import java.util.*;

/**
 * Created by Raghav Arora on 13-08-2016.
 */
public class MapEx
{
    public static void main(String[] args) {
        Map<Integer, String> list = new TreeMap<Integer, String>();
        list.put(526, "Raghav");
        list.put(527, "Varun");
        list.put(526, "Raghav");
        list.put(528, "asdfas");

        for (int i : list.keySet())
        {
            System.out.println(list.get(i));
        }
    }

}
