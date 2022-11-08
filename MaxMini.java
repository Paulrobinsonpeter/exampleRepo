package functionimportant;

public class MaxMini {
	public void findMax(int[] a) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>=max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
	public int findMini(int[] b) {
		int mini=b[0];
		for(int i=0;i<b.length;i++) {
			if(b[i]<=mini) {
				mini=b[i];
			}
		}
		return mini;
	}

}
