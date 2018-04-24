package emc;

public class Option {
	public String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int price;
	
	public Option(String n, int p) {
		name = n;
		price = p;
	}
}