package com.example.eyal.todolist;

/**
 * Created by Eyal on 11/5/2015.
 */
public class TaskItem {
    private String task;


    public TaskItem(String _task)
    {
        this.task = _task;
    }

    public String GetTask()
    {
        return task;
    }

}
