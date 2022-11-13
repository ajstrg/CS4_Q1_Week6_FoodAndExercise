
/////// CHANGE ANY PART OF THIS CODE TO SOLVE THE PROBLEM

import java.util.Scanner;

public class Person{

  String name;
  int netCalories = 0;

  static Scanner input = new Scanner(System.in);

  
  public Person(String n){
    name = n;
  }

  public void startWeeklyLog(){
    String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    String restartWeek = "no";
    
    do { 
      for (int i=0; i< days.length; i++){
        String day = days[i];
        System.out.print("\n\nIt is " + day + ". What will you do? (eat, exercise, create) ");
        String ans = input.nextLine();
  
        if (ans.equals("exercise")) {

          System.out.print("What exercise will you do? ");
          String exerciseDone = input.nextLine();

          if (Exercise.ExerciseMap.containsKey(exerciseDone)) {
            
            netCalories -= Exercise.answerIsExercise(Exercise.ExerciseMap.get(exerciseDone));
            
          } else {

            System.out.println("There is no record of the exercise '" + exerciseDone + "'.");
            
          }

        }

        else if (ans.equals("eat")) {

          System.out.print("What will you eat? ");
          String foodEaten = input.nextLine();

          if (Food.FoodMap.containsKey(foodEaten)) {

            netCalories += Food.answerIsFood(Food.FoodMap.get(foodEaten));
            
          }
          
        }

        else if (ans.equals("create")) {

          System.out.print("What will you create? (exercise, food) ");
          String newActivity = input.nextLine();

          if (newActivity.equals("exercise")){
            
            System.out.print("What is the name of the exercise? ");
            String newExercise = input.nextLine();

            System.out.print("How many Calories? ");
            int newExerciseCalories = input.nextInt();

            String filler = input.nextLine();

            new Exercise(newExercise, newExerciseCalories);
            
          }

          else if (newActivity.equals("food")){
            
            System.out.print("What is the name of the food? ");
            String newFood = input.nextLine();

            System.out.print("How many Calories? ");
            int newFoodCalories = input.nextInt();

            String filler = input.nextLine();

            new Food(newFood, newFoodCalories);
            
          }
        }
        
        }
        System.out.println("\nThis week's net calorie total is " + netCalories);
          
        System.out.print("Restart weekly log? (y/n) ");
        restartWeek = input.nextLine();

      //reset net calorie count;
      netCalories = 0;

    } while(restartWeek.equals("y"));
      
  }
}
