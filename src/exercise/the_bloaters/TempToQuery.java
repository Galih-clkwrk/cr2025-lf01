package exercise.the_bloaters;
public class TempToQuery {
	class Product {
		private int quantity;
		private int itemPrice;
		public Product(int quantity, int price) {
			this.quantity = quantity;
			this.itemPrice = price;
		}
		
		// TODO: change this method to using replace temp with query
		public double getPrice() {
			return getBasePrice() * getDiscountFactor();
		}
		
		private int getBasePrice() {
			return quantity * itemPrice;
		}
		
		private double getDiscountFactor() {
			if (getBasePrice() > 1000) {
				return 0.95;
			}
			else {
				return 0.98;
			}
		}
	}
	public void Test() {
		Product p1 = new Product(100, 200);
		Product p2 = new Product(10, 50);
		System.out.println("Price 1 = " + p1.getPrice());
		System.out.println("Price 2 = " + p2.getPrice());
	}
	public static void main(String[] args) {
		TempToQuery t = new TempToQuery();
		t.Test();
	}
}
