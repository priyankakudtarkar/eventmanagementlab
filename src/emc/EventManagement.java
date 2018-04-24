package emc;

public class EventManagement {
	public static void main(String[] args) {
		Person cl1 = new Person("Priyanka");
		
		
		Option op1 = new Option("AC Hall",60);
	
		AddOn a1 = new AddOn("Sound",50);
	
		Catering c1= new Catering("veg food",100);
		
		
				
		Option opl1[] = new Option[1];
		opl1[0] = op1;

		AddOn adl1[] = new AddOn[1];
		adl1[0] = a1;
		
		Catering cp1[]=new Catering[1];
		cp1[0] = c1;
		
		Service s1 = new Service("Hall Booking",1500,10,20,opl1,adl1,cp1);	
		s1.bookService(op1, adl1,cp1);
		
		s1.printBill();
		
		
		Person cl2 = new Person("Riya");
		Option op2 = new Option("Open Hall",20);
		Catering c2= new Catering("veg food",100);
		
		AddOn a2 = new AddOn("Sound",100);
		Option opl2[] = new Option[1];
		opl2[0] = op2;
		
		AddOn adl2[] = new AddOn[1];
		adl2[0] = a2;
		
		Catering cp2[]=new Catering[1];
		cp2[0] = c2;
		Service s2 = new Service("Hall Booking",1000,80,20,opl2,adl2,cp2);
		s2.bookService(op2, adl2,cp2);
		s2.printBill();
	}
}