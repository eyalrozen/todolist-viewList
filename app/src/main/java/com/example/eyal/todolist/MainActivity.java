package com.example.eyal.todolist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ITaskController controller;
    private Button addBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addBtn =(Button) findViewById(R.id.add_button);
        addBtn.setOnClickListener(OnAddBtnClickListener);
        controller =  new TaskController();
        ListView lv = (ListView) findViewById(R.id.task_listView);
        if(lv!=null)
        {
            TaskListBaseAdapter adapter = new TaskListBaseAdapter(this, controller.GetTaskList());
            lv.setAdapter(adapter);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {
                    Toast.makeText(MainActivity.this, "Item number " + (position + 1) + " was clicked", Toast.LENGTH_LONG).show();
                }
            });
        }
    }

    private View.OnClickListener OnAddBtnClickListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            Intent nextScreen = new Intent(getApplicationContext(), addtaskActivity.class);
            startActivity(nextScreen);
        }
    };
}
