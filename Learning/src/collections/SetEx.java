package collections;

import java.util.*;

/**
 * Created by Raghav Arora on 13-08-2016.
 */
public class SetEx {

    public static void main(String[] args) throws InterruptedException {

        Set<String> set = new TreeSet<String>();
        set.add("raghav");
        set.add("varun");
        set.add("raghav");
        set.add("asdfas");
       // List<String> list = new ArrayList<String>();

        for (String i : set)
        {
            System.out.println(i);
        }
//        Collections.sort(list);
//
//        for (String i : list)
//        {
//            System.out.println(i);
//        }
    }
}
