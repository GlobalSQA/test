package ExceptionHandling;

import java.util.Scanner;

/**
 * Created by Raghav Arora on 14-08-2016.
 */
public class ArithmeticExceptionEx {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values for i & j : ");
        int i=scanner.nextInt();
        int j=scanner.nextInt();
        try {
            System.out.println(j / i);
        }
//        catch (ArithmeticException ae)
//        {
//            System.out.println("Incorrect Values entered");
//        }
        catch (Exception e)
        {
            System.out.println(e);
            e.printStackTrace();
        }
        finally {
            System.out.println("Saving my file");
        }
    }

}
