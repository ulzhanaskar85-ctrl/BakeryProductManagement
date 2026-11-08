package elements;
import visitors.Visitor;
public class Cake implements BakeryProduct{
    private final String name;
    private final int servings;
    private final double calories;
    private final double basePrice;

    public Cake(String name, int servings, double calories, double basePrise){
        this.name = name;
        this.servings = servings;
        this.calories = calories;
        this.basePrice = basePrise;
    }
    public String getName(){
        return name;
    }
    public int getServings(){
        return servings;
    }
    public double getCalories(){
        return calories;
    }
    public double getBasePrice(){
        return basePrice;
    }
    @Override
    public void accept(Visitor visitor){
        visitor.visitCake(this);
    }
}
