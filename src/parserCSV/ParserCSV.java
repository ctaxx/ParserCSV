package parserCSV;

import java.util.ArrayList;



public class ParserCSV {

    ArrayList<ArrayList<String>> myArray;

    public ParserCSV(String s) {
        this.myArray = parse(s);
    }

    public ArrayList<ArrayList<String>> parse(String s){
        ArrayList<ArrayList<String>> yArrayList = new ArrayList<>();

        String [] arrayOfStrings = s.split("\n");

        for (int i = 0; i< arrayOfStrings.length; i++){
            String [] arrayOfColumns = arrayOfStrings[i].split(",");
            ArrayList<String> xArrayList = new ArrayList<>();


            for (int j = 0; j< arrayOfColumns.length; j++){
                xArrayList.add(arrayOfColumns[j]);
            }
            yArrayList.add(xArrayList);
        }

        return yArrayList;
    }

    public void printArray(){
        for(ArrayList<String> a: this.myArray){
            for(String s: a){
                System.out.print(s + "");
            }
            System.out.println();
        }
    }

   public String arrayToString(){
        StringBuilder stringBuilder = new StringBuilder();
        for(ArrayList<String> a: this.myArray){
            for(String s: a){
                stringBuilder.append(s);
                stringBuilder.append("");
            }
            stringBuilder.append("\n");
       }
       return stringBuilder.toString();
   }

    public String getCell(int x, int y){
        return null;
    }

    public void setCell(int y, String firstName, String lastName, String age){
        this.myArray.get(y).set(0, firstName);
        this.myArray.get(y).set(1, lastName);
        this.myArray.get(y).set(2, age);
    }
}
