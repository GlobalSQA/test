package javaLearning;

/**
 * Created by DELL on 17-07-2016.
 */
public class SecondProgram {

    public static  void ternaryOperator()
    {
        boolean b = false;
        String c = b==false?"Pass" : "Fail";
        System.out.println(c);
    }
    public static void main(String[] args) {

        SecondProgram sp= new SecondProgram();
        sp.ternaryOperator();

    }

}
