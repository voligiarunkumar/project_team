package inventory_management;

import java.security.Timestamp;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Scanner;

public class Cartt {
	
	
	private int choose_foodid;
	private int choose_foodqty;
	private static int cust1_id;
	private int get_opt;
	private int cuid;
	private int ffid;
	private int ffq;
	order_table o2=new order_table();
	Food_OrderingSystem f2=new Food_OrderingSystem();
	
	static Scanner sc=new Scanner(System.in);
	private int choose_foodp;
	private String choose_foodname;
 Cartt(int cid,int fid,String fname,int fq,int fp){
		cust1_id=cid;
		this.choose_foodid=fid;
		this.choose_foodname=fname;
		this.choose_foodqty=fq;
		this.choose_foodp=fp;
		
		
	}
	Cartt(){
		
	}
	Cartt(int cuid,int ffid,int ffq){
		this.cuid=cuid;
		this.ffid=ffid;
		this.ffq=ffq;
	}

 public int getCust_id() {
		return cust1_id;
	}
	public void setCust_id(int cust_id) {
		cust1_id = cust_id;
		
		
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
		//add_order(0);
		
	}
	
	public int getChoose_foodp() {
		return choose_foodp;
	}
	public void setChoose_foodp(int choose_foodp) {
		this.choose_foodp = choose_foodp;
	}
	public String getChoose_foodname() {
		return choose_foodname;
	}
	public void setChoose_foodname(String choose_foodname) {
		this.choose_foodname = choose_foodname;
	}
	
	
	
	
	public void display_cart() throws SQLException {
		System.out.println("\t\t\t\t\t         Customer Cart       ");
		System.out.println("+=====================================================================================================================+");
		System.out.println("\t\t\t ITEM_ID\t\tITEM NAME\t\tITEM_QUANTITY\t\tITEM_PRICE");
		Connection con=Conect.createc();
		//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arun","root","root");
		PreparedStatement pstmt;
		pstmt = con.prepareStatement(
				  "select *from cart1_table where cart_id=?");
		pstmt.setInt(1,getCust_id()+1000);
		ResultSet rs = pstmt.executeQuery(); 
	
		  while(rs.next()) {
			  int a=rs.getInt(3);
			  String b=rs.getString(4);
			  int c= rs.getInt(5);
			  int d= rs.getInt(6);
			  
			  System.out.println("\t\t\t"+a+"\t\t\t"+b+"\t\t\t "+c+"\t\t\t"+d);
		
		  }
		
	}
	

public void add_cart() throws SQLException {
		
	    //a=getCust_id()+1000;
	   
	    
	    ArrayList<Cartt> names = new ArrayList<Cartt>();
	    Cartt o1=new Cartt(getCust_id(),getChoose_foodid(),getChoose_foodname(),getChoose_foodqty(),getChoose_foodp());
	    names.add(o1);
	    Connection con=Conect.createc();
		String sql= "insert into cart1_table (cust_id,cart_id,food_id,food_name,food_quantity,Food_price)values (?,?,?,?,?,?);";
		PreparedStatement stmt =con.prepareStatement(sql);
		for(int i=0;i<names.size();i++) {
		stmt.setInt(1,names.get(i).getCust_id());
		stmt.setInt(2,names.get(i).getCust_id()+1000);
		stmt.setInt(3,names.get(i).getChoose_foodid());
		stmt.setString(4,names.get(i).getChoose_foodname());
		stmt.setInt(5, names.get(i).getChoose_foodqty());
		stmt.setInt(6,names.get(i).getChoose_foodp()*getChoose_foodqty());
		
		
		stmt.execute();}
		System.out.println("Cart detail Inserted");
		}
	
	
public void delete_cartitem() throws SQLException {
	
	System.out.println("ENTER ITEMID WHICH YOU WANT TO REMOVE FROM CART :");
	int item=sc.nextInt();
	try
	{
		Connection con=Conect.createc();
		String q="delete  from cart1_table where food_id=? and cust_id=?";
		PreparedStatement pst=con.prepareStatement(q);
		pst.setInt(1,item);
		pst.setInt(2,getCust_id());
		pst.executeUpdate();
		System.out.println("Item Removed ");
	}catch(Exception e)
	{
		System.out.println("Item Not present");
	}
	
}


 public void order_cartitems() throws SQLException {
	   
	 //To fetch data from cart table 
	 ArrayList<Cartt> corder = new ArrayList<Cartt>();
	 java.util.Date date1=new java.util.Date();
		java.sql.Date sqlDate=new java.sql.Date(date1.getTime());
		java.sql.Timestamp sqlTime=new java.sql.Timestamp(date1.getTime());
	 Connection con=Conect.createc();
		PreparedStatement pstmt;
		pstmt = con.prepareStatement(
				  "select *from cart1_table where cart_id=?");
		pstmt.setInt(1,getCust_id()+1000);
		ResultSet rs = pstmt.executeQuery(); 
	
		  while(rs.next()) {
			  int a=rs.getInt(1);
			  int c= rs.getInt(3);
			  int d= rs.getInt(5);
			  Cartt ca=new Cartt(a,c,d);
			  corder.add(ca);
			  
			  //System.out.println("\t\t\t"+a+"\t\t\t"+b+"\t\t\t "+c+"\t\t\t"+d);
			  }
		  //order from the cart
		  
		  
		  String sql12= "insert into order_table (cust_id,food_id,order_date,Order_time,food_qty)values (?,?,?,?,?);";
			PreparedStatement stmt =con.prepareStatement(sql12);
			for(int i=0;i<corder.size();i++) {
			stmt.setInt(1,corder.get(i).cuid);
			stmt.setInt(2,corder.get(i).ffid);
			stmt.setDate(3,sqlDate);
			stmt.setTimestamp(4,sqlTime);
			stmt.setInt(5,corder.get(i).ffq);
			stmt.execute();
			}
			System.out.println("order inerted");
			
			deliverycart();
			cartpayment();
			
			
			//Delete from cart table after order
			
			String q1="delete  from cart1_table where cust_id=?";
			PreparedStatement pst=con.prepareStatement(q1);
			pst.setInt(1,getCust_id());
			pst.executeUpdate();
			System.out.println("Data Deleted from Cart ");
		  
	 
 }

public void cart_operation() throws SQLException {
	
	System.out.println("\n+=====================================================================================================================+\n");
	System.out.println(" 1.Order");
	System.out.println(" 2.Delete Item");
	System.out.println("\n\n\nEnter Number ::... ");
	int num=sc.nextInt();
	switch(num) {
	case 1:
		order_cartitems();
		//deliverycart();
		break;
	case 2:
		delete_cartitem();
		break;
	}
	
}
public void getcartorderid() throws SQLException {
	Connection con=Conect.createc();
	java.util.Date date1=new java.util.Date();
	java.sql.Date sqlDate=new java.sql.Date(date1.getTime());
	PreparedStatement pstmt;
	pstmt = con.prepareStatement("select order_id from order_table where cust_id=? and order_date=?");
	pstmt.setInt(1,getCust_id());
	pstmt.setDate(2,sqlDate);
	ResultSet rs = pstmt.executeQuery();
	while(rs.next()) {
		
	}
	
}
@SuppressWarnings("unchecked")
public void deliverycart() throws SQLException {
	@SuppressWarnings("rawtypes")
	ArrayList  AA= new ArrayList();
	Connection con=Conect.createc();
	java.util.Date date1=new java.util.Date();
	java.sql.Date sqlDate=new java.sql.Date(date1.getTime());
	PreparedStatement pstmt;
	pstmt = con.prepareStatement("select order_id from order_table where cust_id=? and order_date=?");
	pstmt.setInt(1,getCust_id());
	pstmt.setDate(2,sqlDate);
	ResultSet rs = pstmt.executeQuery();
	while(rs.next()) {
		AA.add(rs.getInt(1));
	}
	System.out.println("Enter delivery location:");
	@SuppressWarnings({  "resource" })
	
	
	Time a=null;
    String location=sc.next();
	String sql= "insert into delivery_table (delivery_location,expected_Arrival,order_id)values (?,?,?);";
	PreparedStatement stmt =con.prepareStatement(sql);
	
	//stmt.setLong(3,expected_arriv);
	for(int i=0;i<AA.size();i++) {
	stmt.setString(1,location);
	stmt.setTime(2,a);
	stmt.setInt(3,(int) AA.get(i));
	stmt.execute();}
	System.out.println("Delivery location done");}

@SuppressWarnings("unchecked")
public void cartpayment() throws SQLException {
	@SuppressWarnings("rawtypes")
	ArrayList  BB= new ArrayList();
	Connection con=Conect.createc();
	PreparedStatement pstmt;
	pstmt = con.prepareStatement("select Food_price from cart1_table where cust_id=?");
	pstmt.setInt(1,getCust_id());
	
	
	ResultSet rs = pstmt.executeQuery();
	while(rs.next()) {
		BB.add(rs.getInt(1));
	}
	
	
	
	@SuppressWarnings("rawtypes")
	ArrayList  CC= new ArrayList();
	
	java.util.Date date1=new java.util.Date();
	java.sql.Date sqlDate=new java.sql.Date(date1.getTime());
	pstmt = con.prepareStatement("select order_id from order_table where cust_id=? and order_date=?");
	pstmt.setInt(1,getCust_id());
	pstmt.setDate(2,sqlDate);
	
	ResultSet rs1 = pstmt.executeQuery();
	while(rs1.next()) {
		CC.add(rs1.getInt(1));
	}
	int total=0;
	for(int j=0;j<BB.size();j++) {
		total=total+(int) BB.get(j);
	}
	System.out.println("Total price is " + total);
    System.out.println("Enter a payment ");
    double pay = sc.nextDouble();
 
    if(pay==total){
    	String sql= "insert into payment_table (payment_id,paid_amount,order_id)values (?,?,?);";
    	PreparedStatement stmt =con.prepareStatement(sql);
    	for(int i=0;i<CC.size();i++) {
    	int pay_id = (int)(Math.random() * 500 + 9999);
    	stmt.setInt(1,pay_id);
    	stmt.setInt(2,(int)BB.get(i));
    	stmt.setInt(3,(int) CC.get(i));
    	stmt.execute();}
    System.out.println("Payment Successful");
    System.out.println("Thank you for your order");
    }else {
    	System.out.println("========Not enough payment===========");
        cartpayment();
    }
    
}}




