package Programs2.ToDoListApp;

public class Task   {
    //Data Fields
    public static int taskCounter = 0;
    public int taskID;
    public int priority;
    public String explanation;

    //No-arg constructor
    Task() {}
    //constructor
    Task(int priority,String explanation){
        this.priority = priority;
        this.explanation = explanation;
        taskID = 100 + taskCounter;
        taskCounter++; // increases the counter variable
    }
    //static constructor
    public static Task createTask(int priority,String explanation){
        return new Task(priority,explanation);
    }
    //getter methods
    public int getPriority() {
        return priority;
    }
    public String getExplanation() {
        return explanation;
    }
    public static int getTaskCounter() {
        return taskCounter;
    }
    public int getTaskID() {
        return taskID;
    }




    @Override
    public String toString() {
        return "Task " +
                "ID=" + taskID +
                ", Priority=" + priority +
                ", " + explanation ;
    }
}
