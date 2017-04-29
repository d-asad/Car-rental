package CRM;

public interface IVehicleMaintainable extends IViewer
{
	void Add(Vehicle vehicle);
	void Update(Vehicle old, Vehicle newVehicle);
	void Remove(Vehicle vehicle);
}