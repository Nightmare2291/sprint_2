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
        System.out.printf("Общая сумма без скидки: %.2f", cart.getTotalPrice());
        System.out.printf("%nОбщая сумма со скидкой: %.2f", cart.getTotalPriceWithDiscount());
        System.out.printf("%nСумма вегетарианских продуктов без скидки: %.2f", cart.getTotalVegetarianPrice());
    }
}