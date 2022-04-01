package inventory_management;
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
		System.out.println("1.registration");
		System.out.println("2.login");
		System.out.println("3.adminlogin");
		
	}
	static  void menu()
	{
		System.out.println("1.Add New Iteam");
		System.out.println("2.Display all iteams");
		System.out.println("3.Add customer details");
		System.out.println("4.exit");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub1
		int opt;
		
	//@SuppressWarnings("unused")
    	registration();
      int opt1;
	do {
    	  @SuppressWarnings("unused")
		Registration r=new Registration();
    	  @SuppressWarnings("resource")
		Scanner se=new Scanner(System.in);
    	  opt1=se.nextInt();
    	   switch(opt1) {
    	   case 1:
    		   System.out.println("Enter username:");
    		   se=new Scanner(System.in);
    		   r.setUsername(se.nextLine());  
    		   System.out.println("enter address:");
    		   se=new Scanner(System.in);
    		   r.setAdderss(se.nextLine());
    		   System.out.println("Enter phono:");
    		   se=new Scanner(System.in);
    		   r.setPhono(se.nextLong());
    		   System.out.println("create password:");
    		   se=new Scanner(System.in);
    		  r.setCreate_password(se.nextLine());
    		  System.out.println("reenter password:");
   		        se=new Scanner(System.in);
   		       r.setReenter_password(se.nextLine());
    		   registration.add(r);
    		   r.registration_details(registration);
    		  // menu();
    		   break;
    	  case 2:
    		  login l= new login();
        	  System.out.println("enter username");
        	  @SuppressWarnings("unused") 
        	  Scanner sc1=new Scanner(System.in);
        	   l.setUsername(sc1.nextLine());
        	   l.setPassword(sc1.nextLine());
               login.add(l);
               l.login_details(login);
               //menu();
    		    break;
    		    
    	   case 3:
    		   admin_login al= new admin_login();
         	  System.out.println("enter username");
         	  @SuppressWarnings({ "unused", "resource" }) 
         	  Scanner sc11=new Scanner(System.in);
         	   al.setUsername(sc11.nextLine());
         	   al.setPassword(sc11.nextLine());
                adminlogin.add(al);
                al.adlogin_details(adminlogin);
                menu();
     		    break;
     		    }
    	     }while(opt1!=0);
	menu();
		  
		do {
			@SuppressWarnings({ "unused", "resource" }) 
			Scanner sc1= new Scanner(System.in);
		   shop s =new shop();
			opt=sc1.nextInt();
			switch(opt) {
			case 1:
				System.out.println("enter item_no");
				s.setItem_no(sc1.nextInt());
                System.out.println("enter item_name");
				sc1= new Scanner(System.in);
				s.setItem_name(sc1.nextLine());
				System.out.println("enter item_price");
				sc1=new Scanner(System.in);
				s.setItem_price(sc1.nextInt());
				//s.addnewitem(s);  
	            shopList.add(s);
				System.out.println("--------Added new items--------------");
				break;
			case 2:
				s.displayitems(shopList);
				break;
			case 3:
				customer_deatils();
				Customer c=new Customer();
				c.displaycustomer_details(custList);
				break;
			default:
				break;
				
			}
		}while(opt!=0);
}
	@SuppressWarnings("resource")
	public  static void   customer_deatils() {
		Scanner sc = new Scanner(System.in);
		Customer c=new Customer();
		System.out.println("enter customer name:");
		c.setCustomer_name(sc.nextLine()); 
		System.out.println("enter customer id:");
		c.setCustomer_id(sc.nextInt());
		System.out.println("item no:");
		c.setItem_no(sc.nextInt());
		System.out.println("total_bill:");
	  c.setTotal_bill(sc.nextInt());
		System.out.println("purcahse qty:");
		c.setPurchase_qty(sc.nextInt());
		//c.addcustomerdeatils(c);
	    custList.add(c);
	    
	     
	}

}
