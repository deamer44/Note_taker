package com.example.test.note_taker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
public class Note_taker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_taker);

    }

    public void pushInfo(View view){
        TextView t = (TextView)findViewById(R.id.hel_id);
        t.setText("this is new");

        EditText data = (EditText)findViewById(R.id.note_info);
        t.setText(data.getText());
    }



}
