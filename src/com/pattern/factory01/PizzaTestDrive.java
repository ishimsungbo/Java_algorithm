package com.pattern.factory01;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();

        Pizza pizza = nyStore.createPizza("cheese");
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println("Customer... ordered a " + pizza.getName() + "\n");
    }
}
