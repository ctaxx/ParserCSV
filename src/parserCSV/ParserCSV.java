package parserCSV;

import java.util.ArrayList;

public class ParserCSV {

    private ArrayList<ArrayList<String>> myArray;

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

    public static void printArray(ArrayList<ArrayList<String>> array){
        for(ArrayList<String> a: array){
            for(String s: a){
                System.out.print(s + "");
            }
            System.out.println();
        }
    }

    public String arrayToString(){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < this.myArray.size(); i++){
            for(int j = 0; j < this.myArray.get(i).size(); j++){
                if (j!=0){
                    stringBuilder.append(",");
                }
                stringBuilder.append(this.myArray.get(i).get(j));
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public String getCell(int x, int y){
        return null;
    }

    public void setCell(int x, int y, String string){
        if (x < 0 || y < 0 || (y > this.myArray.size()-1) || (x > this.myArray.get(y).size()-1)){
            System.out.println("you are wrong with your coords!");
            return;
        }
        this.myArray.get(y).set(x, string);
    }

    public void restoreState(ArrayList<ArrayList<String>> array){
        if (array.equals(null)){
            System.out.println("you have nothing to restore!");
            return;
        }
        this.myArray = array;
    }

    public ArrayList<ArrayList<String>> getMyArray() {
        return myArray;
    }
}
