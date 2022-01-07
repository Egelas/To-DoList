public class Task {
    //Data Fields
    private static int taskCounter = 0;
    private int taskID;
    private int priority;
    private String explanation;

    //No-arg constructor
    Task() {}
    //constructor
    Task(int priority,String explanation){
        this.priority = priority;
        this.explanation = explanation;
        taskID = 100 + taskCounter; //ID starts with 100 and do not decrease after removing tasks
        taskCounter++; // increases the counter
    }

    //static constructor to skip creating reference
    public static Task createTask(int priority,String explanation){
        return new Task(priority,explanation);
    }

    //getter methods
    public String getExplanation() {
        return explanation;
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
