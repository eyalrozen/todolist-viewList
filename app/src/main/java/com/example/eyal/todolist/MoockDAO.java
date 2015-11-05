package com.example.eyal.todolist;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Eyal on 11/5/2015.
 */
public class MoockDAO implements IDataAcces {
    private List<String> descriptionList;
    private List<TaskItem> taskList = new ArrayList<TaskItem>();
    private static MoockDAO instance;

    private MoockDAO() {
        descriptionList = new ArrayList<String>();
    }

    public static MoockDAO getInstance() {
        if (instance == null)
            instance = new MoockDAO();
        return instance;
    }

    public List<TaskItem> GetTaskList() {
        return GenerateTaskList();
    }

    private List<TaskItem> GenerateTaskList() {

        TaskItem item = new TaskItem("HomeWork");
        taskList.add(item);
        item = new TaskItem("WorkBook");
        taskList.add(item);
        item = new TaskItem("WorkOut");
        taskList.add(item);
        item = new TaskItem("Sleep");
        taskList.add(item);
        item = new TaskItem("Running");
        taskList.add(item);
        item = new TaskItem("Thinking");
        taskList.add(item);
        item = new TaskItem("Job");
        taskList.add(item);
        item = new TaskItem("Dinner");
        taskList.add(item);
        item = new TaskItem("BreakFast");
        taskList.add(item);
        item = new TaskItem("Night Walk");
        taskList.add(item);
        item = new TaskItem("Football");
        taskList.add(item);


        return taskList;
    }



}
