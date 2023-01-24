package com.lpu.client2;

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
 */
public class StreamClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
