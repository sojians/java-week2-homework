package week2;

public class Boolean {
	public static void main(String[] args) {
		
		// creating boolean variables
		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = true;
		
		// creating non-boolean variables
		double costOfMilk = 3.14;
		double moneyInWallet = 20.00;
		int thirstLevel = 2; //(how thirsty you are on a scale of 1-10)

		// creating boolean variables dependent on other variables
		boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
		boolean willGoSwimming = isHotOutside && !isWeekday;
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= ( 2 * costOfMilk );
		
		// ice cream?
		if ( shouldBuyIcecream == true ) {
			System.out.println("I should buy ice cream");
		} else {
			System.out.println("I should not buy ice cream");
		}
		
		// go swim?
		if ( willGoSwimming == true ) {
			System.out.println("Also I should go for a swim");
		} else {
			System.out.println("Also I should not go for a swim");
		}
		
		// good day?
		if ( isAGoodDay == true ) {
			System.out.println("It must be a good day");
		} else {
			System.out.println("Hmmmm, not a good day I guess");
		}
		
		// buy milk?
		if ( willBuyMilk == true ) {
			System.out.println("I should buy milk");
		} else {
			System.out.println("I should not buy milk");
		}
			
	}
	
}
