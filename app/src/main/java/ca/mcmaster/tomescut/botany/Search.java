package ca.mcmaster.tomescut.botany;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Search extends AppCompatActivity {

    String flowerShapeResult;
    String clusterTypeResult;
    String leafShapeResult;
    String colorResult;
    String bloomTimeResult;
    String useCaseResult;
    Double sizeResult;
    String locationResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        Spinner clusterTypeSpinner = (Spinner) findViewById(R.id.clusterTypeSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.clusterTypes, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        clusterTypeSpinner.setAdapter(adapter);


        Spinner flowerShapeSpinner = (Spinner) findViewById(R.id.flowerShapeSpinner);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.flowerShape, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        flowerShapeSpinner.setAdapter(adapter2);


        Spinner leafShapeSpinner = (Spinner) findViewById(R.id.leafShapeSpinner);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.leafShape, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        leafShapeSpinner.setAdapter(adapter3);

        Spinner bloomTimeSpinner = (Spinner) findViewById(R.id.bloomTimeSpinner);
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,
                R.array.bloomTime, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        bloomTimeSpinner.setAdapter(adapter4);

        Spinner useCaseSpinner = (Spinner) findViewById(R.id.useCaseSpinner);
        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this,
                R.array.useCases, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        useCaseSpinner.setAdapter(adapter5);

        Spinner colorSpinner = (Spinner) findViewById(R.id.colorSpinner);
        ArrayAdapter<CharSequence> adapter6 = ArrayAdapter.createFromResource(this,
                R.array.color, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        colorSpinner.setAdapter(adapter6);

        flowerShapeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                if (i == 1) {
                    flowerShapeResult = "irregular";
                } else if (i == 2) {
                    flowerShapeResult = "three";
                } else if (i == 3) {
                    flowerShapeResult = "four";
                } else if (i == 4) {
                    flowerShapeResult = "five";
                } else if (i == 5) {
                    flowerShapeResult = "six";
                } else if (i == 6) {
                    flowerShapeResult = "seven";
                } else if (i == 7) {
                    flowerShapeResult = "eightOrMore";
                } else if (i == 8) {
                    flowerShapeResult = "dontKnow";
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        clusterTypeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                if (i == 1) {
                    clusterTypeResult = "individual";
                } else if (i == 2) {
                    clusterTypeResult = "elongate";
                } else if (i == 3) {
                    clusterTypeResult = "flatOrRound";
                } else if (i == 4) {
                    clusterTypeResult = "dontknow";
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        leafShapeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                if (i == 1) {
                    leafShapeResult = "smooth";
                } else if (i == 2) {
                    leafShapeResult = "toothed";
                } else if (i == 3) {
                    leafShapeResult = "lobed";
                } else if (i == 4) {
                    leafShapeResult = "thinRays";
                } else if (i == 5) {
                    leafShapeResult = "mixed";
                } else if (i == 6) {
                    leafShapeResult = "dontKnow";
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        bloomTimeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                if (i == 1) {
                    bloomTimeResult = "aprToMay";
                } else if (i == 2) {
                    bloomTimeResult = "aprToJune";
                } else if (i == 3) {
                    bloomTimeResult = "aprToNov";
                } else if (i == 4) {
                    bloomTimeResult = "mayToJuly";
                } else if (i == 5) {
                    bloomTimeResult = "juneToAug";
                } else if (i == 6) {
                    bloomTimeResult = "juneToSept";
                } else if (i == 7) {
                    bloomTimeResult = "juneToNov";
                } else if (i == 8) {
                    bloomTimeResult = "dontKnow";
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        useCaseSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                if (i == 1) {
                    useCaseResult = "medicinal";
                } else if (i == 2) {
                    useCaseResult = "edible";
                } else if (i == 3) {
                    useCaseResult = "symbolism";
                } else if (i == 4) {
                    useCaseResult = "perfume";
                } else if (i == 5) {
                    useCaseResult = "floristry";
                } else if (i == 6) {
                    useCaseResult = "dontKnow";
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        colorSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                if (i == 1) {
                    colorResult = "blue";
                } else if (i == 2) {
                    colorResult = "brown";
                } else if (i == 3) {
                    colorResult = "orange";
                } else if (i == 4) {
                    colorResult = "pink";
                } else if (i == 5) {
                    colorResult = "purple";
                } else if (i == 6) {
                    colorResult = "red";
                } else if (i == 7) {
                    colorResult = "white";
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }


}
