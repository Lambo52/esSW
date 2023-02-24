package Builder;

public class AdultMealBuilder extends MealBuilder {
    public void buildDrink(){
        System.out.println("buildDrinkAdult");
    }
    public void buildMain(){
        System.out.println("buildMainAdult");
    }
    public void buildDessert(){
        System.out.println("buildDessertAdult");
    }
    public Meal getMeal(){
        return meal;
    }
}
