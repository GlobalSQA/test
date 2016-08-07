package javaConcepts;

/**
 * Created by DELL on 06-08-2016.
 */
public class ChildSavingAcc extends SavingBankAccount{

    public void kyc()
    {
        super.kyc();
        System.out.println("Age verification Card");
    }

    public void interestRate()
    {
        System.out.println("Interest rate is 6%");
    }

}

