package javaLearning;

/**
 * Created by DELL on 24-07-2016.
 */
public class IfElseEx {

    public String randomNumber(int i)
    {
       if(i>=1 && i<=10)
       {
            return "Number is between 1-10";
       }
       else if(i>10 && i<=50)
       {
            return "Number is between 11-50";
       }
       else
       {
           return "Number is greater than 50";
       }
    }
    public static void main(String[] args) {

        IfElseEx ifex = new IfElseEx();
        System.out.println(ifex.randomNumber(50));
    }

}
