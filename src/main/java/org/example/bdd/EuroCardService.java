package org.example.bdd;

public class EuroCardService {

    public boolean validate(Integer cardNumber) {
        return cardNumber == 1 || cardNumber == 1023;
    }
}
