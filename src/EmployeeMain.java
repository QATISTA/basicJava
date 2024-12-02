
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		emp1.eid = 1;
		emp1.eregid = 01;
		emp1.ename = "John Doe";
		emp1.elocation = "Kolkata";
		emp1.dispaydata();
		
		Employee emp2 = new Employee();
		emp2.eid = 100;
		emp2.eregid = 100;
		emp2.ename = "Ron Wisley";
		emp2.elocation = "Bangalore";
		emp2.dispaydata();
		
		Student stu1=new Student();
		stu1.age=30;
		stu1.grade="A";
		stu1.height = 5;
		stu1.location = "Pune";
		stu1.name = "Smith";
		stu1.studentData();
	}

}
