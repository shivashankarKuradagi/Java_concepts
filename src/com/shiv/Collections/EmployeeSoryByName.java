/**
 * 
 */
package com.shiv.Collections;

import java.util.Comparator;

/**
 * @author shivshankar
 *
 */
public class EmployeeSoryByName implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
