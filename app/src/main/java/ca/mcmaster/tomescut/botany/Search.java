package ca.mcmaster.tomescut.botany;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Search extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    String flowerShapeResult;
    String clusterTypeResult;
    String leafShapeResult;
    String colorResult;
    String bloomTimeResult;
    String useCaseResult;
    String locationResult;
    String sizeResult;
    String physResult = "dontKnow";
    String useResult = "dontKnow";
    String geoResult = "dontKnow";
    String forumChoice = "I don't Know";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        Spinner clusterTypeSpinner = findViewById(R.id.clusterTypeSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.clusterTypes, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        clusterTypeSpinner.setAdapter(adapter);


        Spinner flowerShapeSpinner = findViewById(R.id.flowerShapeSpinner);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.flowerShape, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        flowerShapeSpinner.setAdapter(adapter2);


        Spinner leafShapeSpinner = findViewById(R.id.leafShapeSpinner);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.leafShape, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        leafShapeSpinner.setAdapter(adapter3);

        Spinner bloomTimeSpinner = findViewById(R.id.bloomTimeSpinner);
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,
                R.array.bloomTime, android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        bloomTimeSpinner.setAdapter(adapter4);

        Spinner useCaseSpinner = findViewById(R.id.useCaseSpinner);
        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this,
                R.array.useCases, android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        useCaseSpinner.setAdapter(adapter5);

        Spinner colorSpinner = findViewById(R.id.colorSpinner);
        ArrayAdapter<CharSequence> adapter6 = ArrayAdapter.createFromResource(this,
                R.array.color, android.R.layout.simple_spinner_item);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        colorSpinner.setAdapter(adapter6);

        Spinner locationSpinner = findViewById(R.id.locationSpinner);
        ArrayAdapter<CharSequence> adapter7 = ArrayAdapter.createFromResource(this,
                R.array.location, android.R.layout.simple_spinner_item);
        adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        locationSpinner.setAdapter(adapter7);

        Spinner sizeSpinner = findViewById(R.id.sizeSpinner);
        ArrayAdapter<CharSequence> adapter8 = ArrayAdapter.createFromResource(this,
                R.array.sizes, android.R.layout.simple_spinner_item);
        adapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sizeSpinner.setAdapter(adapter8);


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

        locationSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                if (i == 1) {
                    locationResult = "na";
                } else if (i == 2) {
                    locationResult = "europe";
                } else if (i == 3) {
                    locationResult = "medi";
                } else if (i == 4) {
                    locationResult = "oceania";
                } else if (i == 5) {
                    locationResult = "asia";
                } else if (i == 6) {
                    locationResult = "africa";
                } else if (i == 7) {
                    locationResult = "worldwide";
                } else if (i == 8) {
                    locationResult = "dontKnow";
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        sizeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                if (i == 1) {
                    sizeResult = "0.1to0.5";
                } else if (i == 2) {
                    sizeResult = "0.5to2";
                } else if (i == 3) {
                    sizeResult = "2to4";
                } else if (i == 4) {
                    sizeResult = "dontKnow";
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        }


    public void sendResult(View view) {
        Intent intent = new Intent(this, Results.class);
        calculate();
        intent.putExtra(EXTRA_MESSAGE, forumChoice);
        startActivity(intent);
    }

    public void calculate(){
        calcPhys();
        calcGeo();
        calcUse();

        if (!physResult.equals("dontKnow") && useResult.equals(geoResult) && geoResult.equals(physResult)){
            forumChoice= physResult;
        }

        else if (!physResult.equals("dontKnow") && physResult.equals(geoResult)){
            forumChoice = physResult;
        }

        else if (!physResult.equals("dontKnow") && physResult.equals(useResult)){
            forumChoice = physResult;
        }

        else if (!geoResult.equals("dontKnow") && useResult.equals(geoResult)){
            forumChoice = geoResult;
        }

        else if (!physResult.equals("dontKnow")){
            forumChoice = physResult;
        }

        else if (!geoResult.equals("dontKnow")){
            forumChoice = geoResult;
        }

        else if (!useResult.equals("dontKnow")){
            forumChoice = useResult;
        }
        else {
            forumChoice = "I dont Know";
        }
    }

    public void calcPhys(){
        if (clusterTypeResult.equals("flatOrRound") && (colorResult.equals("yellow") || leafShapeResult.equals("lobed")) || (colorResult.equals("yellow") && leafShapeResult.equals("lobed"))) {
            physResult = "Asteraceae";

        }
        else if (leafShapeResult.equals("thinRays")) {
            physResult = "ButtonBush";
        }
        else if (clusterTypeResult.equals("flatOrRound") && (colorResult.equals("purple") || leafShapeResult.equals("toothed"))
                || (colorResult.equals("purple") && leafShapeResult.equals("toothed"))) {
            physResult = "Carnation";
        }
        else if (flowerShapeResult.equals("eightOrMore") && (clusterTypeResult.equals("individual") || colorResult.equals("white")
                || sizeResult.equals("0.1to0.5") || leafShapeResult.equals("smooth"))) {
            physResult = "Daisy";
        }
        else if (clusterTypeResult.equals("elongate") && (flowerShapeResult.equals("six") || sizeResult.equals("0.5to2"))) {
            physResult = "Hyacinth";
        }
        else if (flowerShapeResult.equals("five")) {
            physResult = "Lily";
        }
        else if (clusterTypeResult.equals("elongate") && (flowerShapeResult.equals("three") || sizeResult.equals("2to4"))) {
            physResult = "Orchid";
        }
        else if (leafShapeResult.equals("smooth") && (flowerShapeResult.equals("six") || (colorResult.equals("red") || colorResult.equals("white")))
                || sizeResult.equals("0.1to0.5")) {
            physResult = "Rose";
        }
        else if (clusterTypeResult.equals("individual") && flowerShapeResult.equals("three")) {
            physResult = "Trillium";
        }
        else if (clusterTypeResult.equals("individual") && leafShapeResult.equals("toothed")) {
            physResult = "Tulip";
        }

        else if (colorResult.equals("yellow") && flowerShapeResult.equals("irregular")) {
            physResult = "Yellow Iris";
        }

        else {
            physResult = "dontKnow";
        }
    }

    public void calcGeo(){
        if (bloomTimeResult.equals("juneToSept")){
            geoResult = "Button Bush";
        }

        else if (bloomTimeResult.equals("mayToJuly")){
            geoResult = "Yellow Iris";
        }

        else if (bloomTimeResult.equals("aprToMay")){
            geoResult = "Hyacinth";
        }

        else if (bloomTimeResult.equals("juneToAug") || locationResult.equals("Oceania")){
            geoResult = "Orchid";
        }

        else if (bloomTimeResult.equals("aprToNov")){
            geoResult = "Daisy";
        }

        else if (bloomTimeResult.equals("juneToNov")){
            geoResult = "Lily";
        }

        else if (locationResult.equals("worldwide")){
            geoResult = "Asteraceae";
        }

        else if (bloomTimeResult.equals("aprToJune") && locationResult.equals("asia")){
            geoResult = "Rose";
        }

        else if (bloomTimeResult.equals("aprToJune") && locationResult.equals("medi")){
            geoResult = "Carnation";
        }

        else if (bloomTimeResult.equals("aprToJune") && locationResult.equals("europe")) {
            geoResult = "Tulip";
        }

        else if (bloomTimeResult.equals("aprToJune") && locationResult.equals("na")) {
            geoResult = "Trillium";
        }
        else {
            geoResult = "dontKnow";
        }
    }

    public void calcUse(){
        if (useResult.equals("edible")){
            useResult = "Daisy";
        }

        else if (useResult.equals("perfume")){
            useResult = "Orchid";
        }

        else if (useResult.equals("floristry")){
            useResult = "Lily";
        }

        else {
            useResult = "dontKnow";
        }
    }







}
