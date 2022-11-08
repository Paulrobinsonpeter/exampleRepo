package functionimportant;

public class FirstSecondHalf {
	public void printFirsthalf(String[] a) {
		for(int i=0;i<a.length/2;i++) {
			System.out.println(a[i]);
		}
		
	}
	public void printSecondHalf(String[] b) {
		for(int i=b.length/2;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}

}
