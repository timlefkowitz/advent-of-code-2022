import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class day10 {


    public static void main(String[] args) throws IOException {

//        int v = 0;


        BufferedReader br = new BufferedReader(new FileReader("inputs/day10.txt"));
        String line;

        int v = 0;
        int noop = 0;
        int addx = 0;
        int cycleCounter= 0;
        long sum = 0;
        long currentValue = 1;


        List<String> rows = new ArrayList<>();
        List<Integer> stops = new ArrayList<>();
        stops.add(20);
        stops.add(60);
        stops.add(100);
        stops.add(140);
        stops.add(180);
        stops.add(220);


        while ((line = br.readLine()) != null) {
//            rows.add(line);
//            System.out.println("This is our line " + line);

//            if(line.equals("addx")){
//
//            }

            if("noop".equals(line)){
                cycleCounter++;
                if(stops.contains(cycleCounter)){
                    sum += cycleCounter * currentValue;
                }
            }
            if(line.startsWith("addx")){
                cycleCounter++;
                if(stops.contains(cycleCounter)){
                    sum+= cycleCounter * currentValue;
                }
                cycleCounter++;
                if(stops.contains(cycleCounter)){
                    sum += cycleCounter * currentValue;
                }
                currentValue += Integer.parseInt(line.split(" ")[1]);
            }
        }
        System.out.println(sum + " this is our sum ");
    }

    }


