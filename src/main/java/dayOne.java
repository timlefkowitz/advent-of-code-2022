import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;
import java.io.*;


/**
 *
 *
 *
 *
 * */


public class dayOne<T> {
    private final elf<T> startElfs;


    public dayOne(elf<T> startElfs) {
        this.startElfs = startElfs;
    }

    public static void fatestElf(){

        String filePath = new File("").getAbsolutePath() + File.separator + "/src/main/resources/data.csv";
        int totalcalories = 0;
        try {

            String line;
            ArrayList<Integer> elfs = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader("inputs/input-dayOne.txt"));


            while ((line = br.readLine()) != null) {
                if(line.length()>0){
                    int MaxCal = 0;
                    int currentLine = Integer.parseInt(line);
                    totalcalories = currentLine + totalcalories;
                    elfs.add(totalcalories);
                    System.out.println(elfs);
                    System.out.println(totalcalories);
                    int sum = 0;
                    for (int i = 0; i < elfs.size(); i++)
                        sum += elfs.get(i);
//                    System.out.println(sum + "sum");
                    int totalCalories = 0;
                    currentLine = Integer.parseInt(line);

//                    System.out.println(elfs);

                } else {
                    totalcalories = 0;
                    elfs.clear();
                    continue;
                }


                for(int i =0; i < elfs.size(); i++){
//                    System.out.println(elfs.get(i));
                }
            }


                } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public static void main(String[] args) throws FileNotFoundException {

        String data = """
                199
                200
                208
                210
                200
                207
                240
                269
                260
                263
                """;

        fatestElf();

    }
}

