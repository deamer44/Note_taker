package com.example.test.note_taker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
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

    public void  RunSocketClient(View view)
    {
        try
        {
        Socket client = new Socket("10.0.0.100",13377);
            PrintWriter out = new PrintWriter(client.getOutputStream(),true);
            EditText data = (EditText)findViewById(R.id.note_info);
            TextView t = (TextView)findViewById(R.id.hel_id);
            t.setText(data.getText());
            out.println(data.getText());

        }
        catch (IOException e )
        {

        }
    }



}
