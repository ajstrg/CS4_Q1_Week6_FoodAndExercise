/////// CHANGE ANY PART OF THIS CODE TO SOLVE THE PROBLEM 
  
import java.util.HashMap;
import java.util.Scanner;

public class Food {

  String name;
  int calories;

  public static HashMap<String, Food> FoodMap = new HashMap<>();
  static Scanner input = new Scanner(System.in);
  
  public Food(String n, int c){
    name = n;
    calories = c;
    FoodMap.put(n, this);
		System.out.println("New food '" + n + "' created.");
  }

  public static int answerIsFood(Food f) {
    
    int caloriesFood = 0, servings = 0, caloriesConsumed = 0;

    caloriesFood = FoodMap.get(f.name).calories;
    System.out.print("How many servings will you eat? ");
    servings = input.nextInt();
    caloriesConsumed = caloriesFood * servings;

    System.out.println("You ate " + FoodMap.get(f.name).name + " and consumed " + caloriesConsumed + " Calories.");
  
    return caloriesConsumed;
    
  }

}
