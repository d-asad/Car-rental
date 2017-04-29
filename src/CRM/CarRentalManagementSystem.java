package CRM;

public class CarRentalManagementSystem
{
	public static void main(String[] args)
	{
		Admin a = new Admin(1, "Syed Monis", "Azhar", "monis_azhar@hotmail.com", 03322244117, "Karachi, Pakistan", 422589, "monis.123");
		EndUser endUser = new EndUser(1, "Danish", "Asad", "danish_asad@gmail.com", 90078601, "Karachi, Pakistan", 4218759, "danish.123", Shift.Morning);

		a.Add(endUser);
		Utilities.Serialize(SerializeType.Admin, a);

		Admin ab = Utilities.<Admin>Deserialize(SerializeType.Admin);

		System.out.println(ab.getFirstName());
	}
}