package parserCSV;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){

        ParserCSV parserCSV = new ParserCSV(FileUtils.fileReader());
        //     ParserCSV parserCSV = new ParserCSV("Имя,Фамилия,Возраст\n" +
        //             "Лена,Головач,\n" +
        //             "Олег,Квач,20");
        Scanner myScanner = new Scanner(System.in);
        System.out.println("input y coord");
        int yCoord = myScanner.nextInt();
        System.out.println("input x coord");
        int xCoord = myScanner.nextInt();

        System.out.println("input new cell content");
        String newCellContent = myScanner.next();

        parserCSV.setCell(xCoord, yCoord, newCellContent);

        FileUtils.fileWriter(parserCSV.arrayToString());

        boolean isExtit = false;
        while (!isExtit){
            mainMenu();
            


        }
    }

    public static void replaceCell(){

    }

    public static void showCells(){

    }

    public static void mainMenu(){
        for(String s: MenuUtils.mainMenu){
            System.out.println(s);
        }
    }

    public static void saveState(){

    }

    public static void undo(){

    }
}
