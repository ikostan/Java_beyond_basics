package classes.Employees;

public class Test {

	public static void main(String[] args) {

		AllEmployees employees = new AllEmployees();
		
		try {
				
			//String newFname, String newLname, int newEmpID
			Employee a = new Employee(437563, "Frank", "Zapa");
			Employee b = new Employee(467098, "Dick", "Chainee");
			Employee c = new Employee(789234, "Anny", "Fisher");
			Employee d = new Employee(934561, "Bob", "Winner");	
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
		finally{
			
			
		}
		
	}
}
