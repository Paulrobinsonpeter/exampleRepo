package functionimportant;

public class Laptop {
	String brand;
	int price;
	String color;
	boolean isWarranty;
	public void goodLap(Laptop[] a) {
		for(int i=0;i<a.length;i++) {
			if(a[i].isWarranty==true) {
				System.out.println(a[i].brand+" "+a[i].price+" "+a[i].color);
			}
		}
	}

}
