package Programs2.ToDoListApp;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        ToDoList l = new ToDoList();
        Scanner input = new Scanner(System.in);
        int select, priority; //to save input
        boolean isContinue = true; //flag
        String explanation; ////to save input

        //example tasks added
        l.addTask(Task.createTask(3,"Submit this assignment to moodle."));
        l.addTask(Task.createTask(1,"Buy tickets for Amadeus the play."));
        l.addTask(Task.createTask(1,"Buy tickets for flight to Bodrum."));
        l.addTask(Task.createTask(1,"Clean your room."));
        l.addTask(Task.createTask(2,"Make reservation for the weekend."));


        while(isContinue) {
            System.out.println();
            System.out.println();
            System.out.print("ToDo List Operations:\n" + //menu list for user
                    "1: List tasks.\n" +
                    "2: Add a new task.\n" +
                    "3: Delete a task.\n" +
                    "4: Search tasks.\n" +
                    "0: Exit.\n" +
                    "Please enter your choice: ");
            select = input.nextInt();
            input.nextLine();

            switch (select){
                case 0: //exit
                    System.out.println();
                    System.out.println("Bye.");
                    isContinue = false;
                    break;

                case 1: //show all tasks
                    System.out.println();
                    l.listTasks();
                    break;

                case 2: //add a new task
                    System.out.println();
                    System.out.print("Add a new task:\nEnter task priority (1: Low, 2: Medium, 3:High): ");
                    priority = input.nextInt();
                    System.out.print("Enter task description: ");
                    input.nextLine(); //explanation = input.nextLine();
                    explanation = input.nextLine();
                    Task newTask = Task.createTask(priority,explanation);
                    l.addTask(newTask);
                    System.out.println("Task added to the To-do List.");
                    break;

                case 3: //delete a task
                    System.out.println();
                    System.out.print("Delete a task:\nEnter a Task ID to be deleted: ");
                    int iD = input.nextInt();
                    l.removeTask(iD);
                    break;

                case 4: //search from tasks
                    System.out.println();
                    System.out.print("Enter the search keyword: ");
                    String word = input.nextLine();
                    l.search(word);
                    break;

                default:
                    System.out.println();
                    System.out.print("Your selection must be 1, 2, 3, 4 or 0!");


            }
        }





    }
}



/*
import java.util.ArrayList;
import java.util.Scanner;

public class Task {
	private String description;
	private String dueDate;

	public Task(String descrip, String due){
		this.description = descrip;
		this.dueDate = due;
	}





	public static void main(String[] args) {
		String Date, whatToDo;
		String userChoiceStr, removeTaskStr;
		int userChoice, removeTask;
		ArrayList<Task> taskList = new ArrayList<Task>();
        Scanner user_input = new Scanner(System.in);





        do
        {
        	System.out.print("What would you like to do?\n");
        	System.out.print("1. Add task\n");
        	System.out.print("2. View all tasks\n");
        	System.out.print("3. Remove task\n");
        	System.out.print("4. Terminate\n");

        	userChoiceStr = user_input.nextLine();
        	userChoice = Integer.parseInt(userChoiceStr);


        	switch(userChoice){
        	case 1:
        		System.out.println("When is it due?");
        		Date = user_input.nextLine();
        		System.out.println("What do you have to do?");
        		whatToDo = user_input.nextLine();
        		taskList.add(new Task(whatToDo, Date));
        		System.out.println("Okay, Its been added to the list!\n");
        		break;

        	case 2:
        		for(Task task : taskList){
        			System.out.println("Due on:" + task.dueDate);
        			System.out.println("To Do:" + task.description);
        			System.out.println("\n");
        			}
        		break;

        	case 3:
        		System.out.println("Enter the task number you want to remove.\n");
        		removeTaskStr = user_input.nextLine();
        		removeTask = Integer.parseInt(removeTaskStr);
        		taskList.remove((removeTask-1));
        		System.out.println("Ok it's been removed!");
        		break;

        	case 4:
        		userChoice = -1;
        		user_input.close();
        		break;

        	default:
        		System.out.println("Invalid input! Try again");
        		break;
        		}

        }
        while(userChoice != -1);

	}


}
 */