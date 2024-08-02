package Test;

class Student {
	// Data members
	
	int rollno;
	String name;
	float marks;
	String city;
	
	
	// Member functions
	
	void study() {
		
		System.out.println("Student is Studying");
		
	}
	
	
	void play() {
		
		System.out.println("Student is Playing");
		
		System.out.println();
	}
	
	void write() {
		System.out.println("Student is Writing");
	}
	
		void eat() {
			System.out.println("Student is eating"); 
		}
} 
public class StudentDetails {

	public static void main(String[] args) {
		
       Student S = new Student();
       S.rollno=201;
       S.name="Sharvi";
       S.marks=85.30f;
       S.city="Pune";
       
       System.out.println("Roll no: "+ S.rollno );
       System.out.println("Student Name: "+ S.name);
       System.out.println("Marks: "+ S.marks);
       System.out.println("City: "+ S.city);
       
       S.study();
       S.play();
       
       S.rollno=202;
       S.name="Pravin";
       S.marks=75.30f;
       S.city="Pune";
       
       System.out.println("Roll no: "+ S.rollno );
       System.out.println("Student Name: "+ S.name);
       System.out.println("Marks: "+ S.marks);
       System.out.println("City: "+ S.city);
        
       S.write();
       S.eat();
	} 

}    
       
       
       


