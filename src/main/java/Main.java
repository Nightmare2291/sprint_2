import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        // Создаём продукты
        Meat meat = new Meat(5, 100);                    // 5 кг по 100 руб
        Apple redApple = new Apple(10, 50, Colour.RED);  // 10 кг красных по 50 руб
        Apple greenApple = new Apple(8, 60, Colour.GREEN); // 8 кг зелёных по 60 руб

        // Массив продуктов
        Food[] items = {meat, redApple, greenApple};

        // Корзина
        ShoppingCart cart = new ShoppingCart(items);

        // Вывод результатов
        System.out.println("Общая сумма без скидки: " + cart.getTotalPrice());
        System.out.println("Общая сумма со скидкой: " + cart.getTotalPriceWithDiscount());
        System.out.println("Сумма вегетарианских продуктов без скидки: " + cart.getTotalVegetarianPrice());
    }
}