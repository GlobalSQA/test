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

        List<String> list = new ArrayList<String>();
        list.add("abcd");
        list.add("xyz");
        list.add("abc123");
        list.add("xyz");
        System.out.println(list.contains("Abc123"));
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));

        }

    }

}
