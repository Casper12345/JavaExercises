package exercise8;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Casper on 30/12/2016.
 */
public class TempReader {

    public static void main(String[] args) {
        String line;
        List <String> valuesRead = new ArrayList<>();
        List <Integer> valuesIntegers = new ArrayList<>();
        String filePath = System.getProperty("user.dir") + "/Day16/temp.csv";
        try {

            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            while ((line = reader.readLine()) != null){
                valuesRead = Arrays.asList(line.split(", |,"));
                valuesRead.stream().forEach(a -> valuesIntegers.add(Integer.parseInt(a)));
                System.out.println("Average line: " + valuesRead.stream().mapToInt(Integer::parseInt).average().getAsDouble());
            }

        }catch (FileNotFoundException ex ){
            ex.printStackTrace();
        } catch (IOException ex){
            ex.printStackTrace();
        }
        System.out.println();
        System.out.println("Average file: " +valuesIntegers.stream().mapToInt(Integer::intValue).average().getAsDouble());

    }


}
