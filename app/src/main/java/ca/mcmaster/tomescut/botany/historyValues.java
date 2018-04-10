package ca.mcmaster.tomescut.botany;

import java.util.ArrayList;
import java.util.List;

public class historyValues {
    public List<String> history = new ArrayList<String>();

    public List<String> getHistory(){
        return history;
    }

    public void addValue(String value){
        history.add(value);
    }
}
