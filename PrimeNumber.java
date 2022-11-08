package functionimportant;

public class PrimeNumber {
	public String checkPrime(int num) {
		String value="it is prime";
		for(int i=2;i<num;i++) {
			if(num%2==0) {
				value="it is not prime";
			}
		}
		return value;
		
		
	}

}
