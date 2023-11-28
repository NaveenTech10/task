package Serialization;

import java.io.Serializable;

public class Details implements Serializable{
	public String Bank_name;
	public String Account_No;
	public String user_Name;
	public transient String Password;
}
