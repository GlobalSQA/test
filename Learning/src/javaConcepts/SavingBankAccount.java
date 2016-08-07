package javaConcepts;

/**
 * Created by DELL on 06-08-2016.
 */
public class SavingBankAccount extends BankAccount{

    public void kyc(){
        super.kyc();
        System.out.println("Aadhar card");
    }

     void interestRate()
    {
        System.out.println("Interest rate for saving account is 10%");
    }

}
