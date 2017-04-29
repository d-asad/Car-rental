package CRM;

import java.io.Serializable;
import java.util.*;

public class EndUser extends Employee implements IMemberMaintainable, IVehicleMaintainable, Serializable
{
	private ArrayList<Member> _drivers;
	private ArrayList<Member> _customers;
	private ArrayList<Vehicle> _cars;
	private ArrayList<RentingInformation> _rentingInfos;

	private String _password;
	public EndUser(int id, String firsName, String lastName, String emailAddress, long phone, String address, long cnic, String password, Shift shift)
	{
		super(id, firsName, lastName, emailAddress, phone, address, cnic, shift);
		_password = password;
		_drivers = new ArrayList<Member>();
		_customers = new ArrayList<Member>();
		_cars = new ArrayList<Vehicle>();
		_rentingInfos = new ArrayList<RentingInformation>();
	}
	public EndUser() {
		
	}
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#region Behaviors

	public final void Add(Member member)
	{
		if (member instanceof Driver)
		{
			_drivers.add(member);
			Utilities.Serialize(SerializeType.Drivers, _drivers);
		}
	}

	public final void Add(Customer customer, Car car, java.time.LocalDateTime expectedReturnDateTime)
	{
		_customers.add(customer);

		RentingInformation rentingInfo = new RentingInformation(customer, car, expectedReturnDateTime);

		_rentingInfos.add(rentingInfo);
		Utilities.Serialize(SerializeType.RentingInfo, _rentingInfos);
	}

	public final void Update(Member old, Member newMember)
	{
		if (newMember instanceof Customer)
		{
			Member member = tangible.ListHelper.find(_customers, p -> p.getId() == old.getId());
			member = newMember;
			Utilities.Serialize(SerializeType.Customers, _customers);
		}
		else if (newMember instanceof Driver)
		{
			Member member = tangible.ListHelper.find(_drivers, p -> p.getId() == old.getId());
			member = newMember;
			Utilities.Serialize(SerializeType.Drivers, _customers);
		}
	}

	public final void Remove(Member member)
	{
		if (member instanceof Customer)
		{
			_customers.remove(member);
			Utilities.Serialize(SerializeType.Customers, _customers);
		}
		else if (member instanceof Driver)
		{
			_drivers.remove(member);
			Utilities.Serialize(SerializeType.Drivers, _drivers);
		}
	}
	public final void Add(Vehicle vehicle)
	{
		if (vehicle instanceof Car)
		{
			_cars.add(vehicle);
			Utilities.Serialize(SerializeType.Cars, _cars);
			;
		}
	}
	public final void ReturnCar(Customer customer, Vehicle vehicle)
	{
		RentingInformation r = tangible.ListHelper.find(_rentingInfos, p -> p.getCustomer().getId() == customer.getId());
		r.setIsActive(false);

		r.setReturnDateTime(java.time.LocalDateTime.now());

		vehicle.setIsAvailable(true);
		if (r.getDriver() != null)
		{
			r.getDriver().setIsAvailable(true);
		}
		//billing info
		_rentingInfos.add(r);

		Utilities.Serialize(SerializeType.RentingInfo, _rentingInfos);
	}

	public final void Hire(Customer customer, Vehicle car, java.time.LocalDateTime expectedReturndateTime)
	{
		Hire(customer, car, expectedReturndateTime, null);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public void Hire(Customer customer, Vehicle car,DateTime expectedReturndateTime, Driver driver = null)
	public final void Hire(Customer customer, Vehicle car, java.time.LocalDateTime expectedReturndateTime, Driver driver)
	{
		RentingInformation r = new RentingInformation(customer, car, expectedReturndateTime);
		r.setDriver(driver);
		car.setIsAvailable(false);
		r.setVehicle(car);

		if (r.getDriver() != null)
		{
			r.getDriver().setIsAvailable(false);
		}

		Utilities.Serialize(SerializeType.RentingInfo, _rentingInfos);
	}
	public final void Update(Vehicle old, Vehicle newVehicle)
	{
		if (old instanceof Car)
		{
			Vehicle vehicle = tangible.ListHelper.find(_cars, p -> p.getId() == old.getId());
			vehicle = newVehicle;
			Utilities.Serialize(SerializeType.Cars, _cars);
		}
	}

	public final void Remove(Vehicle vehicle)
	{
		if (vehicle instanceof Car)
		{
			_cars.remove(vehicle);
			Utilities.Serialize(SerializeType.Cars, _cars);
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
			case Customers:
				//implementation goes here
				break;
			case Vehicles:
				//implementation goes here
				break;
			case Employees:
				//implementation goes here
				break;
		}
	}
}