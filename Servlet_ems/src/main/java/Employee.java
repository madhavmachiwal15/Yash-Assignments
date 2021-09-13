
public class Employee {

	String employeeId;
	String employeeName;
	String employeeEmail;
	String employeeLocation;
	
	public Employee()
	{
		super();
	}
	
	public Employee(String id, String employeeName, String employeeEmail, String employeeLocation)
	{
		super();
		this.employeeId = id;
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
		this.employeeLocation = employeeLocation;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getEmployeeLocation() {
		return employeeLocation;
	}

	public void setEmployeeLocation(String employeeLocation) {
		this.employeeLocation = employeeLocation;
	}
	
	
}


