package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

	public static void main(String[] args) {
		Employee e = null;
		
		try {
			//Create the input stream object
			FileInputStream fileIn = new FileInputStream("employee.txt");
			
			//Create the ObjectInputStream object by passing the object created Input Stream object
			ObjectInputStream in = new ObjectInputStream(fileIn);
			
			//Call readobject method on above created ObjectInputStream obj
			e = (Employee) in.readObject();
			fileIn.close();
			in.close();
			
		} catch (IOException i) {
			i.printStackTrace();
			return;
			
		} catch (ClassNotFoundException c) {
			System.out.println("Employee Class not found");
			c.printStackTrace();
			return;
		}
		
		System.out.println(" === Deserialized Employee === ");
		System.out.println("Name :" + e.name);
		System.out.println("Address :" + e.address);
		System.out.println("SSN :" + e.SSN);
		System.out.println("Number :" + e.number);
		//System.out.println("ID : " + e.ID);
	}

}
