//<<<<<<< HEAD
//package inventory_management;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Mainclass {
//    public static ArrayList<Registration> registration=new ArrayList<Registration>();
//    public static ArrayList<login> login=new ArrayList<login>();
//    public static ArrayList<admin_login>adminlogin=new ArrayList<admin_login>();
//    public static ArrayList<shop> shopList=new ArrayList<shop>();
//	public static ArrayList<Customer> custList=new ArrayList<Customer>();
//	static void registration()
//	{
//		System.out.println("+=====================================================welcome to food ordering portal==========================================================================+");
//		System.out.println("\t\t\t\t\t\t\t\t1.registration");
//		System.out.println("\t\t\t\t\t\t\t\t2.login");
//		System.out.println("\t\t\t\t\t\t\t\t3.adminlogin");
//		System.out.println("+=============================================================================================================================================================  +");
//		
//	}
//	static  void menu()
//	{
//		System.out.println("+===============================================================================================+");
//		System.out.println("\t\t\t\t   1.Add New Item");
//		System.out.println("\t\t\t\t   2.Delete item");
//		System.out.println("\t\t\t\t   3.check customer details");
//		System.out.println("\t\t\t\t   4.check customer ordered details");
//		System.out.println("\t\t\t\t   5.cancel ordered food");
//		System.out.println("\t\t\t\t   6.check payment details");
//		System.out.println("\t\t\t\t   7.change price for item");
//		System.out.println("\t\t\t\t   8.check for delivery satus");
//		System.out.println("\t\t\t\t   9.display items");
//		System.out.println("\t\t\t\t   10.change name of the item");
//		System.out.println("+===============================================================================================+");
//	}
//
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		// TODO Auto-generated method stub1
//		int opt;
//		
//	//@SuppressWarnings("unused")
//    	registration();
//      int opt1;
//	do {
//    	  @SuppressWarnings("unused")
//		Registration r=new Registration();
//    	  
//    	  @SuppressWarnings("resource")
//		Scanner se=new Scanner(System.in);
//    	  opt1=se.nextInt();
//    	   switch(opt1) {
//    	   case 1:
//    		   System.out.println("Enter username:");
//    		   se=new Scanner(System.in);
//    		   r.setUsername(se.nextLine());  
//    		   System.out.println("enter address:");
//    		   se=new Scanner(System.in);
//    		   r.setAdderss(se.nextLine());
//    		   System.out.println("Enter phono:");
//    		   se=new Scanner(System.in);
//    		   r.setPhono(se.nextLong());
//    		   System.out.println("create password:");
//    		   se=new Scanner(System.in);
//    		  r.setCreate_password(se.nextLine());
//    		  System.out.println("reenter password:");
//   		        se=new Scanner(System.in);
//   		       r.setReenter_password(se.nextLine());
//   		      
//    		   registration.add(r);
//    		   if(Registration.check==1 && Registration.check1==1) {
//    		   r.registration_insert();
//    		   }
//    		   else {
//    			   System.out.println("Your data is not meet our requirement please provide again");
//    			   registration();
//    		   }
//    		   //r.registration_details(registration);
//    		  // menu();
//    		   
//    		   break;
//    	  case 2:
//    		  login l= new login();
//        	  System.out.println("enter username");
//        	  @SuppressWarnings("unused") 
//        	  Scanner sc1=new Scanner(System.in);
//        	  ///String username = sc1.nextLine();
//        	  l.setUsername(sc1.nextLine());
//        	  System.out.println("enter password");
//        	    Scanner sc11=new Scanner(System.in);
//        	   l.setPassword(sc11.nextLine());
//        	   
//        	   //l.validate_login(username);
//               login.add(l);
//               //l.login_details(login);
//               //menu();
//    		    break;
//    		    
//    	   case 3:
//    		   admin_login al= new admin_login();
//         	   System.out.println("enter username:");
//                Scanner sc111=new Scanner(System.in);
//         	   al.setUsername(sc111.nextLine());
//         	   System.out.println("enter password:");
//         	   sc111=new Scanner(System.in);
//         	   al.setPassword(sc111.nextLine());
//            	   
//                do {
//        			@SuppressWarnings({ "unused", "resource" }) 
//        			Scanner sc1111= new Scanner(System.in);
//        		   shop s =new shop();
//        			opt=sc1111.nextInt();
//        			switch(opt) {
//        			case 1:
//        				System.out.println("enter item_no:");
//        				s.setItem_no(sc1111.nextInt());
//                        System.out.println("enter item_name:");
//        				sc1111= new Scanner(System.in);
//        				s.setItem_name(sc1111.nextLine());
//        				System.out.println("enter item_price:");
//        				sc1111=new Scanner(System.in);
//        				s.setItem_price(sc1111.nextInt());
//        				System.out.println("enter item_avilabilty:");
//        				sc1111=new Scanner(System.in);
//        				s.setItem_avail(sc1111.nextLine());
//        				//s.addnewitem(s);  
//        	            shopList.add(s);
//        				System.out.println("--------Added new items for add more choose again-------------");
//        				break;
//        			case 2:
//        				  System.out.println("enter item_no that you want to delete");
//        				  sc1111=new Scanner(System.in);
//        				  s.setItem_no1(sc1111.nextInt());
//        				break;
//        			case 3:
//        				System.out.println("choose 1 for search by id 2 display all:");
//        				sc111=new Scanner(System.in);
//        				int check=sc111.nextInt();
//        				if(check==1) {
//        				System.out.println("enter the the cust_id:");
//        				sc1111=new Scanner(System.in);
//        			     s.setCust_id(sc1111.nextInt());
//        				}
//        				else if(check==2) {
//        					shop.display_all_customer();
//        				}
////        				customer_deatils();
////        				Customer c=new Customer();
////        				c.displaycustomer_details(custList);
//        				break;
//        			case 7:
//        				System.out.println("enter  item_no:");
//        				sc1111= new Scanner(System.in);
//        				s.setItem_no3(sc1111.nextInt());
//        				System.out.println("enter  item_price:");
//        				sc1111= new Scanner(System.in);
//        				s.setItem_price3(sc1111.nextInt());
//        				break;
//        				
//        			case 9:
//        				 System.out.println("choose 1 for search by id 2 for dispaly all");
//        				 sc111=new Scanner(System.in);
//         				int check1=sc111.nextInt();
//         				if(check1==1) {
//         				System.out.println("enter the username of the food_id:");
//         				sc1111=new Scanner(System.in);
//         			     s.setItem_no2(sc1111.nextInt());
//         				}
//         				else if(check1==2) {
//         					shop.display_all_food_items();
//         				}       		
//        				 break;
//        			case 10:
//        				System.out.println("enter  item_no:");
//        				sc1111= new Scanner(System.in);
//        				s.setItem_no4(sc1111.nextInt());
//        				System.out.println("enter  item_name:");
//        				sc1111= new Scanner(System.in);
//        				s.setItem_name4(sc1111.nextLine());
//        				break;
//        				
//        			default:
//        				break;
//        				
//        			}
//        		}while(opt!=0);
//
//     		    break;
//     		    }
//    	     }while(opt1!=0);
//	}
//	public  static void   customer_deatils() {
//		@SuppressWarnings("resource")
//		Scanner sc = new Scanner(System.in);
//		Customer c=new Customer();
//		System.out.println("enter customer name:");
//		c.setCustomer_name(sc.nextLine()); 
//		System.out.println("enter customer id:");
//		c.setCustomer_id(sc.nextInt());
//		System.out.println("item no:");
//		c.setItem_no(sc.nextInt());
//		System.out.println("total_bill:");
//	  c.setTotal_bill(sc.nextInt());
//		System.out.println("purcahse qty:");
//		c.setPurchase_qty(sc.nextInt());
//		//c.addcustomerdeatils(c);
//	    custList.add(c);
//	    
//	     
//	}
//
//}
//=======
package inventory_management;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Mainclass {
    public static ArrayList<Registration> registration=new ArrayList<Registration>();
    public static ArrayList<login> login=new ArrayList<login>();
    public static ArrayList<admin_login>adminlogin=new ArrayList<admin_login>();
    public static ArrayList<shop> shopList=new ArrayList<shop>();
	public static ArrayList<Customer> custList=new ArrayList<Customer>();
	static void registration()
	{
		System.out.println("+=====================================================Welcome to Food Ordering Portal==========================================================================+");
		System.out.println("\t\t\t\t\t\t\t\t1.Registration");
		System.out.println("\t\t\t\t\t\t\t\t2.Login");
		System.out.println("\t\t\t\t\t\t\t\t3.Admin Login");
		System.out.println("+=============================================================================================================================================================  +");
		
	}
	static  void menu()
	{
		System.out.println("+================================================================================================================================================================+");
		System.out.println("\t\t\t\t   1.Add New Item");
		System.out.println("\t\t\t\t   2.Delete item");
		System.out.println("\t\t\t\t   3.Check customer details");
		System.out.println("\t\t\t\t   4.Check customer ordered details");
		System.out.println("\t\t\t\t   5.Check Canceled order");
		System.out.println("\t\t\t\t   6.Check payment details");
		System.out.println("\t\t\t\t   7.Change price for item");
		System.out.println("\t\t\t\t   8.Check for delivery satus");
		System.out.println("\t\t\t\t   9.Display items");
		System.out.println("\t\t\t\t   10.Change name of the item");
		System.out.println("\t\t\t\t   11.Delete customer");
		System.out.println("\t\t\t\t   12.Cancel ordered item");
		System.out.println("+================================================================================================================================================================+");
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub1
		int opt;
		
	//@SuppressWarnings("unused")
    	registration();
      int opt1;
	do {
    	  Registration r=new Registration();
    	  
    	  @SuppressWarnings("resource")
		Scanner se=new Scanner(System.in);
    	  opt1=se.nextInt();
    	   switch(opt1) {
    	   case 1:
    		   System.out.println("Enter username:");
    		   se=new Scanner(System.in);
    		   r.setUsername(se.nextLine());  
    		   System.out.println("Enter address:");
    		   se=new Scanner(System.in);
    		   r.setAdderss(se.nextLine());
    		   System.out.println("Enter phono:");
    		   se=new Scanner(System.in);
    		   r.setPhono(se.nextLong());
    		   System.out.println("Create password:");
    		   se=new Scanner(System.in);
    		  r.setCreate_password(se.nextLine());
    		  System.out.println("Re-Enter password:");
   		        se=new Scanner(System.in);
   		       r.setReenter_password(se.nextLine());
   		      
    		   registration.add(r);
    		   if(Registration.check==1 && Registration.check1==1) {
    		   r.registration_insert();
    		   }
    		   else {
    			   System.out.println("Your data is not meet our requirement please provide again");
    			   registration();
    		   }
    		   //r.registration_details(registration);
    		  // menu();
    		   
    		   break;
    	  case 2:
    		  login l= new login();
        	  System.out.println("Enter username");
        	  Scanner sc1=new Scanner(System.in);
        	  ///String username = sc1.nextLine();
        	  l.setUsername(sc1.nextLine());
        	  System.out.println("Enter password");
        	    Scanner sc11=new Scanner(System.in);
        	   l.setPassword(sc11.nextLine());
        	   
        	   //l.validate_login(username);
               //login.add(l);
               //l.login_details(login);
               //menu();
    		    break;
    		    
    	   case 3:
    		   admin_login al= new admin_login();
         	   System.out.println("Enter username:");
                Scanner sc111=new Scanner(System.in);
         	   al.setUsername(sc111.nextLine());
         	   System.out.println("Enter password:");
         	   sc111=new Scanner(System.in);
         	   al.setPassword(sc111.nextLine());
            	  
                do {
        			@SuppressWarnings({ "resource" }) 
        			Scanner sc1111= new Scanner(System.in);
        		   shop s =new shop();
        			opt=sc1111.nextInt();
        			
        			switch(opt) {
        			case 1:
        				if(admin_login.check1>0) { 
        				System.out.println("Enter item_no:");
        				s.setItem_no(sc1111.nextInt());
                        System.out.println("Enter item_name:");
        				sc1111= new Scanner(System.in);
        				s.setItem_name(sc1111.nextLine());
        				System.out.println("Enter item_price:");
        				sc1111=new Scanner(System.in);
        				s.setItem_price(sc1111.nextInt());
        				System.out.println("Enter item_avilabilty:");
        				sc1111=new Scanner(System.in);
        				s.setItem_avail(sc1111.nextLine());
        				//s.addnewitem(s);  
        	            shopList.add(s);
        				//System.out.println("--------Added new items for add more choose again-------------");
        				break;}
      
        			case 2:
        				if(admin_login.check1>0) {
        				  System.out.println("Enter item_no that you want to delete");
        				  sc1111=new Scanner(System.in);
        				  s.setItem_no1(sc1111.nextInt());
        				  
        				break;
        				}
        			case 3:
        				if(admin_login.check1>0) {
        				System.out.println("Choose 1 for search by id 2 display all:");
        				sc111=new Scanner(System.in);
        				int check=sc111.nextInt();
        				if(check==1) {
        				System.out.println("Enter the username of the cust_id:");
        				sc1111=new Scanner(System.in);
        			     s.setCust_id(sc1111.nextInt());
        				}
        				else if(check==2) {
        					shop.display_all_customer();
        				}
//        				customer_deatils();
//        				Customer c=new Customer();
//        				c.displaycustomer_details(custList);
        				break;
        				}
        			case 4:
        				if(admin_login.check1>0) {
        					System.out.println("Choose 1 for search by id 2 display all:");
        					sc111=new Scanner(System.in);
            				int check=sc111.nextInt();
            				if(check==1) {
            				System.out.println("Enter the order_id:");
            				sc1111=new Scanner(System.in);
            			     s.setOrder_id(sc1111.nextInt());
            				}
            				else if(check==2) {
            					shop.check_all_ordered_details();
            				}
        				}
        			    break;
        			case 6:
        				if(admin_login.check1>0)
        					shop.check_payment_deatils();
        				
        			      break;
        			case 7:
        				if(admin_login.check1>0) {
        				System.out.println("Enter  item_no:");
        				sc1111= new Scanner(System.in);
        				s.setItem_no3(sc1111.nextInt());
        				System.out.println("Enter  item_price:");
        				sc1111= new Scanner(System.in);
        				s.setItem_price3(sc1111.nextInt());
        				break;
        				}
        			case 8:
        				if(admin_login.check1>0)
        				{
        					shop.check_delivery_status();
        				}
       
        				
        			case 9:
        				if(admin_login.check1>0) {
        				 System.out.println("Choose 1 for search by Id 2 for Dispaly all");
        				 sc111=new Scanner(System.in);
         				int check1=sc111.nextInt();
         				if(check1==1) {
         				System.out.println("Enter the username of the food_id:");
         				sc1111=new Scanner(System.in);
         			     s.setItem_no2(sc1111.nextInt());
         				}
         				else if(check1==2) {
         					shop.display_all_food_items();
         				}       		
        				 break;
        				}
        			case 10:
        				if(admin_login.check1>0) {
        				System.out.println("Enter  item_no:");
        				sc1111= new Scanner(System.in);
        				s.setItem_no4(sc1111.nextInt());
        				System.out.println("Enter  item_name:");
        				sc1111= new Scanner(System.in);
        				s.setItem_name4(sc1111.nextLine());
        				break;
        				}
        				
        			case 11:
        				if(admin_login.check1>0) {
        				System.out.println("Enter customer_id:");
        				s.setDel_cust_id(sc1111.nextInt());
        				
        				break;
        				}
        			case 12:
        				if(admin_login.check1>0) {
        	            System.out.println("Choose 1 for Cancel  order by order_id");
        	            System.out.println("Choose 2 for Cancel order by food_id ");
        	            sc1111= new Scanner(System.in);
        	            int choose=sc1111.nextInt();
        	            if(choose==1) {
        	            	System.out.println("Enter order_id:");
       	            	    s.getCncl_order_id();
        	            }
        	            else if(choose==2) {
        	            	System.out.println("Enter Food_id:");
    				        s.setCncl_food_id(sc1111.nextInt());
            	                       
            	            	
            	          }
        	           
						  break;
        				}
        			default:
        				break;
        				
        			}
        		}while(opt!=0);

     		    break;
     		    }
    	     }while(opt1!=0);
	}
	public  static void   customer_deatils() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Customer c=new Customer();
		System.out.println("Enter customer name:");
		c.setCustomer_name(sc.nextLine()); 
		System.out.println("Enter customer id:");
		c.setCustomer_id(sc.nextInt());
		System.out.println("Item no:");
		c.setItem_no(sc.nextInt());
		System.out.println("Total_bill:");
	  c.setTotal_bill(sc.nextInt());
		System.out.println("Purchase qty:");
		c.setPurchase_qty(sc.nextInt());
		//c.addcustomerdeatils(c);
	    custList.add(c);
	    
	     
	}


}

