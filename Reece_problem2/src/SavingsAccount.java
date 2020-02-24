
public class SavingsAccount {
static Double annualInterestRate;
private Double savingsBalance; 

    public SavingsAccount(Double savingsBalance) {
    	this.savingsBalance=savingsBalance;
    }
    public static Double modifyInterestRate(Double intRate) {
    	annualInterestRate=intRate;
    	return annualInterestRate;
    }
    public Double calculateMonthlyInterest() {
    	Double interestValue;
    	interestValue= savingsBalance * ((annualInterestRate/100)/12);
    	savingsBalance=(savingsBalance+interestValue);
    	return savingsBalance;
    }
    
    
    
    
}
