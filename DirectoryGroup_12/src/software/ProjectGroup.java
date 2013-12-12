package software;

import java.util.ArrayList;

import people.Customer;
import people.Employee;

/**
 * 
 */

/**
 * @author Steven
 *
 */
public class ProjectGroup {
	
	String name;
	ArrayList <Employee> employees;
	ArrayList <Customer> customers;
	
	public ProjectGroup()
	{
		name = null;
		employees = new ArrayList <Employee>();
		customers = new ArrayList <Customer>(); 
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String str)
	{
		name = str;
	}
	
	public ArrayList<Employee> getEmployees()
	{
		return employees;
	}

	public ArrayList<Customer> getCustomers()
	{
		return customers;
	}
	
	public void print()
	{
		System.out.println(name);
	}
	
	
}
