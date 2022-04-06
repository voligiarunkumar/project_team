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

	private int item_no;
	private String item_name;
	private int item_price;
	private String item_avail;
	private int item_no1;
	private int cust_id;
	private int item_no2;
    private int	item_price3;
    private int  item_no3;
	private int item_no4;
	private static String item_name4;

	public void add_newitem() throws ClassNotFoundException, SQLException
	{
		//Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=Conect.createc();
		//Statement st=con.createStatement();
		//ResultSet rs=st.executeQuery("insert into foodtable from customer");
		String sql= "insert into foodtable (item_no,item_name,item_price,item_avail)values (?,?,?,?);";
		PreparedStatement stmt =con.prepareStatement(sql);
		stmt.setInt(1, item_no);
		stmt.setString(2,item_name);
		stmt.setLong(3, item_price);
		stmt.setString(4,item_avail);
		stmt.execute();
		System.out.println("Inserted");
		System.out.println("Choose option above for selection:");
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





