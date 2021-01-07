package com.pattern.decorator;
public class Subway {
    public static void main(String[] args) {
        Food food = new Bread();
        food = new Ham(food);
        food = new Tuna(food);
        
                
    }
    
}
