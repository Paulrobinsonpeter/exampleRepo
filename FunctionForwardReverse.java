package functionimportant;

public class FunctionForwardReverse {
	public void forwardValue(String a) {
		for(int i=0;i<a.length();i++) {
			System.out.println(a.charAt(i));
		}
	}
	public void reverseValue(String a) {
		for(int i=a.length()-1;i>=0;i--) {
			System.out.println(a.charAt(i));
		}
	}
	public String stringReverse()
	{
		String name="robin";
		String temp="";
		for(int i=name.length()-1;i>=0;i--) {
			temp=temp+name.charAt(i);
		}
		return temp;
		
	}

}
