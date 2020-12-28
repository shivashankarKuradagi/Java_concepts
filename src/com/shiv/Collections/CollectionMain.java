/**
 * 
 */
package com.shiv.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * @author shivshankar
 *
 */
public class CollectionMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee e1 = new Employee("shiv", 1);
		Employee e2 = new Employee("shiv", 3);
		Employee e3 = new Employee("sai", 1);
		Employee e4 = new Employee("vid", 1);
		Employee e5 = new Employee("ved", 1);
		Employee e6 = new Employee("arry", 1);
		Employee e7 = new Employee("deep", 1);
		Employee e8 = new Employee("rahul", 1);
		Employee e9 = new Employee("nirmal", 1);

		List<Employee> emps = new ArrayList<Employee>();

		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);
		emps.add(e6);
		emps.add(e7);
		emps.add(e8);
		emps.add(e9);
		EmployeeSoryByName soryByName = new EmployeeSoryByName();
		
		emps.sort(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		System.out.println("Sorted : " + emps);
		
		
		Collections.sort(emps, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		/*
		 * Collections.sort(emps, soryByName);
		 * 
		 * for (Employee employee : emps) { System.out.println(employee); }
		 */

		Map<String, List<Employee>> map = new TreeMap<String, List<Employee>>();

		for (Employee emp : emps) {

			if (map.containsKey(emp.getName())) {
				List<Employee> l = map.get(emp.getName());
				l.add(emp);
				map.put(emp.getName(), l);
			} else {
				List<Employee> list = new ArrayList<Employee>();
				list.add(emp);
				map.put(emp.getName(), list);
			}
		}

		List<Employee> linked = new LinkedList<Employee>();

		for (Entry<String, List<Employee>> set : map.entrySet()) {
			if (set.getValue().size() > 1) {
				linked.addAll(set.getValue());
			}
		}

		for (Entry<String, List<Employee>> set : map.entrySet()) {
			if (set.getValue().size() == 1) {
				linked.addAll(set.getValue());
			}
		}

		for (Employee employee : linked) {
			System.out.println(employee);
		}

	}

}
