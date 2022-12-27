import java.io.*;
import java.util.ArrayList;

public class dayTwo {

    public static void rockPaperScissors() throws FileNotFoundException {


        try {
            String rock = "X";
            String paper = "Y";
            String Scissors = "Z";
            String opponentRock = "A";
            String opponentPaper = "B";
            String opponentScissors = "C";
            int totalPoints = 0;
            int myscore = 0;

            String line;
//            ArrayList<Integer> score = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader("inputs/input-dayTwo.txt"));
            while ((line = br.readLine()) != null) {

                System.out.println(line);
                char OppenentHand = line.charAt(0);
                char myHand = line.charAt(2);

                if(OppenentHand == 'B' && myHand == 'Y'){
                    myscore = myscore + 2;
                    myscore = myscore + 3;
                    System.out.println("Draw");
                }
                if(OppenentHand == 'A' && myHand == 'Y'){
//                    my Y would become X
                    myscore = myscore + 1;
                    myscore = myscore + 3;
                    System.out.println("win");
                }
                if(OppenentHand == 'C' && myHand == 'Y'){
//                    my Y becomes Z
                    myscore = myscore + 3;
                    myscore = myscore + 3;
                    System.out.println("Lose");
                }
                if(OppenentHand == 'A' && myHand == 'X'){
                    myscore = myscore + 3;
                    System.out.println("Draw");
                }
                if(OppenentHand == 'B' && myHand == 'X') {
                    myscore++;
                    System.out.println("Lose");
                }
                if(OppenentHand == 'C' && myHand == 'X'){
                    myscore = myscore + 2;
                    System.out.println("win");
                }
                if(OppenentHand == 'C' && myHand == 'Z'){
                    myscore = myscore + 1;
                    myscore = myscore + 6;
                    System.out.println("Draw");
                }
                //////////

                if(OppenentHand == 'A' && myHand == 'Z'){
                    myscore = myscore + 2;
                    myscore = myscore + 6;
                    System.out.println("Lose");
                }


                if(OppenentHand == 'B' && myHand == 'Z'){
                    myscore = myscore + 3;
                    myscore = myscore + 6;
                    System.out.println("Win");
                }

                System.out.println(" Your total is = "+myscore);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

        }
    }

//    not right 14830
    public static void main(String[] args) throws FileNotFoundException {
        rockPaperScissors();

    }


}
