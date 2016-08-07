package interfacesEx;

/**
 * Created by DELL on 07-08-2016.
 */
public class SeniorCitizenSavingAcc implements BankAccount,SavingAccInterface{


    @Override
    public void kyc() {

        System.out.println("KYC docs submitted");
    }

    @Override
    public void atmCard() {

        System.out.println("ATM Card Issued");

    }

    @Override
    public void accountNo() {

        System.out.println("Bank Account no is of 15 digits");

    }

    @Override
    public void interestRate() {
        System.out.println("Interest Rate is 10%");
    }
}
