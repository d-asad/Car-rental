package CRM;

public class Make
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
	private String CarMake;
	public final String getCarMake()
	{
		return CarMake;
	}
	public final void setCarMake(String value)
	{
		CarMake = value;
	}
	public Make(int id, String carMake)
	{
		setId(id);
		setCarMake(carMake);
	}
}