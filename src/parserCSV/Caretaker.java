package parserCSV;

import java.util.*;

public class Caretaker {
    private LinkedList<Memento> stateList = new LinkedList<>();

    public Memento getMemento(){
        if (stateList.isEmpty()){
            System.out.println("stateList is empty!");
            return null;
        }
        Memento memento = stateList.getLast();
        stateList.removeLast();
        return memento;
    }

    public void saveState(Memento state){
        stateList.add(state);
//        System.out.println("we have " + stateList.size() + " memories");
    }

    public void clearMems(){
        stateList.clear();
        System.out.println("memories have been cleared");
    }
}
