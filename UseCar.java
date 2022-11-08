package functionimportant;

public class UseCar {
	public static void main(String[] args) {
	  Car c1=new Car();
		c1.brand="audi";
		c1.color="white";
		c1.price=800000;
		c1.taxAmount=50000;
	  Car c2=new Car();
		c2.brand="tesla";
		c2.color="pink";
		c2.price=2500000;
		c2.taxAmount=100000;
      Car c3=new Car();
		c3.brand="benz";
		c3.color="yellow";
		c3.price=1400000;
		c3.taxAmount=50000;
		System.out.println(c1.netPrice(c1));
		System.out.println(c1.netPrice(c3));
		System.out.println(c3.netPrice(c2));
	}

}
