package inventory_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class login {
	private static String username;
	private String Password;
	private static String username1;
	public String getUsername() {
		return username;
	}
	@SuppressWarnings("static-access")
	public void setUsername(String username) throws ClassNotFoundException, SQLException {
		this.username = username;
		validate_login(username);
		
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@SuppressWarnings("static-access")
	public void validate_login(String username ) throws SQLException, ClassNotFoundException
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arun","root","arunkumar@123");
		Statement st=con.createStatement();
		  @SuppressWarnings("unused")
	     ResultSet rs=st.executeQuery("select username from customer where username="+"username");
		 
		  while(rs.next()) {
      	  String a=rs.getString(1);
      	  login l=new login();
      	  l.username1=a;
      	  try {
			if(login.username.equals(login.username1)) {
				System.out.println("Valid_user");
				 @SuppressWarnings("unused")
				Food_OrderingSystem fo=new Food_OrderingSystem();
				 fo.menu();
				 fo.order();
				 fo.payment();
			}
			else
			{
				System.out.println("new user");
				Mainclass.registration();
				System.console();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      	  }
	}
	@SuppressWarnings("static-access")
	public void login_details(ArrayList<login> arr)
	{
		for(login login:arr)
		{ System.out.println("username:"+login.username);
		  System.out.println("password:"+login.Password);
		}
	}

}
