import java.util.ArrayList;

public class ToDoList extends Task {
    //Data Fields
    private static ArrayList<Task> taskList = new ArrayList<Task>();

    //No-arg constructor
    ToDoList() {
    }


    //addTask
    public void addTask(Task newTask) {
        taskList.add(newTask);
    }


    //remove
    public void removeTask(int taskID) {
        int index = -1;
        for (Task t : taskList) {
            if (t.getTaskID() == taskID)
                index = taskList.indexOf(t); //returns index
        }
        if (index >= 0) {
            taskList.remove(index);
            System.out.println("Task with ID: " + taskID + " is removed.");
        } else {
            System.out.println("Task with ID: " + taskID + " is not found in the To-do List");
        }
    }


    //print ArrayList
    // method prints products using toString method
    public void listTasks() {
        System.out.println("There are " + taskList.size() + " tasks in the Todo List: ");
        for (Task t : taskList)
            System.out.println(t);
    }


    //search with keyword and display
    public void search(String keyword) {
        System.out.println("Search results for the keyword: " + keyword);
        int counter = 0;
        for (Task t : taskList) {
            if (t.getExplanation().toLowerCase().contains(keyword.toLowerCase())) { //adding new tasks to foundList if they contain the keyword
                System.out.println(t);
                counter++;
            }
        }
        if (counter == 1) {
            System.out.println("Found one task in the To-do List.");
        }
        else if (counter > 1) {
            System.out.println("Found " + counter + " tasks in the To-do List.");
        }
        else { //when counter is 0
            System.out.println("A task contains '" + keyword + "' is not found in the To-do List!");
        }
    }



}//end of Class
