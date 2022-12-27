import jakarta.persistence.criteria.CriteriaBuilder;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;

public class dayThree {

    public static void main(String[] args) throws Exception {


       int a = 1;
       int A = 27;
       int b = 2;
       int B = 28;
       int c = 3;
       int C = 29;
       int d = 4;
       int D = 30;
       int e = 5;
       int E = 31;
       int f = 6;
       int F = 32;
       int g = 7;
       int G = 33;
       int h = 8;
       int H = 34;
       int i = 9;
       int I = 35;
       int j = 10;
       int J = 36;
       int k = 11;
       int K = 37;
       int l = 12;
       int L = 38;
       int m = 13;
       int M = 39;
       int n = 14;
       int N = 40;
       int o = 15;
       int O = 41;
       int p = 16;
       int P = 42;
       int q = 17;
       int Q = 43;
       int r = 18;
       int R = 44;
       int s = 19;
       int S = 45;
       int t = 20;
       int T = 46;
       int u = 21;
       int U = 47;
       int v = 22;
       int V = 48;
       int w = 23;
       int W = 49;
       int x = 24;
       int X = 50;
       int y = 25;
       int Y = 51;
       int z = 26;
       int Z = 52;






        BufferedReader br = new BufferedReader(new FileReader("inputs/input-dayThree.txt"));
//        String[] compartmentOne;
//        String[] compartmentTwo;
        String line;
        ArrayList<Integer> queue = new ArrayList<Integer>();
        ArrayList<String> noMatchQueue = new ArrayList<String>();
//

        while ((line = br.readLine()) != null) {

//            String lineSplitOne = String.valueOf(line.split(String.valueOf(line.length())));
//            System.out.println(lineSplitOne);
            int lineLength = line.length();
//            System.out.println(lineLength);
            int lengthBy50 = lineLength /2;
//            System.out.println(lengthBy50);
            String firstPart = line.substring(0, lengthBy50);
            String end = line.substring(lengthBy50, line.length());
//            System.out.println("This is from the same line ="+ line +"\n" +firstPart + "\n" +
//                    end+"\n^Compairing\n "+ "line has " + lineLength +" characters\n" + "divide by 2 = "+ lengthBy50);
            boolean noMatch = true;


//            Set<Integer> set = new HashSet<>();


//            A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
            boolean flag = true;
            for (int iI = 0; iI < firstPart.length(); iI++) {
                if(flag == false){
                    break;
                }
//                System.out.println("first part char is " + firstPart.charAt(i));
//                System.out.println("second part char is "+ end.charAt(i));
                char xI = firstPart.charAt(iI);
//                String xToString = String.valueOf(xI);
                String xToString = "" + xI;
//                System.out.println(queue);


                for (int js = 0; js < end.length(); js++) {
                    if(flag == false){
                        break;
                    }
                    char yX = end.charAt(js);
//                    String yToString = String.valueOf(yX);
                    String yToString = "" + yX;

                    if (yToString.equals(xToString)) {
//                        System.out.printf("%1$-8s %2$-10s %3$s\n", "Decimal", "ASCII", "Hex");
//                        // use for loop to print all possible ASCII values
//                        // set value for min and max ASCII values
//                        int min = 0;
//                        int max = 128;
//
////                        for (int io = min; io < max; io++) {
////                            // convert each value into character
////                            char ch = (char) io;
////                            String display = "";
////                            // check whether character is whitespace or not
////                            if (Character.isWhitespace(ch)) {
////                                // using switch statement
////                                switch (ch) {
////                                    case '\r':
////                                        display = "\\r";
////                                        break;
////
////                                }
////                            } else if (Character.isISOControl(ch)) {
////                                // showing control chars
////                                display = "control";
////                            } else {
////                                // showing others chars
////                                display = Character.toString(ch);
////                            }
////                            System.out.printf("%1$-8d %2$-10s %3$s\n", i, display, Integer.toHexString(i));
////                        }

//                        switch(xToString){
//                            case 1: "a" = String.valueOf(a);
//                                    break;
//
//                        }
//                        flag = false;
//
//                        switch (xToString) {
//                            case "a":
//                                queue.add(a);
//                                flag=false;
//                                break;
//                            case 'b':
//                                queue.add(b);
//                                flag=false;
//                                break;
//                            case 'c':
//                                queue.add(c);
//                                flag=false;
//                                break;
//                            case 'd':
//                                queue.add(d);
//                                flag=false;
//                                break;
//                            case 'e':
//                                queue.add(e);
//                                flag=false;
//                                break;
//                            case 'f':
//                                queue.add(f);
//                                flag=false;
//                                break;
//                            case 'g':
//                                queue.add(g);
//                                flag=false;
//                                break;
//                            case 'h':
//                                queue.add(h);
//                                flag=false;
//                                break;
//                            case 'i':
//                                queue.add(i);
//                                flag=false;
//                                break;
//                            case 'j':
//                                queue.add(j);
//                                flag=false;
//                                break;
//                            case 'J':
//                                queue.add(J);
//                                flag=false;
//                                break;
//                            case 'k':
//                                queue.add(k);
//                                flag=false;
//                                break;
//                            case 'K':
//                                queue.add(K);
//                                flag=false;
//                                break;
//                            case 'l':
//                                queue.add(l);
//                                flag=false;
//                                break;
//                            case 'L':
//                                queue.add(L);
//                                flag=false;
//                                break;
//                            case 'm':
//                                queue.add(m);
//                                flag=false;
//                                break;
//                            case 'M':
//                                queue.add(M);
//                                flag=false;
//                                break;
//                            case 'n':
//                                queue.add(n);
//                                flag=false;
//                                break;
//                            case 'N':
//                                queue.add(N);
//                                flag=false;
//                                break;
//                            case 'o':
//                                queue.add(o);
//                                flag=false;
//                                break;
//                            case 'O':
//                                queue.add(O);
//                                flag=false;
//                                break;
//                            case 'p':
//                                queue.add(p);
//                                flag=false;
//                                break;
//                            case 'P':
//                                queue.add(P);
//                                flag=false;
//                                break;
//                            case 'q':
//                                queue.add(q);
//                                flag=false;
//                                break;
//                            case 'Q':
//                                queue.add(Q);
//                                flag=false;
//                                break;
//                            case 'r':
//                                queue.add(r);
//                                flag=false;
//                                break;
//                            case 'R':
//                                queue.add(R);
//                                flag=false;
//                                break;
//                            case 's':
//                                queue.add(s);
//                                flag=false;
//                                break;
//                            case 'S':
//                                queue.add(S);
//                                flag=false;
//                                break;
//                            case 't':
//                                queue.add(T);
//                                flag=false;
//                                break;
//                            case 'T':
//                                queue.add(T);
//                                flag=false;
//                                break;
//                            case 'u':
//                                queue.add(u);
//                                flag=false;
//                                break;
//                            case 'U':
//                                queue.add(U);
//                                flag=false;
//                                break;
//                            case 'v':
//                                queue.add(v);
//                                flag=false;
//                                break;
//                            case 'V':
//                                queue.add(V);
//                                flag=false;
//                                break;
//                            case 'w':
//                                queue.add(w);
//                                flag=false;
//                                break;
//                            case 'W':
//                                queue.add(W);
//                                flag=false;
//                                break;
//                            case 'x':
//                                queue.add(x);
//                                flag=false;
//                                break;
//                            case 'X':
//                                queue.add(X);
//                                flag=false;
//                                break;
//                            case 'y':
//                                queue.add(y);
//                                flag=false;
//                                break;
//                            case 'Y':
//                                queue.add(Y);
//                                flag=false;
//                                break;
//                            case 'z':
//                                queue.add(z);
//                                flag=false;
//                                break;
//                            case 'Z':
//                                queue.add(Z);
//                                flag=false;
//                                break;


                        if (xToString.equals("a")) {
                            queue.add(a);
                            System.out.println(line +" [[[[ "+ xToString);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("b")) {
                            System.out.println(line +" [[[[ "+ xToString);
                            queue.add(b);
//
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("c")) {
                            System.out.println(line +" [[[[ "+ xToString);
                            queue.add(c);
//
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("d")) {
                            System.out.println(line +" [[[[ "+ xToString);
                            queue.add(d);
//
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("e")) {
                            System.out.println(line +" [[[[ "+ xToString);
                            queue.add(e);
//
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("f")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(f);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("g")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(g);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("h")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(h);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("i")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(i);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("j")) {
                            System.out.println(line +" [[[[ "+ xToString);
                            queue.add(j);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("k")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(k);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("l")) {
                            System.out.println(line +" [[[[ "+ xToString);
                            queue.add(l);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("m")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(m);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("n")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(n);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("o")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(o);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("p")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(p);
                            flag=false;
                            noMatch =false;
                            break;
                        }

                        if (xToString.equals("q")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(q);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("r")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(r);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("s")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(s);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("t")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(t);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("u")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(u);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("v")) {
                            System.out.println(line +" [[[[ "+ xToString);
                            queue.add(v);
                            flag=false;
                            break;
                        }
                        if (xToString.equals("w")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(w);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("x")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(x);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("y")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(y);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("z")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(z);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("A")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(A);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("B")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(B);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("C")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(C);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("D")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(D);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("E")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(E);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("F")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(F);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("G")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(G);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("H")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(H);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("I")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(I);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("J")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(J);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("K")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(K);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("L")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(L);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("M")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(M);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("N")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(N);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("O")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(O);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("P")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(P);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("Q")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(Q);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("R")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(R);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("S")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(S);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("T")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(T);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("U")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(U);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("V")) {
                            System.out.println(line +" [[[[ "+ xToString);
                            queue.add(V);
                            flag=false;
                            break;
                        }
                        if (xToString.equals("W")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(W);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("X")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(X);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("Y")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(Y);
                            flag=false;
                            noMatch =false;
                            break;
                        }
                        if (xToString.equals("Z")) {
                            System.out.println(line +" [[[[ "+ xToString);
//

                            queue.add(Z);
                            noMatch =false;
                            flag=false;
                            break;
                        }
                        if(noMatch == true){
                            noMatchQueue.add(line);
                            noMatch=false;
//                        System.out.println(queue + "is anything in our queue");
                    }

                    }


//                    System.out.println(queue + "is anything in our queue");
                }

//                System.out.println(queue + "is anything in our queue");
            }
//            queue.addAll(set);
//            System.out.println(set + "anything in our set?");
//            System.out.println(queue + "is anything in our queue");
        }
        System.out.println(queue + "our queue");
        long intSum = queue.stream()
                .mapToLong(Integer::longValue)
                .sum();
//        System.out.println(intSum);
        System.out.println("how many lines = "+ queue.size());
        System.out.println("Our total: "+intSum+" !!!");

        Set<Integer> set = new HashSet<>(queue);
        int sumset = set.stream().mapToInt(Integer::intValue).sum();
//        System.out.println(set + " Look here");
//        System.out.println("Our total: "+sumset+" !!!");

//        Set<String> NoMatchSet = new HashSet<>(noMatchQueue);
//        System.out.println(NoMatchSet +" look no match ");
//        for(int xc =0;xc<queue.size();xc++ ){
//            sum + xc
//            System.out.println(sum);
//        }
//        for(Double d : m)
//            sum += d;
    }}

