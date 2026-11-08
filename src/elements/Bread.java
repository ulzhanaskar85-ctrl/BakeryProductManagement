package elements;
import visitors.Visitor;
public class Bread implements BakeryProduct {
    private final String name;
    private final double weight;
    private final double calories;
    private final double basePrice;

    public Bread(String name, double weight, double calories, double basePrise) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
        this.basePrice = basePrise;
    }
    public String getName(){
        return name;
    }
    public double getWeight(){
        return weight;
    }
    public double getCalories(){
        return calories;
    }
    public double getBasePrice(){
        return basePrice;
    }
    @Override
    public void accept(Visitor visitor){
        visitor.visitBread(this);
    }
}

