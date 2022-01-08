/**
 * Via numbered menu options, user lists tasks in his/her to-do list, add a new task,
 * remove a task and search for a keyword in task descriptions.
 *
 *
 * @author Ege Pekgenc,
 * @since Date: 07.01.2022
 */
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
        l.addTask(Task.createTask(2,"Do fitness training."));


        while(isContinue) {
            System.out.println();
            //menu list for user
            //used text block
            System.out.print(""" 
                    ToDo List Operations:
                    1: List tasks.
                    2: Add a new task.
                    3: Delete a task.
                    4: Search tasks.
                    0: Exit.
                    Please enter your choice:\s"""); 
            select = input.nextInt();
            input.nextLine();

            switch (select) { //enhanced switch
                case 0 -> { //exit
                    System.out.println();
                    System.out.println("Bye.");
                    isContinue = false;
                }
                case 1 -> { //show all tasks
                    System.out.println();
                    l.listTasks();
                    System.out.println();
                    System.out.println();
                }
                case 2 -> { //add a new task
                    System.out.println();
                    System.out.print("Add a new task:\nEnter task priority (1: Low, 2: Medium, 3:High): ");
                    priority = input.nextInt();
                    System.out.print("Enter task description: ");
                    input.nextLine();
                    explanation = input.nextLine();
                    Task newTask = Task.createTask(priority, explanation);
                    l.addTask(newTask);
                    System.out.println("Task added to the To-do List.");
                    System.out.println();
                    System.out.println();
                }
                case 3 -> { //delete a task
                    System.out.println();
                    System.out.print("Delete a task:\nEnter a Task ID to be deleted: ");
                    int iD = input.nextInt();
                    l.removeTask(iD);
                    System.out.println();
                    System.out.println();
                }
                case 4 -> { //search from tasks
                    System.out.println();
                    System.out.print("Enter the search keyword: ");
                    String word = input.nextLine();
                    l.search(word);
                    System.out.println();
                    System.out.println();
                }
                default -> {
                    System.out.println();
                    System.out.print("Your selection must be 1, 2, 3, 4 or 0!");
                    System.out.println();
                }
            }//end of switch
        }//end of while

    }
}
