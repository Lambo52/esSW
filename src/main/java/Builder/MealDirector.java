package Builder;

public class MealDirector {
    public Meal createMeal(MealBuilder builder) {
        builder.buildDrink();
        builder.buildMain();
        builder.buildDessert();
        return builder.getMeal();
    }}
