package CRM;

import java.io.Serializable;
import java.util.*;

public class Admin extends Member implements IMemberMaintainable, Serializable
{
	private ArrayList<Member> Employees;
	public final ArrayList<Member> getEmployees()
	{
		return Employees;
	}
	public final void setEmployees(ArrayList<Member> value)
	{
		Employees = value;
	}
	private ArrayList<Member> EndUsers;
	public final ArrayList<Member> getEndUsers()
	{
		return EndUsers;
	}
	public final void setEndUsers(ArrayList<Member> value)
	{
		EndUsers = value;
	}

	private String _password;
	private boolean _isOnline;

	public Admin(int id, String firsName, String lastName, String emailAddress, long phone, String address, long cnic, String password)
	{
		super(id, firsName, lastName, emailAddress, phone, address, cnic);
		this._password = password;
		_isOnline = true;
		setEmployees(new ArrayList<Member>());
		setEndUsers(new ArrayList<Member>());
	}
	public Admin()
	{
		
	}

	public final void Login(int id, String password)
	{
		_isOnline = true;
	}

	public final void ChangePassword(String oldPassword, String newPassword)
	{
		if (_password.equals(oldPassword))
		{
			_password = newPassword;
		}
		else
		{
			throw new RuntimeException("Password didn't match");
		}
	}

	public final void Logout()
	{
		_isOnline = false;

	}

	public final void Add(Member member)
	{
		if (member instanceof Employee)
		{
			getEmployees().add(member);
			Utilities.Serialize(SerializeType.Employees, getEmployees());
		}
	}

	public final void Add(Customer customer, Car car, java.time.LocalDateTime expectedReturnDateTime)
	{
		throw new UnsupportedOperationException();
	}

	public final void Update(Member old, Member newMember)
	{
		if (old instanceof EndUser)
		{
			Member member = tangible.ListHelper.find(getEndUsers(), p -> p.getId() == old.getId());
			member = newMember;
			Utilities.Serialize(SerializeType.Employees, getEndUsers());
		}
		if (old instanceof Employee)
		{
			Member member = tangible.ListHelper.find(getEmployees(), p -> p.getId() == old.getId());
			member = newMember;
			Utilities.Serialize(SerializeType.Employees, getEndUsers());
		}
	}

	public final void Remove(Member member)
	{
		if (member instanceof EndUser)
		{
			getEndUsers().remove(member);
			Utilities.Serialize(SerializeType.Employees, getEndUsers());
		}
		if (member instanceof Employee)
		{
			getEmployees().remove(member);
			Utilities.Serialize(SerializeType.Employees, getEndUsers());
		}
	}
	public final void ViewAll(ViewType type)
	{
		ViewAll(type, false);
	}
	public final void ViewAll(ViewType type, boolean isAvailable)
	{
		switch (type)
		{
			case Employees:
				break;
			case Customers:
				break;
			case Vehicles:
				break;
		}
	}
}