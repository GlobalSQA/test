package javaLearning;

/**
 * Created by DELL on 24-07-2016.
 */
public class ForLoopEx {

    public static void main(String[] args) {

        for (int i=0;i<=10;i++)
        {
            int j= 2*i;
//            if(j==10)
//            {
//                break;
//            }

            if(j>=10 && j<=14)
            {
                continue;
            }
            System.out.println(j);
        }
    }
}
