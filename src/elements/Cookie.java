package elements;
import visitors.Visitor;
public class Cookie implements BakeryProduct {
    private final String name;
    private final int quantity;
    private final double calories;
    private final double basePrice;

    public Cookie(String name, int quantity, double calories, double basePrise){
        this.name = name;
        this.quantity = quantity;
        this.calories = calories;
        this.basePrice = basePrise;
    }
    public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getCalories(){
        return calories;
    }
    public double getBasePrise(){
        return basePrice;
    }
    @Override
    public void accept(Visitor visitor){
        visitor.visitCookie(this);
    }
}
