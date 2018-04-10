package ca.mcmaster.tomescut.botany;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Results extends AppCompatActivity {
    //List<String> history = new ArrayList<String>();
    historyValues his = new historyValues();
    List<String> history = his.getHistory();
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        Intent intent = getIntent();
        result = intent.getStringExtra(Search.EXTRA_MESSAGE);
        TextView resultDisplayText = findViewById(R.id.resultDisplay);
        resultDisplayText.setText(result);

        Button yesv = findViewById(R.id.yesV);
        Button nov = findViewById(R.id.noV);

        yesv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                his.addValue(result + '\t' + '\t' + "Correct");
            }
        });

        nov.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                his.addValue(result + '\t' + '\t' + "Incorrect");
            }
        });
    }

    public void sendHistory(View v){
        Intent intent = new Intent(this, History.class);
        intent.putExtra("history", (Serializable) history);
        startActivity(intent);
    }


}
