
import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class day5 {

    static String line;

    static ArrayList<String> queue = new ArrayList<>();
    static ArrayList<String> cargoHold = new ArrayList<>();

    ArrayList<String> stack1 = new ArrayList<>();
    ArrayList<Integer> stack2 = new ArrayList<>();
    ArrayList<Integer> stack3 = new ArrayList<>();

//    public HashMap<String, String> getCreates() {
//        return creates;
//    }
//    public Set<String> getSet() {
//        return set;
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("inputs/input-dayFive.txt"));
        ArrayList<String> xsArray = new ArrayList<String>();
        HashMap<Integer, String> creates = new HashMap<Integer, String>();
//        set.add(String.valueOf(creates));
        Set<String> queueSet = new HashSet<String>();

        while ((line = br.readLine()) != null) {
            if ( line.trim().length() == 0 || line ==null ||
                    line==" "){
                continue;
            }
//            System.out.println(creates);
            int counter = 1;
//            List<String> creates = Arrays.asList(line.split(","));
            Set<String> set = new HashSet<String>();
            TreeSet<String> tree = new TreeSet<String>();
            String move = line.substring(0, 3);

            if(line.contains("move")){
                String[] moveArgs = line.split(" ");
                System.out.println(moveArgs);
//                for(int ds=0;ds<;ds++){
//
//                }
            }

            for (int xs = 0; xs < line.length(); xs++) {
//                System.out.println(xs);
                String counterString = counter + "";
                char workingelementTMP = line.charAt(xs);
                String workingelement = workingelementTMP + "";
//                Pattern pat = Pattern.compile("[A-Z][^A-Z]*$");
                if (workingelement.equals("A") || workingelement.equals("B") || workingelement.equals("C") ||
                        workingelement.equals("D") || workingelement.equals("E") || workingelement.equals("F") ||
                        workingelement.equals("G") || workingelement.equals("H") || workingelement.equals("I") ||
                        workingelement.equals("J") || workingelement.equals("K") || workingelement.equals("L") ||
                        workingelement.equals("M") || workingelement.equals("N") || workingelement.equals("O") ||
                        workingelement.equals("P") || workingelement.equals("Q") || workingelement.equals("R") ||
                        workingelement.equals("S") || workingelement.equals("T") || workingelement.equals("U") ||
                        workingelement.equals("V") || workingelement.equals("W") || workingelement.equals("X") ||
                        workingelement.equals("Y") || workingelement.equals("Z")) {
//                    System.out.println(workingelement+" working element");

                    counter++;
                    creates.put(Integer.valueOf(counterString), workingelement);



                    set.add(String.valueOf(creates));
                    tree.add(counterString + workingelement);
                    queue.add(String.valueOf(creates));
//                    for(String boxes: set){
//                        if(set.add(boxes)==false){
//                            System.out.println(boxes +"our boxes ");;
//                        }
//                    }

                }

            }
//            System.out.println("here"+queue.get(queue.size() -1));
//            cargoHold.add(queue.get(queue.size() -1));
            cargoHold.add(set.toString());
//            cargoHold.removeAll(Arrays.asList("", null, " "));

            for(int wa=0;wa>cargoHold.size();wa++){
                if(cargoHold.get(wa) == null){
                    cargoHold.remove(wa);
                }
            }


            System.out.println(cargoHold+"our queue");
            System.out.println("Our cargo hold is holding  = " + cargoHold.size() + " creates ");
        }

    }
}

//
//            System.out.println("our set |" + set + "| our set");
//            System.out.println("our set size " + set.size());
//            break;

//            int n = set.size();
//            List<String> aList = new ArrayList<String>(n);
//            for (String x : set)
//                aList.add(x);
//
//            System.out.println("Created ArrayList is");
//            for (String x : aList)
//                System.out.println(x);
////            queueSet.add(set.toString());




//            System.out.println(queue+"sd");
//            if(tree.isEmpty() != true){
//                System.out.println(tree);
//                xsArray.add(String.valueOf(tree));
//                System.out.println(xsArray)

//                for(int re=0;re<set.size();re++) {
//                    String firstEle = set.stream().findFirst().get();
//                    System.out.println(firstEle+"can we work here");
//                    System.out.println(set.stream().findFirst(re)+" is this our first ");
//                    String cargoHold = (xsArray.get(re));
////                    System.out.println("minTHISpoint"+ProcessXyCords);
////                    set.add(cargoHold);
//                    String FirstElement = xsArray.get(re).split(",")[0].substring(1);
//                }
//                System.out.println(queue+"| our queue");

//                System.out.println(move+"dddddd");

//                if(line.contains("move")){
//
//                    System.out.println("Hello");
////        while ((line = br.readLine()) != null || line = br.readLine()) == null) {
//                    String[] moveArgs = line.split(" ");
//                    System.out.println(moveArgs+"LOOOK");
//                }


//                    for(int sa=0;sa<cargoHold.length();sa++){
//                        int stack = Integer.parseInt(String.valueOf(FirstElement.charAt(sa)));
//                        char label = FirstElement.charAt(sa + 1);
//                        System.out.println(stack+" stack"+" char  "+label);
////                        int stack=0;
////                        String label="";
////                        stack = FirstElement.charAt(0);
////                    }
////                    String[] cargoHOld = ProcessXyCords.split(", ");
////                    List<String> cargoHold = Process.asList(line.split(","));
//
//            }
//
//        }
//
//        }
//
//        }
//            for(int xs=0;xs<line.length();xs++) {



//                System.out.println(workingelement+" working elment");
//                String firstElement = line.substring(xs);
//                char yX = firstElement.charAt(xs);
//                System.out.println(yX +" look here");
//                for(int jx=0;jx<line.length() ;jx++){
//            System.out.println(line);
//            int lineLength = line.length();
//            System.out.println("Our Line is "+lineLength+"long");
