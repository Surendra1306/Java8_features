package in.steamsApiProblems.Demo;

import java.util.stream.Stream;

//get employee age and salary whose salary > 20000
public class EmployeeMap {
	
	public static void main(String[] args) {
		
		Employee e1=new Employee("Ram",22,25000);
		Employee e2=new Employee("Vijay",30,30000);
		Employee e3=new Employee("Karna",26,27000);
		Employee e4=new Employee("Bhima",32,34000);
		
		Stream<Employee> employees = Stream.of(e1,e2,e3,e4);
		//we can use this stream only once.but when we create using (asList)List, we can perform multiple operations on same stream
		
		employees.filter(emp -> emp.salary > 25000)
		.map(emp -> emp.name +"-" +emp.age)
		.forEach(emp -> System.out.println(emp));
		
		//second approach
		//employees.filter(emp -> emp.salary > 25000)
		//.forEach(emp -> System.out.println(emp.name +"-" +emp.age));
	}

}

class Employee {
	
	 String name;
	 Integer age;
	 double salary;
	
	public Employee(String name, Integer age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	
}
