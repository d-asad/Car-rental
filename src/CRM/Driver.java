package CRM;

public class Driver extends Employee
{
	private boolean IsAvailable;
	public final boolean getIsAvailable()
	{
		return IsAvailable;
	}
	public final void setIsAvailable(boolean value)
	{
		IsAvailable = value;
	}
	public Driver(int id, String firsName, String lastName, String emailAddress, long phone, String address, long cnic, String password, Shift shift)
	{
		super(id, firsName, lastName, emailAddress, phone, address, cnic, shift);
		setIsAvailable(true);
	}
}