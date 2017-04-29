package CRM;

public class Customer extends Member
{
	public Customer(int id, String firsName, String lastName, String emailAddress, long phone, String address, long cnic)
	{
		super(id, firsName, lastName, emailAddress, phone, address, cnic);
	}
}