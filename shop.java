package inventory_management;

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
	private int item_no;

	private String item_name;
	private int item_price;
	
	/*public void addnewitem(shop s) {
		this.item_name=s.item_name; 
		this.item_no=s.item_no;
		this .item_price=s.item_price; 
		
	} */
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
