package in.steamsApiProblems.Demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ComparatorExample {
	
	public static void main(String[] args) {
		
		Employe e1 = new Employe(101,"Smith",25000,"Australia");
		Employe e2 = new Employe(102,"Ram",35000,"India");
		Employe e3 = new Employe(103,"Venkat",45000,"India");
		Employe e4 = new Employe(104,"Koushik",21000,"USA");
		Employe e5 = new Employe(105,"Sai",57000,"China");
		
		List<Employe> employees = Arrays.asList(e1,e2,e3,e4,e5);
		
		Optional<Employe> optionalmax = employees.stream()
						.collect(Collectors.maxBy(Comparator.comparing(e -> e.salary)));
						 System.out.println("Max_Salary :"+optionalmax.get().salary);
						 
		Optional<Employe> optionalmin =
				employees.stream().collect(Collectors.minBy(Comparator.comparing(e -> e.salary)));
						 System.out.println("Min_Salary :"+optionalmin.get().salary);	
						 
		Double collectAvg = 
				employees.stream().collect(Collectors.averagingDouble(e -> e.salary));
		System.out.println("Average salary :"+collectAvg);
						 
		Map<Double, List<Employe>> groupEmp = 
				employees.stream().collect(Collectors.groupingBy(e -> e.salary));
		System.out.println(groupEmp);
	}

}

class Employe{
	Integer id;
	String name;
	double salary;
	String country;
	
	public Employe(Integer id, String name, double salary,String country) {
		 
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.country=country;
	}	
}