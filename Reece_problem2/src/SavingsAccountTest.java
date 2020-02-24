public class SavingsAccountTest {
	
	static SavingsAccount saver1= new SavingsAccount(2000.00);
	static SavingsAccount saver2= new SavingsAccount(3000.00);
	
	public static void accountFunction() {
		saver1.modifyInterestRate(4.0);
		saver2.modifyInterestRate(4.0);
		int i=1;
		do {
			System.out.printf("%nMonth %d: %nSaver1:%.2f %nSaver2:%.2f",i,
					saver1.calculateMonthlyInterest(),
					saver2.calculateMonthlyInterest());
			++i;
		}while(i<=12);
	
		saver1.modifyInterestRate(5.0);
		saver2.modifyInterestRate(5.0);
		System.out.printf("%nMonth 13: %nSaver1:%.2f %nSaver2:%.2f",
				saver1.calculateMonthlyInterest(),
				saver2.calculateMonthlyInterest());
}

	public static void main(String[] args) {
		accountFunction();

	}

}

