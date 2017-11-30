package parserCSV;

import java.util.ArrayList;

public class Memento {
    private final ArrayList<ArrayList<String>> state;

    public Memento(ArrayList<ArrayList<String>> state){
        ArrayList<ArrayList<String>> arrayList = new ArrayList<>();
        for(ArrayList<String> innerArray: state){
            ArrayList<String> newArray = new ArrayList<>();
            for(String s: innerArray){
                newArray.add(s);
            }
            arrayList.add(newArray);
        }
        this.state = arrayList;
    }

    public ArrayList<ArrayList<String>> getState(){
        return this.state;
    }
}
