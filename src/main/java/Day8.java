import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day8 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new FileReader("inputs/day8.txt"));
        String line;
        List<String> rows = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            rows.add(line);

        }
        System.out.println(rows);
        int numberOfRows = rows.size();

        int numberOfColumns = rows.get(0).length();

        int[][] grid = new int[numberOfRows][];

        int i = 0;
        for (String row : rows) {
            grid[i] = new int[numberOfColumns];
            String[] rowArr = row.split("");
            int j = 0;
            for (String colStr : rowArr) {
                grid[i][j] = Integer.parseInt(colStr);
                j++;
            }
            i++;
        }
        int count = 0;
        for (int y = 0; y < numberOfColumns; y++) {
            for (int x = 0; x < numberOfColumns; x++) {
                count += visible(grid, x, y) ? 1 : 0;
            }
        }
        System.out.println(count);
    }

    public static final int east = 0;
    public static final int west = 1;
    public static final int north = 2;
    public static final int south = 3;

    public static int largest(int[][] grid, int x, int y, int dir) {
        switch (dir) {
            case east:
                if (x > -1) {
                    int val = largest(grid, x - 1, y, dir);
                    if (val > grid[y][x]) {
                        return val;
                    } else {
                        return grid[y][x];
                    }
                } else {
                    return -1;
                }
            case west:
                if (x < grid[0].length) {
                    int val = largest(grid, x + 1, y, dir);
                    if (val > grid[y][x]) {
                        return val;
                    } else {
                        return grid[y][x];
                    }
                } else {
                    return -1;
                }
            case north:
                if (y > -1) {
                    int val = largest(grid, x, y - 1, dir);
                    if (val > grid[y][x]) {
                        return val;
                    } else {
                        return grid[y][x];
                    }
                } else {
                    return -1;
                }
            case south:
                if (y < grid.length) {
                    int val = largest(grid, x, y + 1, dir);
                    if (val > grid[y][x]) {
                        return val;
                    } else {
                        return grid[y][x];
                    }
                } else {
                    return -1;
                }
        }
        return -1;
    }

    public static boolean visible(int[][] grid, int x, int y){
        if(largest(grid,x -1,y,east) < grid[y][x]){
            return true;
        }
        if(largest(grid,x+1,y,west) < grid[y][x] ){
            return true;
        }
        if(largest(grid,x,y-1,north) < grid[y][x]){
            return true;
        }
        if(largest(grid,x,y +1,south) < grid[y][x]){
            return true;
        }
        return false;

    }
}
