package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true); // Яблоки — вегетарианские
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public double getDiscount() {
        return Colour.RED.equals(colour) ? Discount.APPLE_RED : 0.0;
    }
}
