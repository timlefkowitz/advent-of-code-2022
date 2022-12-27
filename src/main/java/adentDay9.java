import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class adentDay9 {


    static String line;

    static ArrayList<String> queue = new ArrayList<>();

    ArrayList<Integer> stack1 = new ArrayList<>();
    ArrayList<Integer> stack2 = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("inputs/input-dayNine.txt"));
        ArrayList<String> xArray = new ArrayList<String>();
        ArrayList<String> yArray = new ArrayList<String>();
        int head = 0;
        int tail = -1;
        ArrayList<Integer> space = new ArrayList<>();
        char currentMove = 'A';
        int steps = 0;

        int y = 0;
        int z = 0;
//        int movePositionU = z++;
//        int movePositionL = y--;
//        int movePositionR = y++;
//        int movePositionD = z--;
        HashMap<String, String> creates = new HashMap<String, String>();

        while ((line = br.readLine()) != null) {
            List<String> rules = Arrays.asList(line.split(" "));
//            System.out.println(rules);
            int counter = 0;
//            List<String> creates = Arrays.asList(line.split(","));
            Set<String> set = new HashSet<String>();
            TreeSet<String> tree = new TreeSet<String>();

            for (int xs = 0; xs < line.length(); xs++) {

                char currentChar = line.charAt(xs);
                if(line.charAt(xs) == ' '){
                    continue;
                }
                String currentString = String.valueOf(currentChar);
//                int currentNeedMove = Integer.parseInt(line.slice(-1));

                if (currentChar == 'U' || currentChar == 'L' || currentChar == 'R' || currentChar == 'D') {
                    currentMove = currentChar;
                }
//                int stepsConverter = Integer.parseInt(rules.get(1));
                steps = Integer.parseInt(rules.get(1));

                continue;
            }
            System.out.println("xyz= "+ head);
            System.out.println("direction= "+currentMove);
            System.out.println("how many steps = "+steps);

//            int movePositionU = z++;
//            int movePositionL = y--;
//            int movePositionR = y++;
//            int movePositionD = z--;

            if (currentMove == 'U'){
                z = steps + head;
                z = tail + head;
            }
            if (currentMove == 'L'){
                y = steps - head;
                y = tail - head;
            }
            if (currentMove == 'R'){
                y = steps + head;
                y = tail + head;
            }
            if (currentMove == 'D'){
                y = steps - head;
                y = tail - head;
            }
            System.out.println(y+"LOOK"+z);
//            System.out.println(tail+"tail");









//                for (int ys=0 ;ys<line.length() ;ys++ ){
//                    char headPositionchar = line.charAt(ys);
//                    String headPosition = String.valueOf(headPositionchar);
//
//
//                    if(headPositionchar == 'U' || headPositionchar == 'L'
//                            || headPositionchar == 'R' || headPositionchar == 'D' ||
//                            headPositionchar == ' ' || Integer.parseInt(headPosition) == 0){
//                        break;
//                        System.out.println("THIS IS The Head"+ head);
//                        System.out.println("THIS IS The Tail"+ tail);
//                        int move = Integer.parseInt(String.valueOf(ys));
//                        int currentMove = Integer.parseInt(currentString);
//                        System.out.println("We are moving"+currentMove+ " times");
//                    }


//                    int headposition = String.vcurrentString * tailPosition;
                }
//                head = currentString *;

//                xArray.add(head)



            }
        }

