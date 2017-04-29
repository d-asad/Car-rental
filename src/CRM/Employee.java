package CRM;

public class Employee extends Member
{
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#region Attributes

	private java.time.LocalDateTime HireDate = java.time.LocalDateTime.MIN;
	public final java.time.LocalDateTime getHireDate()
	{
		return HireDate;
	}
	public final void setHireDate(java.time.LocalDateTime value)
	{
		HireDate = value;
	}
	private int Salary;
	public final int getSalary()
	{
		return Salary;
	}
	public final void setSalary(int value)
	{
		Salary = value;
	}
	private Shift Shift;
	public final Shift getShift()
	{
		return Shift;
	}
	public final void setShift(Shift value)
	{
		Shift = value;
	}

	public Employee(int id, String firsName, String lastName, String emailAddress, long phone, String address, long cnic, Shift shift)
	{
		super(id, firsName, lastName, emailAddress, phone, address, cnic);
		setShift(shift);
	}
	public Employee() {
		
	}
}