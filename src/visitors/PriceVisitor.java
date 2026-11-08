package visitors;
import elements.Bread;
import elements.Cake;
import elements.Cookie;
public class PriceVisitor implements Visitor{
    @Override
    public void visitBread(Bread bread){
        double totalPrice = bread.getBasePrice() * bread.getWeight();

        System.out.printf("%s: $%.2f%n", bread.getName(), totalPrice);
    }
    @Override
    public void visitCake(Cake cake){
        double totalPrice = cake.getBasePrice() * cake.getServings();

        System.out.printf("%s: $%.2f%n" , cake.getName(), totalPrice);
    }
    @Override
    public void visitCookie(Cookie cookie){
        double totalPrice = cookie.getBasePrise() * cookie.getQuantity();

        System.out.printf("%s: $%.2f%n", cookie.getName(),totalPrice);
    }
}
