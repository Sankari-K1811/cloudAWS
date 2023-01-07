import java.util.*;
	public class Person {
		private String name;
		private char gender;
		private int age;
		private String nationality;
		Person(){
			
		}
		 public Person(String name,char gender,int age,String nationality) {
			this.name=name;
			this.gender=gender;
			this.age=age;
			this.nationality=nationality;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public char getGender() {
			return gender;
		}
		public void setGender(char gender) {
			this.gender = gender;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getNationality() {
			return nationality;
		}
		public void setNationality(String nationality) {
			this.nationality = nationality;
		}
		
		public void displayDetails() {
			System.out.println("Person [name=" + name + ", gender=" + gender + ", age=" + age + ", nationality=" + nationality + "]");
		}
		}



