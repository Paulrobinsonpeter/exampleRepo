package functionimportant;

public class UseMaxMini {
	public static void main(String[] args) {
		int[] nums= {10,25,2,4,36,88,77,777};
		MaxMini m1=new MaxMini();
		m1.findMax(nums);
		System.out.println(m1.findMini(nums));
	}

}
