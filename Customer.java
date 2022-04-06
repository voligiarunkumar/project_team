package inventory_management;

import java.util.ArrayList;

public class Customer {
private int customer_id;
private String customer_name;
private int purchase_qty;
private int item_no;
private float total_bill;
public int getPurchase_qty() {
	return purchase_qty;
}
public void setPurchase_qty(int purchase_qty) {
	this.purchase_qty = purchase_qty;
}
public int getItem_no() {
	return item_no;
}
public void setItem_no(int item_no) {
	this.item_no = item_no;
}
public float getTotal_bill() {
	return total_bill;
}
public void setTotal_bill(float total_bill) {
	this.total_bill = total_bill;
}
public int getCustomer_id() {
	return customer_id;
}
public void setCustomer_id(int customer_id) {
	this.customer_id = customer_id;
}
public String getCustomer_name() {
	return customer_name;
}
public void setCustomer_name(String customer_name) {
	this.customer_name = customer_name;
	
}
/*public void addcustomerdeatils(Customer c)
{
	this.customer_id=c.customer_id;
	this.customer_name=c.customer_name;
	this.item_no=c.item_no;
	this.purchase_qty=c.purchase_qty;
	this.total_bill=c.total_bill;
}*/
public void displaycustomer_details(ArrayList<Customer> arr) {
	   
	  for(Customer customer:arr)
	  {
		  System.out.println("i");
		  System.out.println("Customer_id:"+customer.customer_id);
		   System.out.println("Customer_name:"+customer.customer_name);
		   System.out.println("Customer_id:"+customer.item_no);
		   System.out.println("Customer_name:"+customer.total_bill);
		   System.out.println("Purchase_qty:"+customer.purchase_qty);
		   System.exit(0);
	  
}
}
}

