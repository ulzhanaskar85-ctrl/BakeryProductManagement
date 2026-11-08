package visitors;
import elements.Bread;
import elements.Cake;
import elements.Cookie;
public class NutritionVisitor implements Visitor{
    @Override
    public void visitBread(Bread bread){
        double totalCalories = bread.getCalories() * bread.getWeight() * 10;

        System.out.println(bread.getName() + ": " + String.format("%.0f", totalCalories) + " kcal");
    }
    @Override
    public void visitCake(Cake cake){
        double totalCalories = cake.getCalories() * cake.getServings();

        System.out.println(cake.getName() + ": " + String.format("%.0f", totalCalories) + " kcal");
    }
    @Override
    public void visitCookie(Cookie cookie){
        double totalCalories = cookie.getCalories() * cookie.getQuantity();

        System.out.println(cookie.getName() + ": " + String.format("%.0f", totalCalories) + " kcal");
    }
}
