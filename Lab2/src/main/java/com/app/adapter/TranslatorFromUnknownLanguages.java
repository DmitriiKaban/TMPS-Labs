package com.app.adapter;

public class TranslatorFromUnknownLanguages implements Person {

    private SolarPerson solarPerson;

    public TranslatorFromUnknownLanguages(SolarPerson solarPerson) {
        this.solarPerson = solarPerson;
    }

    public void speak() {
        System.out.println("I am a translator from unknown languages.");
        System.out.println("I will translate the unknown language to human language.");
        solarPerson.speakSolarLanguage();
        System.out.println("He said 'Hello! I am an alien.'");
    }
}
