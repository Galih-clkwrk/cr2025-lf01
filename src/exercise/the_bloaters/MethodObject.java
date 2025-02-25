package exercise.the_bloaters;
public class MethodObject {
	class Account {
		private int delta() {
			return 10;
		}
		
		public int gamma(int inputVal, int quantity, int yearToDate) {
			return new GammaCalculator(this, inputVal, quantity, yearToDate).compute();
		}
	}
	
	class GammaCalculator {
		private final Account account;
		private final int inputVal;
		private final int quantity;
		private final int yearToDate;
		private int importantValue1;
		private int importantValue2;
		private int importantValue3;
		
		public GammaCalculator(Account account, int inputVal, int quantity, int yearToDate) {
			this.account = account;
			this.inputVal = inputVal;
			this.quantity = quantity;
			this.yearToDate = yearToDate;
		}
		
		public int compute() {
			calculateImportantValue1();
			calculateImportantValue2();
			calculateImportantValue3();
			return finalCalculation();
		}
		
		private void calculateImportantValue1() {
			importantValue1 = (inputVal * quantity) + account.delta();
		}
		
		private void calculateImportantValue2() {
			importantValue2 = (inputVal * yearToDate) + 100;
			if ((yearToDate - importantValue1) > 100) {
				importantValue2 -= 20;
			}
		}
		
		private void calculateImportantValue3() {
			importantValue3 = importantValue2 * 7;
		}
		
		private int finalCalculation() {
			return importantValue3 - 2 * importantValue1;
		}
	}
	
	private void test() {
		Account account = new Account();
		System.out.println(account.gamma(15,10,2010));
	}
	
	public static void main(String[] args) {
		MethodObject p = new MethodObject();
		p.test();
	}
}
