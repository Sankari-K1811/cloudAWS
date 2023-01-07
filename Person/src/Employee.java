import java.util.*;
public class Employee extends Person {
	public Employee(String name, char gender, int age, String nationality) {
		super(name, gender, age, nationality);
		// TODO Auto-generated constructor stub
	}
	private String designation;
	Employee(){
	
	}
   public Employee(String name,char gender,int age,String nationality,String destination){
	   super(name,gender,age,nationality);
	   this.designation=destination;
   }
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
 public void displayDetails() {
	System.out.println( "Employee [designation=" + designation + "]");
	super.displayDetails();
 }
}


