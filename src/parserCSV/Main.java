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

        System.out.println("input first name");
        String firstName = myScanner.next();
        System.out.println("input last name");
        String lastName = myScanner.next();
        System.out.println("input age");
        String age = myScanner.next();

        parserCSV.setCell(yCoord, firstName, lastName, age);

        FileUtils.fileWriter(parserCSV.arrayToString());
    }
}
