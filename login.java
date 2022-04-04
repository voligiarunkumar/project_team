package inventory_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class login {
	private static String username;
	//private static String password1;
	private static String Password;
	//private static String username1;
	public String getUsername() {
		return username;
	}
	@SuppressWarnings("static-access")
	public void setUsername(String username) {
		this.username = username;
		
		
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) throws ClassNotFoundException, SQLException {
		Password = password;
		login.validate_login();
	}
	@SuppressWarnings("static-access")
	public static void validate_login( ) throws SQLException, ClassNotFoundException
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arun","root","arunkumar@123");
		Statement st=con.createStatement();
		  @SuppressWarnings("unused")
	     ResultSet rs=st.executeQuery("select username,create_password from customer");
		  int  count=0;
		  while(rs.next()) 
		  { 		
            try {
			if(rs.getString(1).equals(login.username)&&rs.getString(2).equals(login.Password)) {
				
				count+=count;
				 @SuppressWarnings("unused")
				Food_OrderingSystem fo=new Food_OrderingSystem();
				 fo.menu();
				 fo.order();
				 fo.payment();
			}
			
		
			}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  }
            if(count==1) {
            	System.out.println("Valid_user");
  
            }
            else {
            	System.out.println("newuser");
            	Mainclass.registration();
            	
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
