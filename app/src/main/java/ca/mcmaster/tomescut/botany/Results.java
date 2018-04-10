package ca.mcmaster.tomescut.botany;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Results extends AppCompatActivity {
    String result;
    String x;

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
               x = readFromFile(Results.this);
                x = x + result + " (Correct)" + "  ||  ";
               writeToFile(x, Results.this);
            }
        });

        nov.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                x = readFromFile(Results.this);
                x = x + result + " (Incorrect)" + "  ||  ";
                writeToFile(x, Results.this);
            }
        });
    }

    public void sendHistory(View v){
        Intent intent = new Intent(this, History.class);
        x = readFromFile(Results.this);
        intent.putExtra("history", x);
        startActivity(intent);
    }

    public static void writeToFile(String data,Context context) {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(context.openFileOutput("text.txt", Context.MODE_PRIVATE));
            outputStreamWriter.write(data);
            outputStreamWriter.close();
        }
        catch (IOException e) {
            Log.e("Exception", "File write failed: " + e.toString());
        }
    }

    public static String readFromFile(Context context) {
        String ret = "";
        try {
            InputStream inputStream = context.openFileInput("text.txt");

            if ( inputStream != null ) {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String receiveString;
                StringBuilder stringBuilder = new StringBuilder();

                while ( (receiveString = bufferedReader.readLine()) != null ) {
                    stringBuilder.append(receiveString);
                }

                inputStream.close();
                ret = stringBuilder.toString();
            }
        }
        catch (FileNotFoundException e) {
            Log.e("login activity", "File not found: " + e.toString());
        } catch (IOException e) {
            Log.e("login activity", "Can not read file: " + e.toString());
        }
        return ret;
    }


}
