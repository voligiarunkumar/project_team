package inventory_management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class order_table {
private int choose_foodid;
private int choose_foodqty;
private int cust_id;
private int get_opt;
public long date;
public int getCust_id() {
	return cust_id;
}
public void setCust_id(int cust_id) {
	this.cust_id = cust_id;
	System.out.println(cust_id);
}
public int getChoose_foodid() {
	return choose_foodid;
}
public void setChoose_foodid(int choose_foodid) {
	this.choose_foodid = choose_foodid;
}
public int getChoose_foodqty() {
	return choose_foodqty;
}
public void setChoose_foodqty(int choose_foodqty) {
	this.choose_foodqty = choose_foodqty;
}

public int getGet_opt() {
	return get_opt;
}
public void setGet_opt(int get_opt) throws SQLException {
	this.get_opt = get_opt;
	add_order();
	
}
public long getDate() {
	return date;
}
public void setDate(long date) {
	this.date = date;
}

public void add_order() throws SQLException {
	java.util.Date date=new java.util.Date();
    java.sql.Date sqlDate=new java.sql.Date(date.getTime());
    @SuppressWarnings("unused")
	java.sql.Timestamp sqlTime=new java.sql.Timestamp(date.getTime());
	
	if(get_opt==1) {
		Connection con=Conect.createc();
	String sql= "insert into order_table (cust_id,food_id,order_date,order_time,food_qty)values (?,?,?,?,?);";
	PreparedStatement stmt =con.prepareStatement(sql);
	stmt.setInt(1,cust_id );
	stmt.setInt(2,choose_foodid);
	stmt.setDate(3,sqlDate);
	stmt.setTimestamp(4,sqlTime);
	stmt.setInt(5, choose_foodqty);
	stmt.execute();
	System.out.println("order_details inserted");
	}
}

}
