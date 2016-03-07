package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Maria";
		e.address = "Dublin, CA";
		e.SSN = 1234567890;
		e.number = 001;
		//e.ID = 1;
		
		try {
			//Create the output stream
			FileOutputStream fileout = new FileOutputStream("employee.txt");
			//Create ObjectOutputStream object by passing above created output stream object
			ObjectOutputStream out = new ObjectOutputStream(fileout);
			//Pass object to be serialized by calling writeObject method on created ObjectOutputStream obj
			out.writeObject(e);
			out.close();
			fileout.close();
			System.out.println("Serialized data is saved in employee.txt");
		} catch (IOException i) {
			i.printStackTrace();
		}

	}

}
