package com.example.eyal.todolist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class addtaskActivity extends AppCompatActivity {
    private Button createBtn;
    private EditText dscText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addtask);
        createBtn = (Button) findViewById(R.id.createBtn);
        dscText = (EditText) findViewById(R.id.description);
        createBtn.setOnClickListener(OnCreateBtnClickListener);

    }

    private View.OnClickListener OnCreateBtnClickListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            //setContentView(R.layout.addtask);
            /*if(dscText.getText().toString() !="") {
               TaskList.getInstance().AddTaskToList(dscText.getText().toString());
               */
                finish();
        }

    };

}
