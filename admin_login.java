package inventory_management;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class admin_login {
		private static String adusername;
		private static String adPassword;
	    public static int check1=0;
		public String getUsername() {
			return adusername;
		}
		@SuppressWarnings("static-access")
		public void setUsername(String username) {
			this.adusername = username;
		}
		public String getPassword() {
			return adPassword;
		}
		public void setPassword(String password) throws ClassNotFoundException, SQLException {
			
			adPassword = password;
			validate_adlogin();
		}
		public static void validate_adlogin( ) throws SQLException, ClassNotFoundException
		{
			//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arun","root","root");
			Connection con=Conect.createc();
			Statement st=con.createStatement();
			//Connection con=Conect.createc();
			  ResultSet rs=st.executeQuery("select username,password from admin");
			  //login l=new login();
			  
			
	      	 
			  while(rs.next()) 
			  {
	            try {
				if(rs.getString(1).equals(admin_login.adusername)&&rs.getString(2).equals(admin_login.adPassword)) {
					check1=check1+1;
					System.out.println("Valid_user");
					
					//Mainclass.menu();
					 if(admin_login.check1==1) {
		            	   Mainclass.menu();
					 }
					 
				}
				else
				{
					System.out.println("Admin details not found");
					//Mainclass.registration();
					//System.console();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       }
	    }
		
		@SuppressWarnings("static-access")
		public void adlogin_details(ArrayList<admin_login> arr)
		{
			for(admin_login adlogin:arr)
			{ System.out.println("Username:"+adlogin.adusername);
			  System.out.println("Password:"+adlogin.adPassword);
			}
		}

	}

