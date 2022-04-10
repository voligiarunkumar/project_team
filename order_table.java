package inventory_management;

import java.sql.Connection;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;

public class order_table {
private int choose_foodid;
private int choose_foodqty;
private static int cust_id1;
private int get_opt;
public long date;
private static  int food_price;
private static int order_id;
private static String cart_status="not_ordered";
private static String location;
static Scanner del=new Scanner(System.in);
public static int getOrder_id() {
	return order_id;
}
public static void setOrder_id(int order_id) {
	order_table.order_id = order_id;
}

public static int getFood_price() {
	return food_price;
}
public void setFood_price(int food_price) {
	order_table.food_price = food_price;
}
public int getCust_id() {
	if(cust_id1>=0) {
		cust_id1=cust_id1+1;

		return cust_id1;}
	System.out.println(cust_id1);

	return cust_id1;
	
	
}	
@SuppressWarnings("static-access")
public void setCust_id(int cust_id) {
	cust_id1= cust_id;
	
		
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
public void getorderid() throws SQLException {
	Connection con=Conect.createc();
	 Statement st=con.createStatement();
	 ResultSet rs11=st.executeQuery("select order_id from order_table where cust_id="+cust_id1);
	 rs11.next();
	 System.out.println(rs11.getInt(1));
	 setOrder_id(rs11.getInt(1));
	
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
	stmt.setInt(1,getCust_id() );
	stmt.setInt(2,choose_foodid);
	stmt.setDate(3,sqlDate);
	stmt.setTimestamp(4,sqlTime);
	stmt.setInt(5, choose_foodqty);
     stmt.executeUpdate();
	System.out.println("order_details inserted");
	}
	else if(get_opt==2){
		try {
			@SuppressWarnings("unused")
			Connection con=Conect.createc();
			String sql= "insert into cart_table (cust_id,food_id,food_qty,food_price,cart_status)values (?,?,?,?,?);";
			PreparedStatement stmt =con.prepareStatement(sql);
			stmt.setInt(1,getCust_id() );
			stmt.setInt(2,choose_foodid);
			stmt.setInt(3,choose_foodqty);
			stmt.setInt(4,food_price);
			stmt.setString(5, cart_status);
			 stmt.executeUpdate();
			System.out.println("inserted into cart");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		  System.out.println(e);
		}
	}
}

public static void cancel_order() throws ClassNotFoundException, SQLException {
	java.util.Date date=new java.util.Date();
    @SuppressWarnings("unused")
	java.sql.Date sqlDate=new java.sql.Date(date.getTime());
    @SuppressWarnings("unused")
	java.sql.Timestamp sqlTime=new java.sql.Timestamp(date.getTime());
    order_table or= new order_table();
	Connection con=Conect.createc();
	java.sql.Statement st=con.createStatement();
	System.out.println(or.getCust_id());
	ResultSet rs = st.executeQuery("select customer.username,order_table.order_id,order_table.cust_id,order_table.food_id,order_table.order_date,order_table.order_time,order_table.food_qty from customer, order_table where customer.cust_id=order_table.cust_id and customer.cust_id="+cust_id1);
	
	System.out.println("Items Selected for order");
	System.out.println("\t\tUSER_NAME\t\tORDER_ID\tCUST_ID\t\tFOOD_ID\t\tORDER_DATE\t\tORDER_TIME\t\tFOOD_QTY");
	 
	while(rs.next()) {
		  String g=rs.getString(1);
			int a=rs.getInt(2);
			int b=rs.getInt(3);
			int f=rs.getInt(4);
			String c=rs.getString(5);
			String d=rs.getString(6);
			int e=rs.getInt(7);
			System.out.println("\t\t"+g+"\t\t"+a+"\t\t"+b+"\t\t "+f+"\t\t"+c+"\t\t"+d+"\t\t"+e);
	 
	  }
	  System.out.println("Enter Food Id to cancel the order");
	  @SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	  int food_id=sc.nextInt();
	String sql= "delete from  order_table where food_id="+food_id;
	PreparedStatement stmt =con.prepareStatement(sql);
	stmt.execute();
	System.out.println("order cancelled");
	
	
}
public void delivery() throws SQLException {
	System.out.println("Enter delivery location:");
	@SuppressWarnings({  "resource" })
	
	Time a=null;
    location=del.next();
	Connection con=Conect.createc();
	String sql= "insert into delivery_table (delivery_location,expected_Arrival,order_id)values (?,?,?);";
	PreparedStatement stmt =con.prepareStatement(sql);
	stmt.setString(1,location);
	stmt.setTime(2,a);
	stmt.setInt(3,getOrder_id());
	stmt.execute();
	System.out.println("Delivery location done");
	}




}
