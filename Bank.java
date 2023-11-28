package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Bank extends Details {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Details d=new Details();
		d. Bank_name="State Bank Of India";
		d.Account_No="123456789";
		d.user_Name="Naveen";
		d.Password="Naveen10";
	
		FileOutputStream fos=new FileOutputStream("C:\\Users\\navee\\file\\textOne.txt");
		
		ObjectOutputStream oos =new ObjectOutputStream(fos);
		oos.writeObject(d);
		oos.close();
		fos.close();
		System.out.println("Serialization is completed...");
	}
}
