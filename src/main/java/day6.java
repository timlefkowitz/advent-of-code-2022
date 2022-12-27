
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class day6 {


    public static void main(String[] args) throws IOException {

        String input = """
                bvwbjplbgvbhsrlpgdmjqwftvncz
                nppdvjthqldpwncqszvftbrmjlhg
                nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg
                zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw
                """;
        BufferedReader br = new BufferedReader(new FileReader("inputs/input-daySix.txt"));
        //        String[] compartmentOne;
//        String[] compartmentTwo;
        String line;
        ArrayList<Integer> queue = new ArrayList<Integer>();
        ArrayList<String> noMatchQueue = new ArrayList<String>();


        while ((line = br.readLine()) != null) {
            String[] characters = line.split("");
            List<String> buffer = new ArrayList<>();
            char markerOne=' ';
            char markerTwo=' ';
            char markerThree=' ';
            char markerFour=' ';
            int re=0;
//            RandomSupport.AbstractSplittableWithBrineGenerator input;
//            for(String x: input.split("\n")){
//                //                String buffer = "";
//
            for(String fs: characters){
                if(buffer.size() > 13){

                    if(buffer.size() == new HashSet<>(buffer).size()){
                            break;
                        }
                        buffer.add(fs);
                        buffer.remove(0);
                    } else {
                        buffer.add(fs);
                    }
                    re++;
                }
                System.out.println(re);
            }
        }
    }
