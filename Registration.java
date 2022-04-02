package inventory_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

@SuppressWarnings("unused")
public class Registration {

private String username;
private String adderss;
private long phono;
private String create_password;
private String  reenter_password;
public static int check=0;
public static int check1=0;
public void setCreate_password(String create_password) {
	this.create_password = create_password;
	validateUsernameAndPassword.isValidUsername(create_password);
	if (validateUsernameAndPassword.isValidUsername(create_password)==true){
       System.out.println("Password is valid");  
       check=check+1;}
else {
	System.out.println("please enter the valid password");
}
}
public String getReenter_password() {
	return reenter_password;
}
public void setReenter_password(String reenter_password) {
	this.reenter_password = reenter_password;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
	validateUsernameAndPassword.isValidUsername(username);
	if (validateUsernameAndPassword.isValidUsername(username)==true){
 
		System.out.println("username is valid");
		check1=check1+1;
    }
	else {
	 System.out.println("please enter the valid user name");
		 //Mainclass.registration();
}
}
public String getAdderss() {
	return adderss;
}
public void setAdderss(String adderss) {
	this.adderss = adderss;
}
public long getPhono() {
	return phono;
}
public void setPhono(long phono) {
	this.phono = phono;
}

//public void validate()
//{
//	}

public void registration_insert() throws SQLException, ClassNotFoundException {
	
	 Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arun","root","arunkumar@123");
	//Statement st=con.createStatement();
	String sql= "insert into customer values (?,?,?,?);";
	@SuppressWarnings("unused")
	PreparedStatement stmt =con.prepareStatement(sql);
	stmt.setString(1, username);
	stmt.setString(2,adderss);
	stmt.setLong(3, phono);
	stmt.setString(4, create_password);
	stmt.execute();
	System.out.println("inserted");
        }


public void registration_details(ArrayList<Registration> arr) {
	

for( Registration registration:arr)
{ System.out.println("username:"+registration.username);
System.out.println("address:"+registration.adderss);
System.out.println("phono:"+registration.phono);
System.out.println("createpass"+registration.create_password);
System.out.println("reenter_password:"+registration.reenter_password);
if(registration.create_password.equals(registration.reenter_password))
{
	Mainclass.menu();

}
else {
	System.out.println("mismatch with pasword");
	Mainclass.registration();
	}

}
}
}

