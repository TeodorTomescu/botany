package ca.mcmaster.tomescut.botany;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class History extends AppCompatActivity {

    SharedPreferences HistorySearches;
    SharedPreferences.Editor editor;
    int index = 0; // for the test

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        // Get History from Shared Preferences
        List<String> Flowers = getHistories();

        // Display History
        ListAdapter historyListAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Flowers);
        ListView historyListView = (ListView) findViewById(R.id.historyListView);
        historyListView.setAdapter(historyListAdapter);



    }

    private List<String> getHistories() {
        // Create Shared Preferences
        HistorySearches = getSharedPreferences("History", Context.MODE_PRIVATE);
        editor = HistorySearches.edit();
        List<String> FlowersList = new ArrayList<String>();

        int i=0;

        // Get Shared Preferences
        do {
            FlowersList.add(HistorySearches.getString("name"+i,""));
        } while(!FlowersList.get(i++).equals(""));

        return FlowersList;

    }


    //TESTING HISTORY
    public void testHistory(View view) {
        HistorySearches = getSharedPreferences("History", Context.MODE_PRIVATE);
        editor = HistorySearches.edit();

        editor.putString("name"+index,"Test"+index);
        editor.apply();
        Toast.makeText(this,"Test"+ index++ +" Complete",Toast.LENGTH_LONG).show();

    }

    public void DisplayTest(View view) {
        HistorySearches = getSharedPreferences("History", Context.MODE_PRIVATE);
        editor = HistorySearches.edit();

        List<String> Flowers = new ArrayList<String>();

        for (int n = 0; n < index; n++) {
            Flowers.add(HistorySearches.getString("name"+(n-1),""));
        }


        ListAdapter historyListAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Flowers);
        ListView historyListView = (ListView) findViewById(R.id.historyListView);
        historyListView.setAdapter(historyListAdapter);
    }


}
