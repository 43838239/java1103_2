package com.pattern.decorator;
public class Subway {
    public static void main(String[] args) {
        Food food = new Bread();
        food = new Ham(food);
        food = new Tuna(food);
        food = new Tomato(food);
        food = new Olives(food);
        food = new Letture(food);
        food = new Onion(food);
                
    }
    
}
