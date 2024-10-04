package com.solid.services;

import com.solid.fruits.Fruit;

public class WashingMachine {

    private FruitService fruitService;

    public WashingMachine(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    public void wash(Fruit fruit) {
        fruitService.wash(fruit);
    }
}
