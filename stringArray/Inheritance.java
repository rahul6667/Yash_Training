package strinArray;

class Tata{
	int price;
	int insurance;
	
	Tata(int price , int insurance){
		this.insurance=insurance;
		this.price=price;
	}
	
	
}

class Bike extends Tata{

	Bike(int price, int insurance) {
		super(price, insurance);
		// TODO Auto-generated constructor stub
	}
	int bikePrice() {
		return price+insurance;
	}
	
}

class Altroz1 extends Tata{

	Altroz1(int price, int insurance) {
		super(price, insurance);
		// TODO Auto-generated constructor stub
	}
	int altrozPrice() {
		return price+insurance;
	}
	
}

public class Inheritance {

	public static void main(String[] args) {
		Bike p=new Bike(20000,500);
		int bikep=p.bikePrice();
		System.out.println(bikep);
		
		
		Altroz1 a= new Altroz1(5000000,500);
		int carp=a.altrozPrice();
		System.out.println(carp);

	}

}
