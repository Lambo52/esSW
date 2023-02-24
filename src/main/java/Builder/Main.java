package Builder;

public class Main { //pure questo in other ma vabbe
    static boolean isKid = false;
    public static void main(String[] args) {
        MealDirector director = new MealDirector();
        MealBuilder builder = null;
        if (isKid) {
            builder = new KidsMealBuilder();
        }
        else{
            builder = new AdultMealBuilder();
        }
        Meal meal = director.createMeal(builder);
    }
}
