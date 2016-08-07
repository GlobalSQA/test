package javaLearning;

/**
 * Created by DELL on 17-07-2016.
 */
public class FirstProgram {

    public void method1()
    {
        int i = 12345;
        int j = 12;
        float f = 123.45f;
        double d = 12345686.6456;
        long l = 13214567556689l;
        boolean b =true;
        char c= 'c';
        String s1 = "This is my first class";
        String s2 = "given by GlobalSQA Trainer";
        System.out.println("Concatenation result is"+ s1+" "+s2);
        System.out.println(i+j);
    }

    public void method2()
    {
        System.out.println("It prints second method");
    }
    public static void main(String [] args)
    {
        FirstProgram fp = new FirstProgram();
        fp.method1();
//        fp.method2();

    }

}
