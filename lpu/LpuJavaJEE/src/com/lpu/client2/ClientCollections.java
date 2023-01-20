package com.lpu.client2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.lpu.domain.Employee;

/* Collections are datastructures provided to you by
 * as Classes by Java to store arbitrary number of 
 * objects.
 * There are so many because they are read write, sorting 
 * and getting the data.
 * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/Collection.html
 * Interface Collection<E>
 * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/Map.html
 * Interface Map<K,V>
 */
public class ClientCollections {
	

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
	Employee emp1 = new Employee("Emp1",1,10);
	Employee emp2 = new Employee("Emp2",2,20);
	Employee emp3 = new Employee("Emp3",3,30);
	Employee emp4 = new Employee("Emp3",3,30);
	
	empList.add(emp1);
	empList.add(emp2);
	empList.add(emp3);
	empList.add(emp4);
	
	double avgsal,sum = 0;
	
	for(int i =0; i<empList.size();++i ) {
		System.out.println(empList.get(i).getName());
		sum = sum + empList.get(i).getSalary();
	}
	avgsal = sum/empList.size();
	 System.out.println(avgsal);
	
	 Collection<Employee> coll = empList;
	 
	 Iterator<Employee> itr = coll.iterator();
	
	 while( itr.hasNext()) {
		System.out.println(itr.next().getName());
		
	}
	 // empList.remove(emp1);
	System.out.println(coll.size());
	
	Set<Employee> setEmp = new HashSet<Employee>();
	setEmp.addAll(empList);
	
	System.out.println(setEmp.size());

	
	
	
	
	}
	
	
}
