package inventory_management;

import java.util.Scanner;

public class Food_OrderingSystem {
    
    public static Scanner input = new Scanner(System.in);
    public static String more;
    public static int choose,quantity=1;
    public static double total=0,pay;
    public static void menu(){
    	System.out.println("\t\t\t\t\tONLINE FOOD ORDERING SYSTEM");
    System.out.println("\t\t\t\t+===================================+");
    System.out.println("\t\t\t\t           Menu List        ");
    System.out.println("  \t\t\t\t ITEM NAME \t\tITEM PRICE    ");
    System.out.println("\t\t\t\t   1. BURGER            200.00");
    System.out.println("\t\t\t\t   2.PIZZA              349.00");
    System.out.println("\t\t\t\t   3.WHITE SAUCE       300.00");
   // System.out.println("\t\t\t\t   4                       ");
    System.out.println("\t\t\t\t+====================================+");
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
        System.out.println("extra amount paid is"  +  total);
        System.out.println("Thank you for your order");
        System.exit(0);
    }
    }
    public static void order(){
    System.out.println("Press 1 to BURGER\nPress 2 to PIZZA\nPress 3 to WHITE SAUCE\nPress 4 to Cancel");
    System.out.print("ENTER NUMNER TO CHOOSE :");
    choose = input.nextInt();
    //conditions
    if(choose==1){
        System.out.println("You choose BURGER");
        System.out.print("How many BUGER'S you want to Buy? :");
        quantity =input.nextInt();
        total = total +(quantity*200);
        
        System.out.println("YOU WANT TO BUY ANYTHING? ");
        System.out.println("Press Y for Yes and N for N : ");
        more = input.next();
        if(more.equalsIgnoreCase("Y")){
            order();//call the method you to create 
        }
        else{
        	payment();
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
        System.exit(0);//close program
    }else{
        System.out.println("Choose 1 to 4 only!");
        order();
    }
    }
  
    }	
