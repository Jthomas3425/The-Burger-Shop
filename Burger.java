/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theburgershop;

/**
 *
 * @author Joshua Thomas
 */
public class Burger {
    private String Meat;
    private String BreadType;
    private String Topping1;
    private String Topping2;
    private String Topping3;
    private String Topping4;
    private final double BurgerPrice;
    
    public Burger(String Meat, String BreadType, String Topping1, String Topping2,String Topping3,String Topping4){
       System.out.println("You've ordered a " + Meat + " burger with " + BreadType + " with " + 
               Topping1 + " , " + Topping2 + " , " + Topping3 + " and " + Topping4 + " as your toppings.");
       BurgerPrice = 9.00;
    }
    
    public Burger(String Meat, String BreadType, String Topping1, String Topping2,String Topping3){
       System.out.println("You've ordered a " + Meat + " burger with " + BreadType + " with " + 
               Topping1 + " , " + Topping2 + " and " + Topping3 + " as your toppings.");
       BurgerPrice = 8.00;
    }
    
    public Burger(String Meat, String BreadType, String Topping1, String Topping2){
       System.out.println("You've ordered a " + Meat + " burger with " + BreadType + " with " + 
               Topping1 + " and " + Topping2 + " as your toppings.");
       BurgerPrice = 7.00;
    }
    
    public Burger(String Meat, String BreadType, String Topping1){
       System.out.println("You've ordered a " + Meat + " burger with " + BreadType + " with " + 
               Topping1 + " as your toppings.");
       BurgerPrice = 6.00;
    }
    
    public Burger(String Meat, String BreadType){
       System.out.println("You've ordered a " + Meat + " burger with " + BreadType + " and no toppings.");
       BurgerPrice = 5.00;
    }

    public double getBurgerPrice() {
        System.out.println("The cost of your burger is " + BurgerPrice + " dollars."); 
        return BurgerPrice;
    }
}

    



    
            


