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
		//System.out.println("\t\t\t\t   0.Main Menu");
		System.out.println("\t\t\t\t   1.Add New Item");
		System.out.println("\t\t\t\t   2.Delete item");
		System.out.println("\t\t\t\t   3.Check customer details");
		System.out.println("\t\t\t\t   4.Check customer ordered details");
		System.out.println("\t\t\t\t   5.Check payment details");
		System.out.println("\t\t\t\t   6.Change price for item");
		System.out.println("\t\t\t\t   7.Check for delivery status");
		System.out.println("\t\t\t\t   8.Display items");
		System.out.println("\t\t\t\t   9.Change name of the item");
		System.out.println("\t\t\t\t   10.Delete customer");
		System.out.println("\t\t\t\t   11.Cancel ordered item");
		System.out.println("+================================================================================================================================================================+");
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub1
		int opt=-1;
		 int opt1 = -2;
		
	//@SuppressWarnings("unused")

    	registration();
     
      
	while(opt1!=-1) {
		try {
    	  Registration r=new Registration();
    	  System.out.println("Enter respected value to choose:");
    
    	  @SuppressWarnings("resource")
		Scanner se=new Scanner(System.in);
		if(se.hasNext("[1-3]")){
    	 
    	  opt1=se.nextInt();
		}
		else {
			System.out.println("----------------------Please enter the valid input!!!---------------");
		}
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
    		   int phonecheck = 0;
    		   if(se.hasNext("[0-9]*")) {
    			   
    			   phonecheck=phonecheck+1;
    		   r.setPhono(se.nextLong());
    		   }
    		   else {
    			   System.out.println("Enter valid phone");
    		   }
    		   System.out.println("Create password:");
    		   se=new Scanner(System.in);
    		  r.setCreate_password(se.nextLine());
    		   registration.add(r);
    		   if(Registration.check>=1 && Registration.check1>=1 && phonecheck>=1) {
    		   r.registration_insert();
    		   }
    		   else {
    			   
    			   System.out.println("------------------Your data is not meet our requirement please provide again--------------------");
    			   
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
            	  
         	  while(opt!=0){
        			
        			shop s =new shop();
        			@SuppressWarnings({ "resource" }) 
        			Scanner sc1111= new Scanner(System.in);
        			if(sc1111.hasNext("[0-9]*")){
        		   
        			opt=sc1111.nextInt();
        			}
        			else {
        				System.out.println("Please provide valid input");
        				
        			}
        			switch(opt) {
        			case 1:
        				if(admin_login.check1>0) { 
        					int item_name=0;
        					int item_price=0;
        					int item_avail=0;
//        				System.out.println("Enter item_no:");
//        				s.setItem_no(sc1111.nextInt());
                        System.out.println("Enter item_name:");
                        sc1111= new Scanner(System.in);
                        if(sc1111.hasNext("[A-Za-z]*")) {
                        	s.setItem_name(sc1111.nextLine());
                        item_name=item_name+1;
     		    		   }
     		    		   else {
     		    			   System.out.println("Enter valid iteam_name");
     		    		   }
        				
        				
        				System.out.println("Enter item_price:");
        				sc1111=new Scanner(System.in);
        				 if(sc1111.hasNext("[0-9]*")) {
                               item_price=item_price+1;
        		    		   s.setItem_price(sc1111.nextInt());
        		    		   }
        		    		   else {
        		    			   System.out.println("Enter valid price");
        		    		   }
        				
        				System.out.println("Enter item_avilabilty:");
        				sc1111=new Scanner(System.in);
        				if(sc1111.hasNext("[A-Za-z]*")) {
        					item_avail=item_avail+1;
            				s.setItem_avail(sc1111.nextLine());
      		    		   }
        				else{
      		    			   System.out.println("Enter yes or no");
      		    			   System.out.println("Choose above options to add_item agian");
      		    		   }
        				if(item_name>=1&&item_price>=1&&item_avail>=1) {
        					shop.add_newitem();
        				  }
        				else {
        					System.out.println("please provide valid data");
        					System.out.println("Select above options to choose again");
        				}
        				continue;
        			
        				}
        				break;
        				
      
        			case 2:
        				if(admin_login.check1>0) {
        					int item_no=0;
        				  System.out.println("Enter item_name that you want to delete");
        				  sc1111=new Scanner(System.in);
        				  if(sc1111.hasNext("[A-Za-z]*")) {
        					  item_no=item_no+1;
        					  shop.setItem_name1(sc1111.nextLine());
       		    		   }
       		    		   else {
       		    			   System.out.println("Enter valid item_name");
       		    		   }
        				  if(item_no>=1) {
        					  shop.	delete_item();
        				  }
        				  else {
        					  System.out.println("please provide valid data");
        					  System.out.println("Select above options to choose again");
        				  }
        				
        				  
        				break;
        				}
        			case 3:
        				int check =0;
        				int choose_id=0;
        				if(admin_login.check1>0) {
        				//System.out.println("Choose 1 for search by id 2 for search by username");
        				sc111=new Scanner(System.in);
        		        System.out.println("Enter the customer_username:");
        				sc1111=new Scanner(System.in);
        				if(sc1111.hasNext("[A-Za-z]*")) {
        					choose_id=choose_id+1;
        					 s.setCust_id(sc1111.nextLine());
       		    		   }
       		    		   else {
       		    			   System.out.println("Enter valid cust_name");
       		    			 System.out.println("Select above options to choose again");
       		    		   }
        				if(choose_id>=1) {
        					shop.check_customer_details();
        					
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
        					int check1=0;
        					sc111=new Scanner(System.in);
        				  
            			    int check_order_id=0;
            				System.out.println("Enter the order_id:");
            				sc1111=new Scanner(System.in);
            				if(sc1111.hasNext("[0-9]*")) {
            					check_order_id =check_order_id+1;
            					  s.setOrder_id(sc1111.nextInt());
         		    		   }
         		    		   else {
         		    			   System.out.println("Enter valid order_id");
         		    		   }
            				if(check_order_id>=1) {
            					shop.check_ordered_details();
            				}
            			   
            				
            				else if(check1==2) {
            					shop.check_all_ordered_details();
            				}
        				}
        			    break;
        			case 5:
        				if(admin_login.check1>0)
        					shop.check_payment_deatils();
        				
        			      break;
        			case 6:
        				if(admin_login.check1>0) {
        					int item_no=0;
        					int item_price=0;
        				System.out.println("Enter  item_no:");
        				sc1111= new Scanner(System.in);
        				if(sc1111.hasNext("[0-9]*")) {
        					item_no=item_no+1;
        					s.setItem_no3(sc1111.nextInt());
   		    		   }
   		    		   else {
   		    			   System.out.println("Enter valid item_no");
   		    		   }
      				
        				
        				System.out.println("Enter  item_price:");
        				sc1111= new Scanner(System.in);
        				if(sc1111.hasNext("[0-9]*")) {
        					item_price=item_price+1;
        					s.setItem_price3(sc1111.nextInt());
   		    		   }
   		    		   else {
   		    			   System.out.println("Enter valid item_price");
   		    		   }
        				
        				if(item_no>=1 && item_price>=1) {
        					shop.change_price_item();
        				}
        				}break;
        			case 7:
        				if(admin_login.check1>0)
        				{
        					shop.check_delivery_status();
       
        					
        				}
       
        				break;
        			case 8:
        				if(admin_login.check1>0) {
        					int check1=0;
        				 System.out.println("Choose 1 for search by Id 2 for Dispaly all");
        				 sc111=new Scanner(System.in);
        				 if(sc111.hasNext("[1-2]")) {
        					 check1=sc111.nextInt();
      		    		   }
      		    		   else {
      		    			   System.out.println("Enter valid no");
      		    		   }
         				
         				if(check1==1) {
         					int food_id=0;
         				System.out.println("Enter the food_id:");
         				sc1111=new Scanner(System.in);
         				if(sc1111.hasNext("[0-9]*")) {
         					food_id=food_id+1;
         					s.setItem_no2(sc1111.nextInt());
     		    		   }
     		    		   else {
     		    			   System.out.println("Enter valid item_no");
     		    		   }
         			     if(food_id>=1) {
         			    	 shop.	display_food_items();
         			     }
         				}
         				
         				else if(check1==2) {
         					shop.display_all_food_items();
         				}       		
        				 break;
        				}
        			case 9:
        				if(admin_login.check1>0) {
        					int item_no4=0;
        					int food_name4=0;
        				System.out.println("Enter  item_no:");
        				sc1111= new Scanner(System.in);
        				if(sc1111.hasNext("[0-9]*")) 
        				   {
         					item_no4=item_no4+1;
         					s.setItem_no4(sc1111.nextInt());
     		    		   }
     		    		   else {
     		    			   System.out.println("Enter valid item_no");
     		    		   }
        				System.out.println("Enter  item_name:");
        				sc1111= new Scanner(System.in);
        				if(sc1111.hasNext("[A-Za-z]*")) {
         					food_name4=food_name4+1;
         					s.setItem_no4(sc1111.nextInt());
     		    		   }
     		    		   else {
     		    			   System.out.println("Enter valid item_name");
     		    		   }
        				if(item_no4>=1&& food_name4>=1)
        				{
        					shop.change_item_name();
        				}
        				
        				break;
        				}
        				
        			case 10:
        				if(admin_login.check1>0) {
        					int del_cust_id=0;
        				System.out.println("Enter customer_id:");
        				sc1111=new Scanner(System.in);
        				if(sc1111.hasNext("[0-9]*")) {
         					del_cust_id=del_cust_id+1;
         					s.setDel_cust_id(sc1111.nextInt());
     		    		   }
     		    		   else {
     		    			   System.out.println("Enter valid_cust_id");
     		    		   }
        			   break;
        				}
        			case 11:
        				if(admin_login.check1>0) {
        					int choose=0;
        					int order_id=0;
        					int food_id=0;
        	            System.out.println("Choose 1 for Cancel  order by order_id");
        	            System.out.println("Choose 2 for Cancel order by food_id ");
        	            sc1111= new Scanner(System.in);
        	            if(sc1111.hasNext("[1-2]")) {
        	            	  choose=sc1111.nextInt();
     		    		   }
     		    		   else {
     		    			   System.out.println("Enter valid input");
     		    		   }
        	           
        	            if(choose==1) {
        	            	System.out.println("Enter order_id:");
        	            	 if(sc1111.hasNext("[0-9]*")) {
        	            		 order_id=order_id +1;
        	            		 s.getCncl_order_id();
        		    		   }
        		    		   else {
        		    			   System.out.println("Enter valid order_id");
        		    		   }
        	            	if(order_id>=1) {
        	            		shop.cancel_ordered_item1();
        	            	}
       	            	    
        	            }
        	            else if(choose==2) {
        	            	System.out.println("Enter Food_id:");
        	            	if(sc1111.hasNext("[0-9]*")) {
        	            		food_id=food_id+1;
        	            		s.setCncl_food_id(sc1111.nextInt());
       		    		   }
       		    		   else {
       		    			   System.out.println("Enter valid food_id");
       		    		   }
    				        
        	            	  if(order_id>=1) {
              	            	shop.cancel_ordered_item();
              	            }       
            	            	
            	          }
        	          
        	           
						  break;
						  
			  
						  
        				}
        			        				
        				
        			default:
        				break;
        				
        			}
        		}
    	   default:
				  break;
     		    
     		    }
    	  }
    	 
    	  
	catch(Exception e)
	 {
		System.out.println(e);
		 System.out.println("Please enter valid input!!");
		 continue;
	 }
    	 
	}
	
	
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

