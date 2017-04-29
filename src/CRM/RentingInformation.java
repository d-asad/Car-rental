package CRM;

public class RentingInformation
{

	private Customer Customer;
	public final Customer getCustomer()
	{
		return Customer;
	}
	public final void setCustomer(Customer value)
	{
		Customer = value;
	}
	private Driver Driver;
	public final Driver getDriver()
	{
		return Driver;
	}
	public final void setDriver(Driver value)
	{
		Driver = value;
	}
	private java.time.LocalDateTime HireDateTime = java.time.LocalDateTime.MIN;
	public final java.time.LocalDateTime getHireDateTime()
	{
		return HireDateTime;
	}
	public final void setHireDateTime(java.time.LocalDateTime value)
	{
		HireDateTime = value;
	}
	private Vehicle Vehicle;
	public final Vehicle getVehicle()
	{
		return Vehicle;
	}
	public final void setVehicle(Vehicle value)
	{
		Vehicle = value;
	}
	private java.time.LocalDateTime ExpectedReturnDateTime = java.time.LocalDateTime.MIN;
	public final java.time.LocalDateTime getExpectedReturnDateTime()
	{
		return ExpectedReturnDateTime;
	}
	public final void setExpectedReturnDateTime(java.time.LocalDateTime value)
	{
		ExpectedReturnDateTime = value;
	}
	private java.time.LocalDateTime ReturnDateTime = java.time.LocalDateTime.MIN;
	public final java.time.LocalDateTime getReturnDateTime()
	{
		return ReturnDateTime;
	}
	public final void setReturnDateTime(java.time.LocalDateTime value)
	{
		ReturnDateTime = value;
	}

	private int BillingPrice;
	public final int getBillingPrice()
	{
		return BillingPrice;
	}
	public final void setBillingPrice(int value)
	{
		BillingPrice = value;
	}
	private boolean IsActive;
	public final boolean getIsActive()
	{
		return IsActive;
	}
	public final void setIsActive(boolean value)
	{
		IsActive = value;
	}

	public RentingInformation(Customer customer, Vehicle vehicle, java.time.LocalDateTime expectedReturnDateTime)
	{
		setVehicle(vehicle);
		setCustomer(customer);
		setHireDateTime(java.time.LocalDateTime.now());
		setExpectedReturnDateTime(expectedReturnDateTime);
	}
}