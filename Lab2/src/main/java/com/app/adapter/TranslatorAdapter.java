package com.app.adapter;

public class TranslatorAdapter {
    private Person person;

    public TranslatorAdapter(Person person) {
        this.person = person;
    }

    public void communicate() {
        person.speak();
    }
}


