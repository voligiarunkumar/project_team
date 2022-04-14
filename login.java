
package inventory_management;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

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
	@SuppressWarnings("unused")

	
		Connection con=Conect.createc();
		//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arun","root","root");
		Statement st=con.createStatement();
		
	     ResultSet rs11=st.executeQuery("select username,create_password,cust_id from customer");
		  int  check=0;
		  while(rs11.next()) 
		  { 		
            try {
			if(rs11.getString(1).equals(login.username)&&rs11.getString(2).equals(login.Password)) {
				
				check=check+1;
			System.out.println("*******VALID USER********");
			 System.out.println("YOUR CUSTOMER ID IS:"+rs11.getInt(3));
		     System.out.println("*choose 1 to order:\n*choose 2 to cancel or see expected arrival order:");
			@SuppressWarnings("resource")
			Scanner se=new Scanner(System.in);
	    	  int opt1 = se.nextInt();
	    
		      switch(opt1) {
		    	  case 1:
				Food_OrderingSystem fo=new Food_OrderingSystem();
				 fo.menu();
				 fo.order();
				 //fo.payment();
				 break;
		    	  case 2:
		    		  order_table.cancel_order();
		    		  break;
		              }
			}
			order_table or =new order_table();
			or.setCust_id(rs11.getInt(3));
			Cartt cart=new Cartt();
			cart.setCust_id(rs11.getInt(3));
	   
		
			}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  }
     if (check!=1) 
            {
            	System.out.println("New user Register yourself:");
            	System.out.println("Choose option above for selection:");
  
            }
           
      
    }
	
	@SuppressWarnings("static-access")
	public void login_details(ArrayList<login> arr)
	{
		for(login login:arr)
		{ System.out.println("Username:"+login.username);
		  System.out.println("Password:"+login.Password);
		}
	}

}
//>>>>>>> e737607b344d276370f0af684c2698effd6f4022
