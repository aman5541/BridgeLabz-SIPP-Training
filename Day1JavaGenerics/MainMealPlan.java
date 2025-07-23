package Day1JavaGenerics;

interface MealPlan {
    void describe();
}

class VegetarianMeal implements MealPlan {
    public void describe() { System.out.println("Vegetarian Plan"); }
}

class VeganMeal implements MealPlan {
    public void describe() { System.out.println("Vegan Plan"); }
}

class KetoMeal implements MealPlan {
    public void describe() { System.out.println("Keto Plan"); }
}

class Meal<T extends MealPlan> {
    private T plan;
    public Meal(T plan) { this.plan = plan; }
    public void generate() {
        System.out.print("Generated: ");
        plan.describe();
    }
}

class MealUtil {
    public static <T extends MealPlan> void validateAndGenerate(T meal) {
        System.out.print("Validating: ");
        meal.describe();
    }
}

class MainMealPlan {
    public static void main(String[] args) {
        VegetarianMeal v = new VegetarianMeal();
        VeganMeal v2 = new VeganMeal();
        KetoMeal k = new KetoMeal();

        Meal<VegetarianMeal> meal1 = new Meal<>(v);
        Meal<VeganMeal> meal2 = new Meal<>(v2);
        Meal<KetoMeal> meal3 = new Meal<>(k);

        meal1.generate();
        meal2.generate();
        meal3.generate();

        MealUtil.validateAndGenerate(v);
        MealUtil.validateAndGenerate(v2);
        MealUtil.validateAndGenerate(k);
    }
}

