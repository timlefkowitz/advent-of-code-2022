import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class day10 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new FileReader("inputs/day10.txt"));
        String line;
        List<String> rows = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            rows.add(line);

        }
    }

    }
