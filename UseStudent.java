package functionimportant;

public class UseStudent {
	public static void main(String[] args) {
		Student s1=new Student();
		 s1.name="robi";
		 s1.age=25;
		 s1.rollNo=777;
		 s1.depart="aeronautical";
		 Student s2=new Student();
		 s2.name="karthi";
		 s2.age=28;
		 s2.rollNo=7;
		 s2.depart="civil";
		 Student s3=new Student();
		 s3.name="roy";
		 s3.age=25;
		 s3.rollNo=77;
		 s3.depart="mech";
     Student[] studs=new Student[3];
       studs[0]=s1;
       studs[1]=s2;
       studs[2]=s3;
       s3.oddDetails(studs);
	}

}
