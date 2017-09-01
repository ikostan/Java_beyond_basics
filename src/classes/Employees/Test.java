package classes.Employees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	private final String TAG = Test.class.getSimpleName();

	public static void main(String[] args) {

		AllEmployees employees = new AllEmployees();
		
		try {
				
			//String newFname, String newLname, int newEmpID
			Employee a = new Employee(934561, "Bob", "Winner");	
			a.setSalary(760);
			Employee b = new Employee(789234, "Anny", "Fisher");
			b.setSalary(1500);
			Employee c = new Employee(467098, "Dick", "Chainee");
			c.setSalary(600);
			Employee d = new Employee(437563, "Frank", "Zapa");
			d.setSalary(800);
			
			List<Employee> list = new ArrayList<>();
			
			list.add(a);
			list.add(b);
			list.add(c);
			list.add(d);
			
			Collections.sort(list);
			
			for(Employee emp : list){
				
				System.out.println(emp.getfName() + " earns " + emp.getSalary());
			}
			
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
		finally{
			
			
		}		
	}
}
