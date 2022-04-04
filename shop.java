package inventory_management;

import java.sql.Connection;
import java.sql.DriverManager;
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
	private int item_no;

	private String item_name;
	private int item_price;
	private String item_avail;
	private int item_no1;
	
	public void add_newitem() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arun","root","arunkumar@123");
		@SuppressWarnings("unused")
		Statement st=con.createStatement();
		//ResultSet rs=st.executeQuery("insert into foodtable from customer");
		String sql= "insert into foodtable (item_no,item_name,item_price,item_avail)values (?,?,?,?);";
		@SuppressWarnings("unused")
		PreparedStatement stmt =con.prepareStatement(sql);
		stmt.setInt(1, item_no);
		stmt.setString(2,item_name);
		stmt.setLong(3, item_price);
		stmt.setString(4,item_avail);
		stmt.execute();
		System.out.println("inserted");
	}
	public void delete_item() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arun","root","arunkumar@123");
		@SuppressWarnings("unused")
		Statement st=con.createStatement();
		@SuppressWarnings("unused")
		String sql= "delete from  foodtable where item_no="+item_no1;
		@SuppressWarnings("unused")
		PreparedStatement stmt =con.prepareStatement(sql);
		stmt.execute();
		System.out.println("done");
	}
   public void displayitems(ArrayList<shop> arr) {
	   for(shop shop:arr)
	   {
		  System.out.println("i");
		   System.out.println("item no:"+shop.item_no);
		   System.out.println("item name:"+shop.item_name);
		   System.out.println("item price:"+shop.item_price);
		   System.exit(0);
	   }	
		
	}


}





