import elements.*;
import visitors.*;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<BakeryProduct> products = new ArrayList<>();

        products.add(new Bread("White Bread", 0.5, 250, 4.0));
        products.add(new Cake("Chocolate Cake", 8, 400, 3.0));
        products.add(new Cookie("Chocolate Cookie", 5, 150, 1.0));

        Visitor nutritionVisitor = new NutritionVisitor();
        Visitor priceVisitor = new PriceVisitor();

        System.out.println("-----BAKERY MANAGEMENT-----");
        System.out.println("\n ---NUTRITION---");
        for (BakeryProduct product : products) {
            product.accept(nutritionVisitor);
        }
        System.out.println("\n ---PRICE---");
        for (BakeryProduct product : products) {
            product.accept(priceVisitor);
        }
    }
}