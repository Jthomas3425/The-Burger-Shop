/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theburgershop;

import java.util.ArrayList;

/**
 *
 * @author Joshua Thomas
 */
public class TheBurgerShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       DeluxeBurger DHamburger = new DeluxeBurger("beef","wheat","doritos","sprite");
       DHamburger.getBurgerPrice();
    }
    
    public ArrayList Test = new ArrayList <> ();
}
