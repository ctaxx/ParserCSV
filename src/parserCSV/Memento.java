package parserCSV;

import java.util.ArrayList;

public class Memento {
    private final ArrayList<ArrayList<String>> state;

    public Memento(ArrayList<ArrayList<String>> state){
        ArrayList<ArrayList<String>> arrayList = new ArrayList<>();
        arrayList.addAll(state);
        this.state = arrayList;
    }

    public ArrayList<ArrayList<String>> getState(){
        return this.state;
    }
}
