package inventory_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

@SuppressWarnings("unused")
public class Registration {
private static String username1;
private static String username;
private String adderss;
private long phono;
private String create_password;
public static int check=0;
public static int check1=0;
public void setCreate_password(String create_password) {
	this.create_password = create_password;
	validateUsernameAndPassword.isValidPassword(create_password);
	if (validateUsernameAndPassword.isValidPassword(create_password)==true){
       System.out.println("Password is valid");  
       check=check+1;
       }
else {
	System.out.println("--------------------->Please enter the valid password<--------------------");
}

}
public String getUsername() {
	return username;
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

@SuppressWarnings("static-access")
public void setUsername(String username) {
	this.username = username;
	validateUsernameAndPassword.isValidUsername(username);
	if (validateUsernameAndPassword.isValidUsername(username)==true){
 
		System.out.println("Username is valid");
		check1=check1+1;
    }
	else {
	 System.out.println("--------------------->Please enter the valid user name<----------------------");
		
}
}



@SuppressWarnings("static-access")
public void registration_insert() throws SQLException, ClassNotFoundException {
	Connection con=Conect.createc();
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select username from customer");
	Registration r=new Registration();
	 while(rs.next()) 
	  {
 	  String a=rs.getString(1);
 	 r.username1=a;
	  }
	 if(Registration.username.equals(Registration.username1)) {
		 System.out.println("username already peresent ");
		 System.out.println("select above options to choose again");
	 }

	 else {
	String sql= "insert into customer (username,address,phono,create_password)values (?,?,?,?);";
	PreparedStatement stmt =con.prepareStatement(sql);
	stmt.setString(1, username);
	stmt.setString(2,adderss);
	stmt.setLong(3, phono);
	stmt.setString(4, create_password);
	stmt.execute();
	System.out.println("Inserted");
	   login login = new login();
	   System.out.println("Thank you for regirstering click 2 to login");
	//login.validate_login();
        }
}




}

