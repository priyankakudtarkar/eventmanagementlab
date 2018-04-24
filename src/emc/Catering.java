package emc;

public class Catering {

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

		public String name;
		public int price;
		
		public Catering(String n, int p) {
			name = n;
			price = p;
		}
	}