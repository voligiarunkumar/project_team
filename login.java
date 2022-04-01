package inventory_management;

import java.util.ArrayList;

public class login {
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
	public void login_details(ArrayList<login> arr)
	{
		for(login login:arr)
		{ System.out.println("username:"+login.username);
		  System.out.println("password:"+login.Password);
		}
	}

}
