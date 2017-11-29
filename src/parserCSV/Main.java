package parserCSV;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ParserCSV parserCSV;
    private static Caretaker caretaker;
    public static void main (String [] args){
        parserCSV = new ParserCSV(FileUtils.fileReader());
        caretaker = new Caretaker();
        //     ParserCSV parserCSV = new ParserCSV("Имя,Фамилия,Возраст\n" +
        //             "Лена,Головач,\n" +
        //             "Олег,Квач,20");

        boolean isExit = false;
        while (!isExit){
            mainMenu();
            Scanner myScanner = new Scanner(System.in);
            switch (myScanner.nextInt()){
                case 1: replaceCell(); break;
                case 2: showCells(); break;
                case 3: undo(); break;
                case 4: saveStateToFile(); break;
                case 5: isExit = true;
            }
        }
    }

    public static void replaceCell(){

        Scanner myScanner = new Scanner(System.in);
        System.out.println("input y coord");
        int yCoord = myScanner.nextInt();
        System.out.println("input x coord");
        int xCoord = myScanner.nextInt();

        System.out.println("input new cell content");
        String newCellContent = myScanner.next();

        saveState();

        parserCSV.setCell(xCoord, yCoord, newCellContent);
    }

    public static void showCells(){
        parserCSV.printArray();
    }

    private static void mainMenu(){
        for(String s: MenuUtils.mainMenu){
            System.out.println(s);
        }
    }

    private static void saveStateToFile(){
        FileUtils.fileWriter(parserCSV.arrayToString());
        caretaker.clearMems();
    }

    private static void undo(){
        parserCSV.restoreState(caretaker.getMemento().getState());
    }

    private static void saveState(){
  //      ArrayList<ArrayList<String>> arrayList = new ArrayList<>();
  //      arrayList.addAll(parserCSV.getMyArray());
        caretaker.saveState(new Memento(parserCSV.getMyArray()));
    }
}
