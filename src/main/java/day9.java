import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class day9 {

    public static final int gridSize =1000;

    public static int posHEADX =500;
    public static int posHEADY =500;
    public static int posTAILX =500;
    public static int posTAILY =500;
    public static int[] grid = new int[gridSize*gridSize];
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new FileReader("inputs/day9.txt"));
//        String line;
        String input =" R 4\n" +
                "U 4\n" +
                "L 3\n" +
                "D 1\n" +
                "R 4\n" +
                "D 1\n" +
                "L 5\n" +
                "R 2";
        String line="";
        List<String> rows = new ArrayList<>();
        while ((line = br.readLine()) != null) {
//        for(String line : input.split("\n")){
//            System.out.println(line);
            String[] move = line.split(" ");
            move(move[0], Integer.parseInt(move[1]));
        }
//        int amount = count();

        int amount =0;
        for (int i: grid){
            if(i>0){
                amount++;
            }
        }
        System.out.println(amount);
    }
    private static void move(String dir, int amount){
        for(int i=0;i<amount;i++){
            moveAStep(dir);
        }

    }
    private static void moveAStep(String dir){
        switch(dir){
            case "U":
                posHEADY -= 1;
                break;
            case "D":
                posHEADY += 1;
                break;
            case "L":
                posHEADX -= 1;
                break;
            case "R":
                posHEADX += 1;
                break;
        }

        if (Math.abs(posHEADX - posTAILX) > 1){
            if("L".equals(dir)){
                posTAILX -= 1;
            } else {
                posTAILX += 1;
            }

            posTAILY = posHEADY;
//            System.out.println();
        }
        if (Math.abs(posHEADY - posTAILY) > 1){
            if("U".equals(dir)){
                posTAILY -= 1;
            } else {
                posTAILY += 1;
            }
            posTAILX = posHEADX;
//            System.out.println();
        }

        grid[posTAILY * gridSize + posTAILX ] +=1;
//        printGrid();

        System.out.println("");
    }

    private static void printGrid() {
        for(int y =0;y<gridSize;y++){
            for(int xs=0;xs< gridSize;xs++){
                System.out.print(grid[y * gridSize + xs]);
            }
            System.out.println();
        }
    }
}
