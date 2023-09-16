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
           this.price += 300;
       }else{
           this.price += 400;
       }
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

        if(!extraCheeseAdded){
            this.price = 80 + price;
            extraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here


        if(!extraToppingsAdded){
            if(isVeg){
                this.price = 70 + price;
                extraToppingsAdded = true;
            }else{
                this.price = 120 + price;
                extraToppingsAdded = true;
            }
        }

    }

    public void addTakeaway(){
        // your code goes here

        if(!paperBagAdded) {
            this.price = 20 + price;
            paperBagAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isVeg){
            bill =  "Base Price Of The Pizza: 300\n";
        }else{
            bill = "Base Price Of The Pizza: 400\n";
        }

        if(extraCheeseAdded){
            bill = bill + "Extra Cheese Added: 80\n";
        }

        if(extraToppingsAdded){
            if(isVeg){
                bill = bill + "Extra Toppings Added: 70\n";
            }else{
                bill = bill + "Extra Toppings Added: 120\n";
            }
        }

        if(paperBagAdded){
            bill = bill + "Paperbag Added: 20\n";
        }

        String totalPrice = Integer.toString(price);
        bill = bill + "Total Price: " + totalPrice + "\n";
        return this.bill;

    }
}
