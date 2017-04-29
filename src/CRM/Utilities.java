package CRM;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Utilities
{
	public static <T> void Serialize(SerializeType serializeType, T item)
	{
		String fileName = "";
		
		switch(serializeType){
		case Cars:
			fileName = "Cars.ser";
			break;
			
		case Customers:
			fileName = "Customers.ser";
			break;
		case RentingInfo:
			fileName = "RentingInfo.ser";
			break;
		
		case Drivers:
			fileName = "Drivers.ser";
			break;
			
		case Employees:
			fileName = "Employees.ser";
			break;

		case Admin:
			fileName = "Admin.ser";
			break;
		default:
		
			break;
		}
		
		try {
	         FileOutputStream fileOut = new FileOutputStream(fileName);
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(item);
	         out.close();
	         fileOut.close();
	         
	      }catch(IOException i) {
	         i.printStackTrace();
	      }
	}
	public static <T> T Deserialize(SerializeType serializeType)
	{
		String fileName = "";
		
		switch(serializeType){
		case Cars:
			fileName = "Cars.ser";
			break;
			
		case Customers:
			fileName = "Customers.ser";
			break;
		case RentingInfo:
			fileName = "RentingInfo.ser";
			break;
		
		case Drivers:
			fileName = "Drivers.ser";
			break;
			
		case Employees:
			fileName = "Employees.ser";
			break;

		case Admin:
			fileName = "Admin.ser";
			break;
		default:
			break;
		}

		T e = null;
		 try {
	         FileInputStream fileIn = new FileInputStream(fileName);
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         e = (T)in.readObject();
	         in.close();
	         fileIn.close();
	      }catch(IOException i) {
	         i.printStackTrace();
	         
	      }catch(ClassNotFoundException c) {
	         System.out.println("Employee class not found");
	         c.printStackTrace();
	         
	      }

		return e;
	}
}