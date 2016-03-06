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
public class DeluxeBurger extends Burger{
    
    private String Chips;
    private String Drink;
    private final double BurgerPrice;
    
    public DeluxeBurger(String Meat, String BreadType, String Chips, String Drink) {
        super(Meat, BreadType);
        this.BurgerPrice = 13.00;
    }

    @Override
    public double getBurgerPrice() {
        System.out.println("The price of the Deluxe Burger Combo is " + this.BurgerPrice + " dollars");
        return super.getBurgerPrice(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
