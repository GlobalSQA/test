package collections;

import java.util.*;

/**
 * Created by Raghav Arora on 13-08-2016.
 */
public class MapEx
{
    public static void main(String[] args) {
        Map<Integer, String> list = new HashMap<Integer, String>();
        list.put(526, "Raghav : Works at RBS");
        list.put(527, "Varun : Works at AON");
        list.put(526, "Raghav1 : Works at IHS Markit");
        list.put(528, "asdfas : Works at GlobalSQA");
//        System.out.println(list.get(526));
        for (int i : list.keySet())
        {
            System.out.println(list.get(i));
        }
    }
}
