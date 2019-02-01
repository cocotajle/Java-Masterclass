package com.timbuchalka;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe burger","Beef",3.99,"Chesse roll bread");
        super.addBurgerAdd1("Chips",2.23);
        super.addBurgerAdd2("Drink", 1.89);
    }

    @Override
    public void addBurgerAdd1(String name, double price) {
        System.out.println("Cannot not add items to Deluxe Burger");
    }

    @Override
    public void addBurgerAdd2(String name, double price) {
        System.out.println("Cannot not add items to Deluxe Burger");
    }

    @Override
    public void addBurgerAdd3(String name, double price) {
        System.out.println("Cannot not add items to Deluxe Burger");
    }

    @Override
    public void addBurgerAdd4(String name, double price) {
        System.out.println("Cannot not add items to Deluxe Burger");
    }
}
