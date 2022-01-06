package Programs2.ToDoListApp;

import java.util.ArrayList; //imports ArrayList

//superClass
public class ToDoList extends Task  {
    //Data Fields
    public static ArrayList<Task> taskList = new ArrayList<Task>();
    //public static ArrayList<Task> backupTaskList = new ArrayList<Task>(taskList);

    //No-arg constructor
    ToDoList() {}

    //Getter
    public static ArrayList<Task> getTaskList() {
        return taskList;
    }




    //addTask
    public void addTask(Task newTask) {
        taskList.add(newTask);
    }



    //remove
    public void removeTask(int taskID) {
        int index = findTaskID(taskID); //int index = taskList.indexOf(taskID); //int index = findTaskID(taskID);
        if(index >= 0) {
            taskList.remove(index);
            System.out.println("Task with ID: "+ taskID + " is removed.");
        }
        else{
            System.out.println("Task with ID: "+ taskID +" is not found in the To-do List");
        }
    }



    //print
    // method prints products using toString method
    public static void listTasks(ArrayList<Task> taskList) {
        System.out.println("There are "+ taskList.size() +" tasks in the Todo List: ");
        for (Task t : taskList)
            System.out.println(t);
    }

    public void listTasks(){
        System.out.println("There are "+ taskList.size() +" tasks in the Todo List: ");
        for (Task t : taskList)
            System.out.println(t);
    }




    //search with keyword and display
    public void search(String keyword){
        System.out.println("Search results for the keyword: "+ keyword);
        ArrayList<Task> foundList = new ArrayList<>(); //creating a new ArrayList for found tasks
        for (Task t : taskList)
            if (t.getExplanation().contains(keyword)) //adding new tasks to foundList if they contain the keyword
                foundList.add(t);

        if (foundList.size() > 0) {
            for (Task t : foundList) { //printing foundList
                System.out.println(t);
            }
            System.out.println("Found " + foundList.size() + " tasks in the To-do List.");
        }
        else{ //when foundList is empty
            System.out.println("A task contains '"+ keyword +"' is not found in the To-do List!");
        }
    }



    //search
    //finds with TaskID
    private int findTaskID(int taskID) { //input integer taskID
        for (Task t : taskList){
            if (t.getTaskID() == taskID)
                return taskList.indexOf(t); //returns index
        }
        return -1;
         /*
        for(int i=0; i<taskList.size(); i++) {
            Task t = taskList.get(i);
            if(t.getTaskID() == taskID)
                return i; //return index
        }
        return -1;
        */
    }


    //find with keyword
    private int findTask(String keyword){
        for(int i=0; i<taskList.size(); i++) {
            Task t = taskList.get(i);
            if(t.getExplanation().contains(keyword)) { //t.getExplanation().equals(keyword) for exact sentence
                return i; //return integer
            }
        }
        return -1; //returns integer
    }

    //find with Task class
    public int findTask(Task t) { //input object
        return taskList.indexOf(t); //returns object's index
    }

/*
    //query Task
    public String queryTask(Task t) { //input object
        if(findTask(t) >=0) {
            return t.getExplanation(); //returns explanation
        }
        return null;
    }


    //query keyword
    public Task queryTask(String word) { //input String
        int index = findTask(word);
        if(index >=0) {
            return taskList.get(index); //returns object
        }
        return null;
    }

*/













/*


 */






///////////////////////
    //public void addCourse(String newCourse) { coursesTaken.add(newCourse); }

    /*
    public void Task addTask(Task newTask){
        taskList.add( new this.Task() );

        //list.add( new Student(“Robert”,22) ); // add student Robert
        //
    }
    *////////////////////////////////
    /*

    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if(position >= 0) {
            modifyGroceryItem(position, newItem);
        }

    }
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if(position >=0) {
            return true;
        }

        return false;
    }
}

     */


}
