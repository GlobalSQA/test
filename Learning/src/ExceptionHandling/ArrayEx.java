package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by DELL on 24-07-2016.
 */
public class ArrayEx {

    public static void main(String[] args) {
        File file = new File("C://abcde.txt");

        try{
        FileReader fr = new FileReader(file);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found.Please enter the correct path");
            throw new RuntimeException();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        int [] arr ={52,20,25,20};
        System.out.println(arr.length);
        for(int i=0;i<=arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
