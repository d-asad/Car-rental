package CRM;

public abstract class Vehicle
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
	private Color Color;
	public final Color getColor()
	{
		return Color;
	}
	public final void setColor(Color value)
	{
		Color = value;
	}
	private int Capacity;
	public final int getCapacity()
	{
		return Capacity;
	}
	public final void setCapacity(int value)
	{
		Capacity = value;
	}
	private int Model;
	public final int getModel()
	{
		return Model;
	}
	public final void setModel(int value)
	{
		Model = value;
	}
	private Make Make;
	public final Make getMake()
	{
		return Make;
	}
	public final void setMake(Make value)
	{
		Make = value;
	}
	private String RegistrationNumber;
	public final String getRegistrationNumber()
	{
		return RegistrationNumber;
	}
	public final void setRegistrationNumber(String value)
	{
		RegistrationNumber = value;
	}
	private boolean IsAvailable;
	public final boolean getIsAvailable()
	{
		return IsAvailable;
	}
	public final void setIsAvailable(boolean value)
	{
		IsAvailable = value;
	}
	private String EngineNumber;
	public final String getEngineNumber()
	{
		return EngineNumber;
	}
	public final void setEngineNumber(String value)
	{
		EngineNumber = value;
	}

	protected Vehicle(int id, Color color, int capacity, int model, Make make, String engineNumber, String registrationNumber)
	{
		setId(id);
		setColor(color);
		setCapacity(capacity);
		setModel(model);
		setMake(make);
		setRegistrationNumber(registrationNumber);
		setIsAvailable(true);
		setEngineNumber(engineNumber);
	}
}