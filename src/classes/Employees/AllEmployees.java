package classes.Employees;

import java.util.HashMap;
import java.util.List;

public class AllEmployees {

	private final String TAG = AllEmployees.class.getSimpleName();
	private static HashMap<Integer, String> employeeList;
	private static List<Employee> allEmployees;
	private final static int ID_LENGTH = 6;
	
	
	public AllEmployees(){
		
		System.out.println(TAG + " class called");
		employeeList = new HashMap<>();
	}
	
	
	public static HashMap getAllEmp(){
		
		return employeeList;
	}
	
	
	public static void addEmployee(int newListID, String fName, String lName) throws Exception{
		
		if(!isExist(newListID)){
				
			if(testIdLength(newListID)){
					
				employeeList.put(newListID, fName + " " + lName);
				System.out.println(newListID + ": " + fName + " " + lName + " is added to the list of ID's");
			}
			else{
					
				System.out.println("ID length is not valid: " + newListID + " (a valid ID must contain " + ID_LENGTH + " digits)");
				throw new Exception("ERROR: not valid ID " + newListID + " (a valid ID must contain " + ID_LENGTH + " digits)");
			}					
		}
		else{
			
			System.out.println("Duplicate ID: " + newListID);
			throw new Exception("ERROR: duplicate ID " + newListID);
		}
	}
	
	
	public static void removeID(int empID) throws Exception{
		
		if(!isExist(empID)){
			
			System.out.println("ID not found: " + empID);
			throw new Exception("ERROR: ID not found " + empID);
		}
		else{
	
			employeeList.remove(empID);
			System.out.println(empID + " removed from the list of ID's");			
		}
	}
	
	
	private static boolean testIdLength(int newListID){
		
		boolean isValid = false;
		
		String id = String.format("%d", newListID);
		
		if(id.length() == ID_LENGTH){
			
			isValid = true;
		}
		
		return isValid;
	}
	
	
	private static boolean isExist(int newListID){
		
		boolean isDuplicate = false;
		
		if(employeeList.containsKey(newListID)){
			
			isDuplicate = true;
		}
		
		return isDuplicate;
	}
	
	
	
	//END
}
