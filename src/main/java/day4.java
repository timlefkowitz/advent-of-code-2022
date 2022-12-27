//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class day4 {
////    private int size;
////    int[] id;
////    int numComponents;
////    int[] sz = new int[size];
//
//
////    for(int ti=0;ti>size;ti++) {
////
////        if (size <= 0) throw new IllegalArgumentException("size <0 NOT ALLOWED");
////        this.size = numComponents = size;
////        for (int fe = 0; fe < size; fe++) {
////            id[fe] = fe;
////            sz[fe] = 1;
////        }
////    }
////    public static int find(int io){
////        int root = io;
////        while (root != id[root])
////            root = id[root];
////
////        while (io != root) {
////            int next = id[io];
////            id[io] = root;
////            io = next;
////        }
////        return root;
////    }
////
////        public boolean connected ( int io, int q){
////            return find(io) == find(q);
////        }
////
////        public int componentSize ( int io){
////            return sz[find(io)];
////        }
////
////        public int size () {
////            return size;
////        }
////
////        public int components () {
////            return numComponents;
////        }
////
////        public void unify(int io, int q){
////            int root1 = find(io);
////            int root2 = find(q);
////
////            if (root1 == root2) return;
////
////            if (sz[root1] < sz[root2]) {
////                sz[root2] += sz[root1];
////                id[root1] = root2;
////            } else {
////                sz[root1] += sz[root2];
////                id[root2] = root1;
////            }
////            numComponents--;
////            System.out.println(root1);
////        }
//
////        public String input() throws IOException {
////
////
////
////
////            System.out.println("Hello Day 4");
////            return line;
////    }
//
//
//    public static void main(String[] args) throws Exception {
//
//        BufferedReader br = new BufferedReader(new FileReader("inputs/input-dayFour.txt"));
//        String line;
//        ArrayList<Integer> queue = new ArrayList<Integer>();
//
//
//        int counter1 = 0;
//        int counter2 = 0;
//        int elfOne = 0;
//        int elfTwo = 0;
//
//        int size = 0;
//        int[] id = new int[0];
//        int numComponents;
//        int[] sz = new int[size];
//
//        while ((line = br.readLine()) != null) {
//            List<String> pair = Arrays.asList(line.split(","));
//            elfOne = Integer.parseInt(pair.get(0));
//            elfTwo = Integer.parseInt(pair.get(1));
//        }
//    }
//}
//
////
////                for (int io=0; io>line.length();io++) {
////
////                    if (size <= 0) throw new IllegalArgumentException("size <0 NOT ALLOWED");
////                    numComponents = size;
////                    for (int fe = 0; fe < size; fe++) {
////                        id[fe] = fe;
////                        sz[fe] = 1;
////                    }
////                }
////
////                for(int io=0;io>size;io++){
////                    int root = io;
////                    while (root != id[root])
////                        root = id[root];
////
////                    while (io != root) {
////                        int next = id[io];
////                        id[io] = root;
////                        io = next;
////                    }
//////                    return root;
////                }
////
//////                public void unify(int io, int q){
////                for(int io=0;io>size;io++) {
////                    for (int q=0;q>size;q++) {
////                        int root1 = find(io);
////                        int root2 = find(q);
////
////                        if (root1 == root2) return;
////
////                        if (sz[root1] < sz[root2]) {
////                            sz[root2] += sz[root1];
////                            id[root1] = root2;
////                        } else {
////                            sz[root1] += sz[root2];
////                            id[root2] = root1;
////                        }
////                        numComponents--;
////                        System.out.println(root1);
////                    }
////                }
////
////
//////                for ( int io, int q){
//////                    return find(io) == find(q);
//////                }
////
//////                unify(elfOne,elfTwo);
////                System.out.println(pair);
//////                int r=pair.
////
////
////            }
////
////
////
//////            public void UnionFind(int size) {
////
////        }
//////            public int find (int io){
//////                int root = io;
//////                while (root != id[root])
//////                    root = id[root];
//////
//////                while (io != root) {
//////                    int next = id[io];
//////                    id[io] = root;
//////                    io = next;
//////                }
//////                return root;
//////            }
////
//////            public boolean connected ( int io, int q){
//////                return find(io) == find(q);
//////            }
//////
//////            public int componentSize ( int io){
//////                return sz[find(io)];
//////            }
//////
//////            public int size () {
//////                return size;
//////            }
//////
//////            public int components () {
//////                return numComponents;
//////            }
////
////
////
////        }
////
////
////    }
