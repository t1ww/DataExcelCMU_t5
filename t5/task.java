package t5;

public class task {
    String taskID;
    String taskDesc;
    task(){
        taskID = "123456";
    }
    task(String id, String desc){
        taskID = id;
        taskDesc = desc;
    }
    public String toString(){
        String str;
        str = "task id = " + taskID + ", task: " + taskDesc;
        return str;
    }
}
