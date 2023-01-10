import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class day9 {

    public static final int gridSize =20;

    public static int posHEADX =10;
    public static int posHEADY = 10;
    public static int posTAILX =10;
    public static int posTAILY = 10;
    public static int[] grid = new int[gridSize*gridSize];
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new FileReader("inputs/day9.txt"));
        String line;
        List<String> rows = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            String[] move = line.split("\n");
            move(move[0], Integer.parseInt(move[1]));
        }
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
            case "R":
                posHEADY -= 1;
                break;
            case "L":
                posHEADY += 1;
                break;
        }

        if (Math.abs(posHEADX - posTAILX) > 1){
            posTAILX += (posHEADX-posTAILX)-1;
            posTAILY = posHEADY;
            System.out.println();
        }
        if (Math.abs(posHEADY - posTAILY) > 1){
            posTAILY += (posHEADY-posTAILY)-1;
            posTAILX = posHEADX;
            System.out.println();
        }

        grid[posTAILY * gridSize + posTAILX ] +=1;
        printGrid();

        System.out.println("");





    }

    private static void printGrid() {
        for(int y =0;y<gridSize;y++){
            for(int xs=0;xs< gridSize;xs++){
                System.out.println(grid[y*gridSize+xs]);
            }
            System.out.println();
        }
    }
}
