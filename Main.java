 public class Main{

	public static void main(String[] args){

    System.out.println("\n\nINITIALIZE DATA: \n");
    
		new Food("chicken", 239);
		new Food("fish", 206);
		new Exercise("walk", 300);
		new Exercise("cycle", 700);

    System.out.println("\n\nSTART WEEKLY LOG: ");
    
    Person p = new Person("Arci");
    p.startWeeklyLog();
    
	}
}
