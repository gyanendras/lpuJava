package com.lpu.client2;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;

import com.lpu.domain.Employee;

/*
 * 
 * empList.stream().forEach(e -> e.salaryIncrement(10.0));
 * After terminal operation stream pipeline is supposed to be 
 * consumed
 * map() produces a new stream after applying a function to each element of the original stream.
 * Ex - Stream.of(empIds).map(employeeRepository::findById)
      .collect(Collectors.toList());
      filter(); this produces a new stream that contains elements of the original stream that pass a given test (specified by a Predicate).
      .filter(e -> e.getSalary() > 200000)
      
      empList.stream()
      .peek(e -> e.salaryIncrement(10.0))
      .peek(System.out::println)
      
      peek() performs the specified operation on each element of the stream and returns a new stream
      
      A stream pipeline consists of a stream source, followed by zero or more intermediate operations, and a terminal operation.
      sorted
Let’s start with the sorted() operation – this sorts the stream elements based on the comparator passed we pass into it.

boolean allEven = intList.stream().allMatch(i -> i % 2 == 0);
    boolean oneEven = intList.stream().anyMatch(i -> i % 2 == 0);
    boolean noneMultipleOfThree = intList.stream().noneMatch(i -> i % 3 == 0)
    A reduction operation (also called as fold) takes a sequence of input elements and combines them into a single summary result by repeated application of a combining operation. We already saw few reduction operations like findFirst(), min() and max().
    Double sumSal = empList.stream()
      .map(Employee::getSalary)
      .reduce(0.0, Double::sum);
      .collect(Collectors.joining(", "))
      .toString();
      
      https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/stream/Stream.html
 */
public class StreamClient {

	public static void main(String[] args) {
		int [] intArray = {11,4,2,5,6,7,33,22,11,55,8,44};
		
		IntConsumer intCons = (a)-> System.out.print(" "+a);
		intCons =a-> System.out.print(" "+a);
		
		// Arrays.stream(intArray).forEach(intCons);
		//Arrays.stream(intArray).forEach(a-> System.out.print(" "+a));

		long count = Arrays.stream(intArray)
				              .filter(a -> a%2==0)
				               .map(a->a*a)
		                       .mapToObj(a ->  new Employee(a))
		                       .peek(a-> System.out.print(" "+a.getName()+" "))
		                        .count();
		
		List<Employee> l=     Arrays.stream(intArray)
                         .mapToObj(a ->  new Employee(a))
                         .collect(Collectors.toList());
		
		
	 //.forEach(a-> System.out.print(" "+a.getName()));
		System.out.println(count);
		System.out.println(l.get(0).getEmpId());
	}

	
}
