package javaConcepts;

/**
 * Created by DELL on 06-08-2016.
 */
public class ImplementInhertance {

    public static void main(String[] args) {
/*
        SavingBankAccount sa = new SavingBankAccount();
        sa.ATMCard();
        sa.kyc();
*/

        SeniorCitizenSavingAcc savingAcc = new SeniorCitizenSavingAcc();
        savingAcc.kyc();
        savingAcc.interestRate();

    }
}
