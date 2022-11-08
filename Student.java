package functionimportant;

public class Student {
	String name;
	int age;
	int rollNo;
	String depart;
	
	public void oddDetails(Student[] a) {
		
		for(int i=0;i<a.length;i++) {
			if(a[i].rollNo%2!=0) {
				System.out.println(a[i].name+" "+a[i].age+" "+a[i].depart);
			}
			
		}
		
	}

}
