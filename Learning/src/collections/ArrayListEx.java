package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by DELL on 13-08-2016.
 */
public class ArrayListEx {


    /**
     * @see
     * @throws java.io.IOException
     * @param args
     */
    public static void main(String[] args) {

        List<String> list = new LinkedList<String>();
        list.add("Raghav");
        list.add("Varun");
        list.add("Raghav");
        list.add("asdfas");

        for (String i : list)
        {
            System.out.println(i);
        }
    }

}
