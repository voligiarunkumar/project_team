//<<<<<<< HEAD
//package inventory_management;
//
////import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//
//public class shop {
//	
//	public int getItem_no() {
//		return item_no;
//	}
//
//	public void setItem_no(int item_no) {
//		this.item_no = item_no;
//	}
//
//	public String getItem_name() {
//		return item_name;
//	}
//
//	public void setItem_name(String item_name) {
//		this.item_name = item_name;
//	}
//
//	public int getItem_price() {
//		return item_price;
//	}
//
//	public void setItem_price(int item_price) {
//		this.item_price = item_price;
//	}
//	public String getItem_avail() {
//		return item_avail;
//	}
//
//	public void setItem_avail(String item_avail) throws ClassNotFoundException, SQLException {
//		this.item_avail = item_avail;
//	      add_newitem();
//	}
//	public int getItem_no1() {
//		return item_no1;
//	}
//
//	public void setItem_no1(int item_no1) throws ClassNotFoundException, SQLException {
//		this.item_no1 = item_no1;
//		delete_item();
//	}
//	
//	public int getCust_id() {
//		return cust_id;
//	}
//
//	public void setCust_id(int cust_id) throws ClassNotFoundException, SQLException {
//		this.cust_id = cust_id;
//		check_customer_details();
//	}
//
//	public int getItem_no2() {
//		return item_no2;
//	}
//
//	public void setItem_no2(int item_no2) throws SQLException {
//		this.item_no2 = item_no2;
//		display_food_items();
//	}
//	 public int getItem_price3() {
//			return item_price3;
//		}
//
//		public void setItem_price3(int item_price3) throws ClassNotFoundException, SQLException {
//			this.item_price3 = item_price3;
//			change_price_item();
//			
//		}
//
//		public int getItem_no3() {
//			return item_no3;
//		}
//
//		public void setItem_no3(int item_no3) {
//			this.item_no3 = item_no3;
//		}
//		public String getItem_name4() {
//			return item_name4;
//		}
//
//		public void setItem_name4(String item_name4) throws ClassNotFoundException, SQLException {
//			this.item_name4 = item_name4;
//			change_item_name();
//			
//		}
//
//		public int getItem_no4() {
//			return item_no4;
//		}
//
//		public void setItem_no4(int item_no4) {
//			this.item_no4 = item_no4;
//		}
//
//	private int item_no;
//	private String item_name;
//	private int item_price;
//	private String item_avail;
//	private int item_no1;
//	private int cust_id;
//	private int item_no2;
//    private int	item_price3;
//    private int  item_no3;
//	private int item_no4;
//	private static String item_name4;
//
//	public void add_newitem() throws ClassNotFoundException, SQLException
//	{
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arun","root","arunkumar@123");
//		@SuppressWarnings("unused")
//		Statement st=con.createStatement();
//		//ResultSet rs=st.executeQuery("insert into foodtable from customer");
//		String sql= "insert into foodtable (item_no,item_name,item_price,item_avail)values (?,?,?,?);";
//		@SuppressWarnings("unused")
//		PreparedStatement stmt =con.prepareStatement(sql);
//		stmt.setInt(1, item_no);
//		stmt.setString(2,item_name);
//		stmt.setLong(3, item_price);
//		stmt.setString(4,item_avail);
//		stmt.execute();
//		System.out.println("inserted");
//		System.out.println("choose option above for selection:");
//	}
//	public void delete_item() throws ClassNotFoundException, SQLException {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arun","root","arunkumar@123");
//		@SuppressWarnings("unused")
//		Statement st=con.createStatement();
//		@SuppressWarnings("unused")
//		String sql= "delete from  foodtable where item_no="+item_no1;
//		@SuppressWarnings("unused")
//		PreparedStatement stmt =con.prepareStatement(sql);
//		stmt.execute();
//		System.out.println("done");
//		System.out.println("choose option above for selection:");
//	}
//	public void check_customer_details() throws ClassNotFoundException, SQLException
//	{
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arun","root","arunkumar@123");
//		@SuppressWarnings("unused")
//		Statement st=con.createStatement();
//		 ResultSet rs=st.executeQuery("select *from customer where cust_id="+cust_id);
//		  while(rs.next()) {
//			  @SuppressWarnings("unused")
//			int a=rs.getInt(1);
//			  @SuppressWarnings("unused")
//			String b=rs.getString(2);
//			  @SuppressWarnings("unused")
//			String c= rs.getString(3);
//			  @SuppressWarnings("unused")
//			long d= rs.getLong(4);
//			  @SuppressWarnings("unused")
//			String e=rs.getString(5);
//			  System.out.println("\t\t"+a+"\t\t"+b+"\t\t "+c+"\t\t"+d+"\t\t"+e);
//		  }
//		  System.out.println("choose option above for selection:");
//	}
//public static void display_all_customer() throws ClassNotFoundException, SQLException {
//	Class.forName("com.mysql.cj.jdbc.Driver");
//	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arun","root","arunkumar@123");
//	@SuppressWarnings("unused")
//	Statement st=con.createStatement();
//	 ResultSet rs=st.executeQuery("select *from customer");
//	  while(rs.next()) {
//		  @SuppressWarnings("unused")
//		int a=rs.getInt(1);
//		  @SuppressWarnings("unused")
//		String b=rs.getString(2);
//		  @SuppressWarnings("unused")
//		String c= rs.getString(3);
//		  @SuppressWarnings("unused")
//		long d= rs.getLong(4);
//		  @SuppressWarnings("unused")
//		String e=rs.getString(5);
//		 System.out.println("\t\t"+a+"\t\t"+b+"\t\t "+c+"\t\t"+d+"\t\t"+e);
//	  }
//	  System.out.println("choose option above for selection:");
//}
//public static void display_all_food_items() throws SQLException {
//	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arun","root","arunkumar@123");
//	Statement st=con.createStatement();
//	  ResultSet rs=st.executeQuery("select *from foodtable order by item_no");
//	  while(rs.next()) {
//		  int a=rs.getInt(1);
//		  String b=rs.getString(2);
//		  int c= rs.getInt(3);
//		  String d= rs.getString(4);
//		  
//		  System.out.println("\t\t\t\t"+a+"\t\t\t"+b+"\t\t\t "+c+"\t\t\t\t"+d );
//	  }
//	  System.out.println("choose option above for selection:");
//}
//public void display_food_items() throws SQLException {
//	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arun","root","arunkumar@123");
//	Statement st=con.createStatement();
//	  ResultSet rs=st.executeQuery("select *from foodtable where item_no="+item_no2);
//	  while(rs.next()) {
//		  int a=rs.getInt(1);
//		  String b=rs.getString(2);
//		  int c= rs.getInt(3);
//		  String d= rs.getString(4);
//		  
//		  System.out.println("\t\t\t\t"+a+"\t\t\t"+b+"\t\t\t "+c+"\t\t\t\t"+d );
//	  }
//	  System.out.println("choose option above for selection:");
//}
//public void change_price_item() throws ClassNotFoundException, SQLException{
//	Class.forName("com.mysql.cj.jdbc.Driver");
//	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arun","root","arunkumar@123");
//	@SuppressWarnings("unused")
//	Statement st=con.createStatement();
//	String sql= "update foodtable set item_price=? where item_no=?;";
//	PreparedStatement stmt =con.prepareStatement(sql);
//	stmt.setInt(1, item_price3);
//	stmt.setInt(2,item_no3);
//	int i=stmt.executeUpdate();
//	if(i>0) {
//		System .out.println("record updated scuccessfully");
//	}
//	else {
//		System .out.println("not updated");
//		
//	}
//	System.out.println("choose option above for selection:");
//}
//public void change_item_name() throws ClassNotFoundException, SQLException{
//	int check = 0;
//	Class.forName("com.mysql.cj.jdbc.Driver");
//	
//	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arun","root","arunkumar@123");
//	@SuppressWarnings("unused")
//	Statement st=con.createStatement();
//	ResultSet rs=st.executeQuery("select item_name from foodtable ");
//	{
//		while(rs.next())
//		{
//			if(rs.getString(1).equals(shop.item_name4))
//			{
//				
//			//System.out.println("food name already present");
//			check=check+1;
//			}
//			
//		}
//		if(check>0)
//		System.out.println("food item already present");
//		System.out.println("choose option above for selection:");
//	}
//	if (check<1) {
//		
//	
//	String sql= "update foodtable set item_name=? where item_no=?;";
//	PreparedStatement stmt =con.prepareStatement(sql);
//	stmt.setString(1, item_name4);
//	stmt.setInt(2,item_no4);
//	int i=stmt.executeUpdate();
//	if(i>0) {
//		System .out.println("record updated scuccessfully");
//	}
//	else {
//		System .out.println("not updated");
//		
//	}
//	System.out.println("choose option above for selection:");
//	}
//}
//  
//
//public void displayitems(ArrayList<shop> arr) {
//	   for(shop shop:arr)
//	   {
//		  System.out.println("i");
//		   System.out.println("item no:"+shop.item_no);
//		   System.out.println("item name:"+shop.item_name);
//		   System.out.println("item price:"+shop.item_price);
//		   System.exit(0);
//	   }	
//		
//	}
//
//
//
//}
//
//
//
//
//
//=======
package inventory_management;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class shop {
	
	public int getItem_no() {
		return item_no;
	}

	public void setItem_no(int item_no) {
		this.item_no = item_no;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public int getItem_price() {
		return item_price;
	}

	public void setItem_price(int item_price) {
		this.item_price = item_price;
	}
	public String getItem_avail() {
		return item_avail;
	}

	public void setItem_avail(String item_avail) throws ClassNotFoundException, SQLException {
		this.item_avail = item_avail;
	      add_newitem();
	}
	public int getItem_no1() {
		return item_no1;
	}

	public void setItem_no1(int item_no1) throws ClassNotFoundException, SQLException {
		this.item_no1 = item_no1;
		delete_item();
	}
	
	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) throws ClassNotFoundException, SQLException {
		this.cust_id = cust_id;
		check_customer_details();
	}

	public int getItem_no2() {
		return item_no2;
	}

	public void setItem_no2(int item_no2) throws SQLException {
		this.item_no2 = item_no2;
		display_food_items();
	}
	 public int getItem_price3() {
			return item_price3;
		}

		public void setItem_price3(int item_price3) throws ClassNotFoundException, SQLException {
			this.item_price3 = item_price3;
			change_price_item();
			
		}

		public int getItem_no3() {
			return item_no3;
		}

		public void setItem_no3(int item_no3) {
			this.item_no3 = item_no3;
		}
		public String getItem_name4() {
			return item_name4;
		}

		@SuppressWarnings("static-access")
		public void setItem_name4(String item_name4) throws ClassNotFoundException, SQLException {
			this.item_name4 = item_name4;
			change_item_name();
			
		}

		public int getItem_no4() {
			return item_no4;
		}

		public void setItem_no4(int item_no4) {
			this.item_no4 = item_no4;
		}
		public int getOrder_id() {
			return order_id;
		}

		public void setOrder_id(int order_id) throws SQLException {
			this.order_id = order_id;
			check_ordered_details();
			
		}

	private static int item_no;
	private static String item_name;
	private int item_price;
	private String item_avail;
	private int item_no1;
	private int cust_id;
	private int item_no2;
    private int	item_price3;
    private int  item_no3;
	private int item_no4;
	private static String item_name4;
	private static int order_id;
	private int del_cust_id;
	private int cncl_food_id;
	private int cncl_order_id;

	public int getCncl_order_id() {
		return cncl_order_id;
	}

	public void setCncl_order_id(int cncl_order_id) throws SQLException {
		this.cncl_order_id = cncl_order_id;
		cancel_ordered_item1();
	}

	public int getCncl_food_id() {
		return cncl_food_id;
	}

	public void setCncl_food_id(int cncl_food_id) throws SQLException {
		this.cncl_food_id = cncl_food_id;
		cancel_ordered_item();
	}

	public int getDel_cust_id() {
		return del_cust_id;
	}

	public void setDel_cust_id(int del_cust_id) throws SQLException {
		this.del_cust_id = del_cust_id;
		delete_customer();
		
	}

	public void add_newitem() throws ClassNotFoundException, SQLException
	{
		//Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=Conect.createc();
		Statement st=con.createStatement();
		@SuppressWarnings("unused")
		ResultSet rs=st.executeQuery("select item_no,item_name from foodtable");
		@SuppressWarnings("unused")
		int check1=0;
		while(rs.next()) {
			if((Integer.toString(rs.getInt(1)).equals(Integer.toString(shop.item_no))|| rs.getString(2).equals(shop.item_name))||(shop.item_no>0)) {
				check1=check1+1;
				
				
			}
			
			
		}
		if(check1<=0) {
			System.out.println("\t\t\t\tGIVE CORRECT INFORMATION FOR ADD NEW ITEM");
			System.out.println("**Entered item number is already present or item name already present or item_price is less than zero please add new item again**");
			
		}
		
	    Mainclass.menu();
	    if(check1>1) {
		try {
			String sql= "insert into foodtable (item_no,item_name,item_price,item_avail)values (?,?,?,?);";
			PreparedStatement stmt =con.prepareStatement(sql);
			stmt.setInt(1, item_no);
			stmt.setString(2,item_name);
			stmt.setLong(3, item_price);
			stmt.setString(4,item_avail);
			stmt.execute();
			System.out.println("Inserted");
			System.out.println("Choose option above for selection:");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			System.out.println("Choose option agian for adding items");
		}
	}
	    }
		
	public void delete_item() throws ClassNotFoundException, SQLException {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arun","root","root");
		Connection con=Conect.createc();
		@SuppressWarnings("unused")
		//Statement st=con.createStatement();
		String sql= "delete from  foodtable where item_no="+item_no1;
		PreparedStatement stmt =con.prepareStatement(sql);
		stmt.execute();
		System.out.println("Done");
		System.out.println("Choose option above for selection:");
	}
	public void check_customer_details() throws ClassNotFoundException, SQLException
	{
		//Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arun","root","root");
		Connection con=Conect.createc();
		Statement st=con.createStatement();
		 ResultSet rs=st.executeQuery("select *from customer where cust_id="+cust_id);
		  while(rs.next()) {
			  int a=rs.getInt(1);
			  String b=rs.getString(2);
			  String c= rs.getString(3);
			  long d= rs.getLong(4);
			  String e=rs.getString(5);
			  System.out.println("\t\t"+a+"\t\t"+b+"\t\t "+c+"\t\t"+d+"\t\t"+e);
		  }
		  System.out.println("Choose option above for selection:");
	}
public static void display_all_customer() throws ClassNotFoundException, SQLException {
	//Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=Conect.createc();
	Statement st=con.createStatement();
	 ResultSet rs=st.executeQuery("select *from customer");
	  while(rs.next()) {
		  int a=rs.getInt(1);
		  String b=rs.getString(2);
		  String c= rs.getString(3);
		  long d= rs.getLong(4);
		  String e=rs.getString(5);
		 System.out.println("\t\t"+a+"\t\t"+b+"\t\t "+c+"\t\t"+d+"\t\t"+e);
	  }
	  System.out.println("Choose option above for selection:");
}
public static void check_all_ordered_details() throws SQLException {
	Connection con=Conect.createc();
	Statement st=con.createStatement();
	@SuppressWarnings("unused")
	ResultSet rs=st.executeQuery("select customer.username,order_table.order_id,order_table.cust_id,order_table.food_id,order_table.order_date,order_table.order_time,order_table.food_qty from customer, order_table where customer.cust_id=order_table.cust_id");
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
	System.out.println("Choose option above for selection:");
	
}
public static void check_ordered_details() throws SQLException {
	Connection con=Conect.createc();
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select customer.username,order_table.order_id,order_table.cust_id,order_table.food_id,order_table.order_date,order_table.order_time,order_table.food_qty from customer, order_table where customer.cust_id=order_table.cust_id and order_id="+order_id);
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
	System.out.println("Choose option above for selection:");
}
public static void display_all_food_items() throws SQLException {
	//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arun","root","root");
	Connection con=Conect.createc();
	Statement st=con.createStatement();
	  ResultSet rs=st.executeQuery("select *from foodtable order by item_no");
	  while(rs.next()) {
		  int a=rs.getInt(1);
		  String b=rs.getString(2);
		  int c= rs.getInt(3);
		  String d= rs.getString(4);
		  
		  System.out.println("\t\t\t\t"+a+"\t\t\t"+b+"\t\t\t "+c+"\t\t\t\t"+d );
	  }
	  System.out.println("Choose option above for selection:");
}
public void display_food_items() throws SQLException {
	//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arun","root","arunkumar@123");
	Connection con=Conect.createc();
	Statement st=con.createStatement();
	  ResultSet rs=st.executeQuery("select *from foodtable where item_no="+item_no2);
	  while(rs.next()) {
		  int a=rs.getInt(1);
		  String b=rs.getString(2);
		  int c= rs.getInt(3);
		  String d= rs.getString(4);
		  
		  System.out.println("\t\t\t\t"+a+"\t\t\t"+b+"\t\t\t "+c+"\t\t\t\t"+d );
	  }
	  System.out.println("Choose option above for selection:");
}
public void change_price_item() throws ClassNotFoundException, SQLException{
	//Class.forName("com.mysql.cj.jdbc.Driver");
	//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arun","root","root");
	Connection con=Conect.createc();
	@SuppressWarnings("unused")
	Statement st=con.createStatement();
	String sql= "update foodtable set item_price=? where item_no=?;";
	PreparedStatement stmt =con.prepareStatement(sql);
	stmt.setInt(1, item_price3);
	stmt.setInt(2,item_no3);
	int i=stmt.executeUpdate();
	if(i>0) {
		System .out.println("Record updated scuccessfully");
	}
	else {
		System .out.println("Not updated");
		
	}
	System.out.println("Choose option above for selection:");
}
public void change_item_name() throws ClassNotFoundException, SQLException{
	int check = 0;
	//Class.forName("com.mysql.cj.jdbc.Driver");
	
	//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arun","root","root");
	Connection con=Conect.createc();
	@SuppressWarnings("unused")
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select item_name from foodtable ");
	{
		while(rs.next())
		{
			if(rs.getString(1).equals(shop.item_name4))
			{
				
			//System.out.println("food name already present");
			check=check+1;
			}
			
		}
		if(check>0)
		System.out.println("Food item already present");
		System.out.println("Choose option above for selection:");
	}
	if (check<1) {
		
	
	String sql= "update foodtable set item_name=? where item_no=?;";
	PreparedStatement stmt =con.prepareStatement(sql);
	stmt.setString(1, item_name4);
	stmt.setInt(2,item_no4);
	int i=stmt.executeUpdate();
	if(i>0) {
		System .out.println("Record updated scuccessfully");
	}
	else {
		System .out.println("Not updated");
		
	}
	System.out.println("Choose option above for selection:");
	}
}
public void delete_customer() throws SQLException
{
	Connection con=Conect.createc();
	
	String sql= "delete from customer where cust_id="+del_cust_id;
	PreparedStatement stmt =con.prepareStatement(sql);
	stmt.execute();
	System.out.println("Done");
	System.out.println("Choose option above for selection:");

}
public  void cancel_ordered_item() throws SQLException {
Connection con=Conect.createc();
     
	String sql= "delete from order_table where food_id="+cncl_food_id;
	PreparedStatement stmt =con.prepareStatement(sql);
	stmt.execute();
	System.out.println("Done");
	System.out.println("Choose option above for selection:");
	
}
public void cancel_ordered_item1() throws SQLException {
	Connection con=Conect.createc();
    
	String sql= "delete from order_table where order_id="+cncl_order_id;
	PreparedStatement stmt =con.prepareStatement(sql);
	stmt.execute();
	System.out.println("Done");
	System.out.println("Choose option above for selection:");
	
}
public static void check_payment_deatils() throws SQLException {
	Connection con=Conect.createc();
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select *from payment_table ");
	System.out.println("\t\tPAYMENT_ID\tPRICE\t\tORDER_ID");
	while(rs.next()) {
	
	int a=rs.getInt(1);
	int b=rs.getInt(2);
	int f=rs.getInt(3);
	System.out.println("\t\t"+a+"\t\t"+b+"\t\t"+f);
	}	
	System.out.println("Choose option above for selection:");
	
	
}
public static void check_delivery_status() throws SQLException {
	Connection con=Conect.createc();
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select *from delivery_table ");
	System.out.println("\tDelivery_id\tdelivery_location\texcepted_arrival\tORDER_ID");
	while(rs.next()) {
	
	int a=rs.getInt(1);
	String b=rs.getString(2);
	String c=rs.getString(3);
	int f=rs.getInt(4);
	System.out.println("\t"+a+"\t\t\t"+b+"\t\t\t"+c+"\t\t\t"+f);
	}	
	
}


public void displayitems(ArrayList<shop> arr) {
	   for(shop shop:arr)
	   {
		  
		   System.out.println("Item no:"+shop.item_no);
		   System.out.println("Item name:"+shop.item_name);
		   System.out.println("Item price:"+shop.item_price);
		   System.exit(0);
	   }	
		
	}





}





//>>>>>>> e737607b344d276370f0af684c2698effd6f4022
