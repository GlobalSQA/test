package javaConcepts;

/**
 * Created by DELL on 06-08-2016.
 */
public class BankAccount {

    public int AccountNo()
    {
        int i = (int) (Math.random()*1000000);
        return i;
    }

    public void kyc()
    {
        System.out.println("KYC documents : Address, ID proof");
    }

    public void ATMCard()
    {
        System.out.println("Issuing an ATM Card");
    }
    public void CustId()
    {
        System.out.println("Issuing a CustId");
    }

}
