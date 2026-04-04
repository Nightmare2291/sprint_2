package service;

import model.Food;
import model.Discountable;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    // Общая сумма без скидки
    public double getTotalPrice() {
        double total = 0;
        for (Food item : items) {
            total += item.getAmount() * item.getPrice();
        }
        return total;
    }

    // Общая сумма со скидкой
    public double getTotalPriceWithDiscount() {
        double total = 0;
        for (Food item : items) {
            double pricePerKg = item.getPrice();
            if (item instanceof Discountable) {
                double discountPercent = ((Discountable) item).getDiscount();
                pricePerKg *= (1 - discountPercent / 100);
            }
            total += item.getAmount() * pricePerKg;
        }
        return total;
    }

    // Сумма вегетарианских продуктов без скидки
    public double getTotalVegetarianPrice() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total += item.getAmount() * item.getPrice();
            }
        }
        return total;
    }
}