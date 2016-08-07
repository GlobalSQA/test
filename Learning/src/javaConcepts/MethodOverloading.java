package javaConcepts;

/**
 * Created by DELL on 06-08-2016.
 */
public class MethodOverloading {

    public static void main(String[] args) {

        MethodOverloading mo = new MethodOverloading();
        mo.sum(10,10);
        mo.sum(10,10,11);


    }

    public int sum(int i, int j)
    {
        return i+j;
    }
    public int sum(int i, int j, int k)
    {
        return i+j+k;
    }
}
