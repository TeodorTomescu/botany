package ca.mcmaster.tomescut.botany;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class History extends AppCompatActivity {

    //List<String> history = new ArrayList<String>();
    String history;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        Intent intent = getIntent();
       //history = (ArrayList<String>) intent.getSerializableExtra("history");
        history = intent.getStringExtra("history");

        TextView resultDisplayText = findViewById(R.id.historyDisplay);
        resultDisplayText.setText(history);

        //ListView historyListView = findViewById(R.id.history);
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, history);
        //historyListView.setAdapter(adapter);


    }



}
