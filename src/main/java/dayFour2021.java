import bingo.BingoBoard;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class dayFour2021 {
        public static void main(String[] args) throws FileNotFoundException {

            try {

                BufferedReader br = new BufferedReader(new FileReader("inputs/inputsDayOne.txt"));

                List<BingoBoard> boards = new ArrayList<>();
                int lineNum = 0;
                String numbers;
//
//                for(String line : data.split("\n")){
//                    if(lineNum ==0){
//                        numbers = line;
//                    }
//                }


    } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }}