package CRM;

public class Car extends Vehicle
{
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#region Variables

	private CarType CarType = getCarType().values()[0];
	public final CarType getCarType()
	{
		return CarType;
	}
	public final void setCarType(CarType value)
	{
		CarType = value;
	}

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#endregion

	public Car(int id, Color color, int capacity, int model, Make make, CarType type, String engineNumber, String registrationNumber)
	{
		super(id, color, capacity, model, make, engineNumber, registrationNumber);
		setCarType(type);
		setIsAvailable(true);
	}
}