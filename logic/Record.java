package logic;

public class Record {
	private String foodName ;
	private int soldPrice ;
	public Record(String menu, int price) {
		foodName = menu ;
		soldPrice = price ;
	}
	public String toString() {
		return "Menu : "+ foodName +" sold in "+ soldPrice + " THB";
	}
	public String getFoodName() {
		return foodName;
	}
	public int getSoldPrice() {
		return soldPrice;
	}
}
