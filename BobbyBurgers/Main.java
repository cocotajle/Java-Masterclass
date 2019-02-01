package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Hamburger hamburger = new Hamburger("Base burger ","Chcicken", 3.55,"White bread");
        double price = hamburger.itemizeBurger();
        hamburger.addBurgerAdd1("Tomato" , 0.66);
        hamburger.addBurgerAdd2("chesee", 0.98);
        hamburger.addBurgerAdd3("lettuce", 0.44);
        System.out.println("Total burger price is : " +  hamburger.itemizeBurger()+ "\n ");

        HealthyBurger healthyBurger = new HealthyBurger("Mahi Mahi", 3.66);
        healthyBurger.itemizeBurger();
        healthyBurger.addHealthyadd1(" Tahu", 0.33);
        healthyBurger.addHealthyadd2(" Double meat", 1.45);
        System.out.println("Total healthy burger price is: " + healthyBurger.itemizeBurger()+ "\n ");

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeBurger();

    }
}
