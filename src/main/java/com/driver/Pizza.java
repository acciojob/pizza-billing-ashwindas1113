package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean extraCheeseAdded;
    private boolean extraToppingsAdded;
    private boolean paperBagAdded;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
       if(isVeg){
           price = 300;
           bill = Integer.toString(price);
       }else{
           price = 400;
           bill  = Integer.toString(price);
       }
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

        if(!extraCheeseAdded){
            this.price = 80 + price;
            this.bill = Integer.toString(price);
            extraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here


        if(!extraToppingsAdded){
            if(isVeg){
                this.price = 70 + price;
                this.bill = Integer.toString(price);
                extraToppingsAdded = true;
            }else{
                this.price = 120 + price;
                this.bill = Integer.toString(price);
                extraToppingsAdded = true;
            }
        }

    }

    public void addTakeaway(){
        // your code goes here

        if(!paperBagAdded) {
            this.price = 20 + price;
            this.bill = Integer.toString(price);
            paperBagAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        return this.bill;
    }
}
