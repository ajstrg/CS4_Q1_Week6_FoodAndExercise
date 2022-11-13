import java.util.HashMap;
import java.util.Scanner;

public class Exercise {
	private String name;
	private int calories;
  public static HashMap<String, Exercise> ExerciseMap = new HashMap<>();
  static Scanner input = new Scanner(System.in);
	
	public Exercise(String n, int c){
		name = n;
		calories = c;
		ExerciseMap.put(n, this);
		System.out.println("New exercise '" + n + "' created.");
	}
  
	public String getName(){
		return name;
	}
  
	public int getCalories(){
		return calories;
	}

  public static int answerIsExercise(Exercise e) {
    
    int caloriesExercise = 0, hours = 0, caloriesBurned = 0;

    caloriesExercise = ExerciseMap.get(e.name).calories;
    System.out.print("How many hours will you exercise? ");
    hours = input.nextInt();
    caloriesBurned = caloriesExercise * hours;

    System.out.println("You have exercised for " + hours + " hour(s) and burned " + caloriesBurned + " Calories.");
  

    return caloriesBurned;
    
  }
}
