package inventory_management;

import java.util.ArrayList;

public class Registration {

private String username;
private String adderss;
private long phono;
private String create_password;
private String  reenter_password;

public String getCreate_password() {
	return create_password;
}
public void setCreate_password(String create_password) {
	this.create_password = create_password;
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

