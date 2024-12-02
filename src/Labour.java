
public class Labour {
int Lid;
String Lname;
char grad;

// 1)using object reference variable
void printData() {
	System.out.println(Lid+"  "+Lname+"   "+grad);
	
}

// 2)using method
void setData(int id, String name, char gr) {
	Lid = id;
	Lname = name;
	grad = gr;
	
}
// 3)using constructor
Labour(int id, String name, char gr){
	Lid = id;
	Lname = name;
	grad = gr;
	
}
}
