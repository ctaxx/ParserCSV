package parserCSV;

import java.util.*;

public class Caretaker {
    private List<Memento> stateList = new LinkedList<>();

    public Memento getMemento(){
        if (stateList.isEmpty()){
            System.out.println("stateList is empty!");
            return null;

        }
        Memento memento = stateList.get(stateList.size()-1);
        stateList.remove(stateList.size()-1);
//        System.out.println("I'm gonna return a memento!");
//        System.out.println("this memento is:");
//        for(Memento mem: stateList) {
//            ParserCSV.printArray(mem.getState());
//        }
//        System.out.println("--------------");
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
