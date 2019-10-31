package day9;

public class Employee {

String name;
int id;
String Nationality;
double salary;

public Employee(String n, int i) {

name = n;
id = i;

}
public Employee(String n, int i, double s) {

name = n;
id = i;
salary = s;

System.out.println("Constructor called");

}
	public void show () {
		System.out.println("Name is : " + name);
		System.out.println("ID is : " + id);
		System.out.println("salary is : " + salary);
	}


public static void main(String[] args) {
	
	Employee em = new Employee("Shyam", 6546, 236536);
	
}
}