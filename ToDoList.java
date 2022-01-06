package Programs2.ToDoListApp;

import java.util.ArrayList; //imports ArrayList

//superClass
public class ToDoList extends Task  {
    //Data Fields
    public static ArrayList<Task> taskList = new ArrayList<Task>();

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
        int index = findTaskID(taskID); //int index = taskList.indexOf(taskID);
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
    //search(keyword: String): void
    public void search(String keyword){
        int index = findTask(keyword); //int index = taskList.indexOf("keyword");
        System.out.println("Search results for the keyword: "+ keyword);
        if(index >= 0) {
            System.out.println(taskList.get(index));
        }
        else{
            System.out.println("Found 0 tasks in the To-do List");
        }
    }



    //search
    //finds with TaskID
    private int findTaskID(int taskID) { //input integer taskID
        for(int i=0; i<taskList.size(); i++) {
            Task t = taskList.get(i);
            if(t.getTaskID() == taskID) {
                return i; //return index
            }
        }
        return -1;
        /*
        for (Task t : taskList){
            if (t.getTaskID() == taskID)
                return taskList.indexOf(t);
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
                //buraya degisiklik lazim birden fazla keyword iceren tasklerden ilk cikani gosteriyor sadece
            }
        }
        return -1; //returns integer
    }


    //find with Task class
    public int findTask(Task t) { //input object
        return taskList.indexOf(t); //returns object's index
    }
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