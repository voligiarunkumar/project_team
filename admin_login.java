package inventory_management;

import java.util.ArrayList;

public class admin_login {
		private String username;
		private String Password;
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
		public void adlogin_details(ArrayList<admin_login> arr)
		{
			for(admin_login adlogin:arr)
			{ System.out.println("username:"+adlogin.username);
			  System.out.println("password:"+adlogin.Password);
			}
		}

	}

