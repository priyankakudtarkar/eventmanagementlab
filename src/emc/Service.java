package emc;


public class Service {
	public String name;
	public int price;
	public int tax;
	public int amount;
	public String surname;
	
	Option op[];
	AddOn ao[];
	Catering cs[];
	
	Option opp;
	AddOn aon[];
	Catering css[];
	public Service(String n, int p, int t,int i, Option o[],AddOn a[], Catering[] cp1) {
		name = n;
		price = p;
		tax = t;
		op = o;
		ao = a;
		amount = 0;
	}
	
	public Service(String n, int p, int t, Option[] opl1, AddOn[] adl1, Catering[] cp1) {
		// TODO Auto-generated constructor stub
	}

	public void bookService(Option o, AddOn a[], Catering t[]){
		
		opp = o;
		aon = a;
		css = t;
		amount= amount + price;
		amount= amount + o.price;
		amount= amount + t.length;
		
		for(int i=0; i<aon.length; i++){
			amount = amount + aon[i].price;
		}
	}
	
	public void printBill(){
		Debugger.Log("\nName : "+name);
		Debugger.Log("\nPrice : "+price);
		Debugger.Log("\nOption : "+opp.name);
		Debugger.Log("\nOption : "+opp.price);
		
		for(int i=0; i<aon.length; i++){
			Debugger.Log("\nAdon : "+aon[i].name+" Price : "+aon[i].price);
		}
		Debugger.Log("\nTotal : "+amount);
	}


}
