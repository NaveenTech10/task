package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PrivateBank {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Details dd=new Details();
		try {
			
		FileInputStream fis=new FileInputStream("C:\\Users\\navee\\file\\textOne.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		dd=(Details) ois.readObject();
		System.out.println("Deserialization Dates");
		System.out.println("name "+dd.Bank_name);
		System.out.println("address "+dd.Account_No);
		System.out.println("number "+dd.user_Name);
		System.out.println("courses "+dd.Password);
		
		ois.close();
		
		fis.close();
		
		}catch(IOException e) {
			e.getMessage();
		}

}
}
