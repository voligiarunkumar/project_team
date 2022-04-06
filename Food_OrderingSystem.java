package inventory_management;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.ArrayList;
import java.util.Scanner;

public class Food_OrderingSystem {
	static String array[]= new String[100];
   
    public static Scanner input = new Scanner(System.in);
    public static String more;
    public static int choose,quantity=1;
    public static double total=0,pay;
    public static String getstring;
    public static void menu() throws ClassNotFoundException, SQLException{
   
    	System.out.println("\t\t\t\t\tONLINE FOOD ORDERING SYSTEM");
    	System.out.println("+=====================================================================================================================+");
        System.out.println("\t\t\t\t\t         MENU LIST       ");
        System.out.println("+=====================================================================================================================+");
    	System.out.println("  \t\t\t\t ITEM_ID\t\tITEM NAME\t\tITEM_PRICE\t\tITEM_AVAILABILITY");
    	//Class.forName("com.mysql.jdbc.Driver");
    	Connection con=Conect.createc();
		//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arun","root","root");
		Statement st=con.createStatement();
		  ResultSet rs=st.executeQuery("select *from foodtable order by item_no");
		  while(rs.next()) {
			  int a=rs.getInt(1);
			  String b=rs.getString(2);
			  int c= rs.getInt(3);
			  String d= rs.getString(4);
			  
			  System.out.println("\t\t\t\t"+a+"\t\t\t"+b+"\t\t\t "+c+"\t\t\t\t"+d );
			  
	 }
      System.out.println("+=========================================================================================================================+");
    }
    public static void payment() {
    	System.out.println("Total price is " + total);
        System.out.println("Enter a payment ");
        pay = input.nextDouble();
        if(pay <total){
          System.out.println("========Not enough payment===========");
           payment();
        }
        else{
        System.out.println("Total price is " + total);
        total = pay-total;
        System.out.println("Extra amount paid is : "  +  total);
        System.out.println("Thank you for your order");
        System.exit(0);
    }
    }
    public static void order() throws SQLException{
    	//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arun","root","root");
    	Connection con=Conect.createc();
		Statement st=con.createStatement();
		  
		 /* while(rs.next()) {
			  //int a=rs.getInt(1);
			  String b=rs.getString(2);
			     
			    
			  //int c= rs.getInt(3);
			  //String d= rs.getString(4);
			  System.out.println("Select by entering number:"+b);
			
		
		 }*/
		  
    //System.out.println("Press 1 to BURGER\nPress 2 to PIZZA\nPress 3 to WHITE SAUCE\nPress 4 to Cancel");
    System.out.print("ENTER NUMNER TO CHOOSE :");
    choose = input.nextInt();
    ResultSet rs=st.executeQuery("select * from  foodtable where item_no="+choose);
    
    
    if(rs.next()) {
    String i_name = rs.getString(2);
    int i_price=rs.getInt(3);
    System.out.println("You choose : "+i_name);
    System.out.print("How much quantity you want to Buy? :");
    quantity =input.nextInt();
   if(quantity>0) {
    total = total +(quantity*i_price);
    System.out.println("YOU WANT TO BUY ANYTHING? ");
    System.out.println("Press Y for Yes and N for No : ");
    more = input.next();
    if(more.equalsIgnoreCase("Y")){
        order();//call the method you to create 
    }
    else if(more.equalsIgnoreCase("N")){
    	System.out.println("press 1 to order 2 for add to cart :");
         @SuppressWarnings({ "resource" })
		Scanner sc=new Scanner(System.in);
         int  opt = sc.nextInt();
         switch(opt){
           case 1:
        	   payment();
           case 2:
        }}
    else{
    	System.out.println("You Enter Invalid value, Choose food again");
    	total=0;
    	order();
    	}
    
    }
    
    else {
    	System.out.println("Enter valid Quantity, Choose food again");
    	total=0;
    	order();
    }
   
    }
   
    else {
    	System.out.println("Item not Present Enter valid Item Number");
    	order();
    	
    }
   
    
    }
    
    
    }
    
    
    
    
    
    
    
    
    //conditions
    /*if(choose==1){
    
       System.out.println("You choose"+Food_OrderingSystem.getstring);
        System.out.print("How much quantity you want to Buy? :");
        quantity =input.nextInt();
        total = total +(quantity*200);
        
        System.out.println("YOU WANT TO BUY ANYTHING? ");
        System.out.println("Press Y for Yes and N for N : ");
        more = input.next();
        if(more.equalsIgnoreCase("Y")){
            order();//call the method you to create 
        }
        else{
        	System.out.println("press 1 to order 2 for add to cart");
             @SuppressWarnings({ "resource" })
			Scanner sc=new Scanner(System.in);
             int  opt = sc.nextInt();
             switch(opt){
               case 1:
            	   payment();
               case 2:
   
            	
        	
        	
             }
            }
        }
    else if(choose==2){
    	System.out.println("You choose PIZZA");
        System.out.print("How many PIZZA'S you want to Buy? :");
        quantity =input.nextInt();
        total = total +(quantity*349);
        
        System.out.println("YOU WANT TO BUY ANYTHING? ");
        System.out.println("Press Y for Yes and N for N : ");
        more = input.next();
        if(more.equalsIgnoreCase("Y")){
            order();
        }else{
        	payment();
            }
        }
      else if(choose==3){
    	  System.out.println("You choose WHITE SAUCE");
	        System.out.print("How many WHITE SUCE'S you want to Buy? :");
	        quantity =input.nextInt();
	        total = total +(quantity*300);
	        
	        System.out.println("YOU WANT TO BUY ANYTHING? ");
	        System.out.println("Press Y for Yes and N for N : ");
	        more = input.next();
	        if(more.equalsIgnoreCase("Y")){
	            order(); 
	        }else{
	        	payment();
	            }
        }
    else if(choose==4){
        //System.exit(0);//close program
        
    }else{
        System.out.println("Choose 1 to 4 only!");
        order();
    }*/
  // String sql1= "select * from  foodtable where item_no="+choose;
	
    
    
    
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    	
