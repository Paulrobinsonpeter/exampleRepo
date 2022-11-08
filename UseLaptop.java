package functionimportant;

public class UseLaptop {
	public static void main(String[] args) {
	   Laptop r1=new Laptop();
	   r1.brand="asus";
	   r1.price=50000;
	   r1.color="black";
	   r1.isWarranty=true;
	   Laptop r2=new Laptop();
	   r2.brand="sony";
	   r2.price=53000;
	   r2.color="ash";
	   r2.isWarranty=true;
	   Laptop r3=new Laptop();
	   r3.brand="s";
	   r3.price=52000;
	   r3.color="white";
	   r3.isWarranty=true;
	   Laptop r4=new Laptop();
	   r4.brand="us";
	   r4.price=51000;
	   r4.color="pink";
	   r4.isWarranty=false;
	   
	   Laptop[] ls= {r1,r2,r3,r4};
	   r4.goodLap(ls);

	}

}
