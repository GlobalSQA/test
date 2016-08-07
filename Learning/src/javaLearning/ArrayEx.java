package javaLearning;

/**
 * Created by DELL on 24-07-2016.
 */
public class ArrayEx {

    public static void main(String[] args) {

//        int [] arr = new int[5];
//        arr[0]=52;
//        arr[1]=15;
        int [] arr ={52,20,25,20};
        System.out.println(arr.length);
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.println(arr[i]);
//        }
        for (int i : arr)
        {
            System.out.println(i);
        }
    }
}
