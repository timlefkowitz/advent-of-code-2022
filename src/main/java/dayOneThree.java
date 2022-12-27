import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.*;
import java.io.*;


/**
 *
 *
 *
 *
 * */


public class dayOneThree<T> {
    private final elf<T> startElfs;

    public dayOneThree(elf<T> startElfs) {
        this.startElfs = startElfs;
    }

    public static void fatestElf(){

        String filePath = new File("").getAbsolutePath() + File.separator + "/src/main/resources/data.csv";

        try {

            BufferedReader br = new BufferedReader(new FileReader("inputs/input-dayOne.txt"));
            String line = br.readLine();
            ArrayList<Integer> elfs = new ArrayList<>();
            int totalCalories;
            int maxCaloriesSeen;
//            for (String s : line.split("\n")){
//
//            }
            Scanner x = new Scanner(new File(filePath));
            x.useDelimiter(",\n");


//            while (x.hasNext()){
//                int currentLine = Integer.parseInt(x.toString());
//                double sum = 0;
//                elfs.add(currentLine);
//                for (int i = 0; i < elfs.size(); i++)
//                    sum += elfs.get(i);
//                System.out.println(sum);
//                int totalCalories = 0;
//
//            }


                while (line != null) {
                    if((line = br.readLine()) == null){
                        break;
                    }
//                if (line.length() == 0) {
//                    break;
//                }
                    int currentLine = Integer.parseInt(line);
                    ;
                    elfs.add(currentLine);
                    double sum = 0;
                    for (int i = 0; i < elfs.size(); i++)
                        sum += elfs.get(i);
                    System.out.println(sum);
//                    int totalCalories = 0;
                    currentLine = Integer.parseInt(line);
//                System.out.println(currentLine);
//                elf<Integer> calories = new elf<>(currentLine + totalCalories);
                    System.out.println(elfs);
//                for (int i =0; i < line.length(); i++){
//                }
//                      System.out.println(line);
                    continue;
                }
                    if((line = br.readLine()) == "" ){
                        line = String.valueOf(0);
                    }


//                if (!line.isBlank()) break;
//                int x = Integer.parseInt(line);
//
//
//                System.out.println(line);

            for(int i =0; i < elfs.size(); i++){
                System.out.println(elfs.get(i));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) throws FileNotFoundException {

//        final elf<T> startElf;
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

