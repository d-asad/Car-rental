package CRM;

public abstract class Member
{
	private int Id;
	public final int getId()
	{
		return Id;
	}
	public final void setId(int value)
	{
		Id = value;
	}
	private String FirstName;
	public final String getFirstName()
	{
		return FirstName;
	}
	public final void setFirstName(String value)
	{
		FirstName = value;
	}
	private String LastName;
	public final String getLastName()
	{
		return LastName;
	}
	public final void setLastName(String value)
	{
		LastName = value;
	}
	private String EmailAddress;
	public final String getEmailAddress()
	{
		return EmailAddress;
	}
	public final void setEmailAddress(String value)
	{
		EmailAddress = value;
	}
	private long Phone;
	public final long getPhone()
	{
		return Phone;
	}
	public final void setPhone(long value)
	{
		Phone = value;
	}
	private String Address;
	public final String getAddress()
	{
		return Address;
	}
	public final void setAddress(String value)
	{
		Address = value;
	}
	private long Cnic;
	public final long getCnic()
	{
		return Cnic;
	}
	public final void setCnic(long value)
	{
		Cnic = value;
	}

	protected Member(int id, String firsName, String lastName, String emailAddress, long phone, String address, long cnic)
	{
		setId(id);
		setFirstName(firsName);
		setLastName(lastName);
		setEmailAddress(emailAddress);
		setPhone(phone);
		setAddress(address);
		setCnic(cnic);
	}
	protected Member()
	{
		
	}
}