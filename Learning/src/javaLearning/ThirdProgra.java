package javaLearning;

/**
 * Created by DELL on 24-07-2016.
 */
public class ThirdProgra {

    public int sum(int a, int b)
    {
        int c = a+b;
        return c;
    }
    public static void main(String[] args) {

        ThirdProgra tp = new ThirdProgra();
        System.out.println(tp.sum(5,6));
    }
}
