package logic;

public class Menu {
	String name;
	private int price ;
	private int specialPrice;
	public Menu(String name , int price) {
		// TODO Auto-generated constructor stub
		this.name  = name;
		this.price = price ;
		this.setPrice(price);
	}
	public String toString() {
		return name + " Price : " + Integer.toString(price) + " (special " + Integer.toString(specialPrice) + ")";
		
	}
	public void setPrice(int i) {
		price = i ;
		this.setSpecialPrice();
		if(price < 0) {
			price  = 0;
		}
		else if(price > 200) {
			price = 200;
		}
		else {
			price = price;
		}
	}
	public void setSpecialPrice() {
		if(price <= 50 ) {
			specialPrice = price + 5 ;
		}
		else if(price <= 100 ) {
			specialPrice  = price + 10;
		}
		else if(price > 100 ){
			specialPrice = price + 20;
		}
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getSpecialPrice() {
		return specialPrice;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menu other = (Menu) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}
