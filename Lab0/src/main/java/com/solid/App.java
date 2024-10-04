package com.solid;

import com.solid.fruits.*;
import com.solid.services.FruitService;
import com.solid.services.FruitServiceImpl;
import com.solid.services.WashingMachine;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main( String[] args ) {
        liskovPrinciple();
        dependencyInversionPrinciple();
    }

    private static void dependencyInversionPrinciple() {
        // Dependency Inversion Principle
        // Abstractions should not depend on details. Details should depend on abstractions.
        // In my case: WashingMachine depends on FruitService abstraction, not on FruitServiceImpl details
        FruitService fruitService = new FruitServiceImpl();
        WashingMachine washingMachine = new WashingMachine(fruitService);

        washingMachine.wash(new Apple());
        washingMachine.wash(new Coconut());
        washingMachine.wash(new Fruit());
        washingMachine.wash(new Mango());
    }

    public static void liskovPrinciple() {
        // Liskov Substitution Principle
        // If S is a subtype of T, then objects of type T may be replaced with objects of type S
        // In my case: If Apple, Mango, Coconut are subtypes of Fruit, then objects of type Fruit may be replaced with objects of type Apple, Mango, Coconut
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Apple());
        fruits.add(new Mango());
        fruits.add(new Coconut());
        fruits.add(new Fruit());

        eatSomeFruits(fruits);
    }

    public static void eatSomeFruits(List<Fruit> fruits) {
        for (Fruit fruit : fruits) {
            fruit.eat();
        }
    }
}
