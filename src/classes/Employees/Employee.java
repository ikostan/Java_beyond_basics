package classes.Employees;

public class Employee implements Comparable<Employee>{

	private final String TAG = Employee.class.getSimpleName();

	private int age, expirience, empID;
	private String fName, lName, department, profession;
	
	
	private double salary;
	
	public Employee(int newEmpID, String newFname, String newLname) throws Exception{
		
		AllEmployees.addEmployee(newEmpID, newFname, newLname);
		this.empID = newEmpID;
		this.fName = newFname;
		this.lName = newLname;
	}
	
	@Override
	public int compareTo(Employee o) {
		
		int i = 0; //Equal salary
		String indecator ="equal";
		
		if(this.getSalary() > o.getSalary()){
			
			i = 1; //This earns more
			indecator ="more";
		}
		else if(this.getSalary() < o.getSalary()){
			
			i = 1; //This earns less
			indecator ="less";
		}
		
		System.out.println(this.getEmpID() + " earns " + indecator);
		return i;
	}
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getExpirience() {
		return expirience;
	}

	public void setExpirience(int expirience) {
		this.expirience = expirience;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getEmpID() {
		return empID;
	}

	
}
