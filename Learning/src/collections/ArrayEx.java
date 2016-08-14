package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Raghav Arora on 13-08-2016.
 */
public class ArrayEx {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<String>(); // create arraylist and assign it to List
        colors.add("Raghav");  // add elements to arraylist
        colors.add("Varun");
        colors.add("asdfs");
        colors.add("blue");
        colors.add("maroon");
        Collections.sort(colors); // sort the string elements alphabetically
        System.out.println("sorted list" + colors);//print sorted arraylist
    }
}
