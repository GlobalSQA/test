package javaConcepts;

/**
 * Created by DELL on 07-08-2016.
 */
public class EncapEx1 {

    private int amount = 1000;
    public void setAmount (int amount)
    {
        if (amount<1000)
        {
            this.amount = amount;
        }
        else
        {

        this.amount = amount+100;

        }
    }

    public int getAmount()
    {
        return amount;
    }

    public void display()
    {
        if(amount>1000)
        {
            System.out.println("Hey... You have got the bonus of 100Rs");
        }
        else
        {
            System.out.println("You have not got the bonus as your invested amount is less than 1000/-");
        }
    }
}
