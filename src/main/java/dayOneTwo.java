import lombok.Data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/** @ data creates getters and setters and stuff **/
@Data
public class dayOneTwo<T> {

    /**
     *
     *  instanes
     * */
    String filePath = new File("").getAbsolutePath() + java.io.File.separator + "/src/main/resources/data.csv";
//    ArrayList<T> elfs = new ArrayList<>();


    public static void elfBuilder() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("inputs/input-dayOne.txt"));
        String line;
        while ((line = br.readLine()) != null){

            List<String> list = new ArrayList<>();
            List<Integer> elfs = new ArrayList<>();
            list = br.lines().collect(Collectors.toList());
            System.out.println(list);

            int currentLine = Integer.parseInt(line);
            int totalCalories = 0 + currentLine;
            elfs.add(Integer.valueOf(line));
            double sum = 0;
            for (int i = 0; i < elfs.size(); i++){
                sum += elfs.get(i);
            }

            System.out.println(sum);
            System.out.println(elfs);

//            for(String line : list.split("\n")){
//                if(lineNum ==0){
//                    numbers = line;
//                }
//            }

        }



    }

    public static void main(String[] args) throws IOException {
        elfBuilder();

    }


}
