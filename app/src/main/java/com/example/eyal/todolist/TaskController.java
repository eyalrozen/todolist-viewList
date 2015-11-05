package com.example.eyal.todolist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eyal on 11/5/2015.
 */
public class TaskController implements ITaskController {
    private IDataAcces dao;
    private List<String> descriptionList;
    TaskController()
    {
        descriptionList = new ArrayList<String>();
        dao = MoockDAO.getInstance();
    }
    public List<TaskItem> GetTaskList() {
        return dao.GetTaskList();
    }

}
