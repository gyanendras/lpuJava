package com.lpu.client2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
		List<Employee> studList = new ArrayList<Employee>();
	studList.add(new Employee("Emp1",1,10));
	studList.add(new Employee("Emp2",2,20));
	studList.add(new Employee("Emp3",2,20));
	
	for(int i =0; i<studList.size();++i ) {
		System.out.println(studList.get(i).getName());
	}
	
	}

}
