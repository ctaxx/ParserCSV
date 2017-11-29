package parserCSV;

import java.io.*;

public class FileUtils {

    private static String INPUT_PATH = "./input.csv";
    private static String OUTPUT_PATH = "./output.csv";

    public static String fileReader(){
        File inputFile = new File(INPUT_PATH);

        StringBuilder stringBuilder = new StringBuilder();

        try {
            Reader rin = new FileReader(inputFile.getAbsoluteFile());
            int c;
            while((c = rin.read())!=-1) {
                stringBuilder.append((char) c);
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    public static void fileWriter(String s){
        File outputFile = new File(OUTPUT_PATH);

        if (!outputFile.exists()) {
            try {
                outputFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            Writer sout = new FileWriter(OUTPUT_PATH,false);
            for (int i = 0; i< s.length(); i++){
                sout.write(s.charAt(i));
            }
            sout.flush();
            sout.close();
            System.out.println("saved");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
