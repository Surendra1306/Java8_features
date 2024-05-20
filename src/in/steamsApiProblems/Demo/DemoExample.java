package in.steamsApiProblems.Demo;

import java.util.ArrayList;
import java.util.stream.Stream;
//1
public class DemoExample {
	
	public static void main(String[] args) {
		
		//First approach to create streams
		Stream<Integer> st=Stream.of(1,2,6,4,9,7,3);
		Stream<Integer> filter = st.filter(i -> i<7);
		filter.forEach(i -> System.out.println(i));
		
		ArrayList<String> list=new ArrayList<>();
		list.add("Warner");
		list.add("Dhoni");
		list.add("Shivam");
		list.add("Rohit");
		//second Approach to create stream 
		Stream<String> stream = list.stream(); 
		stream.forEach(str ->  System.out.println(str));
		
	}

}
