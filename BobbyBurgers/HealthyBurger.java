package com.timbuchalka;

import com.timbuchalka.Hamburger;

public class HealthyBurger extends Hamburger {
    private String addHealthyName1;
    private double addHealthyPrice1;

    private String addHealthyName2;
    private double addHealthyPrice2;

    public HealthyBurger( String meat, double price) {
        super("Healthy", meat, price, "Brown type rye");
       }

       public void addHealthyadd1(String name, double price){
        this.addHealthyName1 = name;
        this.addHealthyPrice1 = price;
       }
       public void addHealthyadd2(String name, double price){
        this.addHealthyName2 = name;
        this.addHealthyPrice2 = price;
       }

    @Override
    public double itemizeBurger() {
        double hamburgerPrice = super.itemizeBurger();
        if(this.addHealthyName1!= null){
            hamburgerPrice += addHealthyPrice1;
            System.out.println("Added" + addHealthyName1 + " for an extra: " + addHealthyPrice1);
        }
        if(this.addHealthyName2!= null){
            hamburgerPrice += addHealthyPrice2;
            System.out.println("Added" + addHealthyName2 + " for an extra: " + addHealthyPrice2);
        }
return hamburgerPrice;
    }
}
