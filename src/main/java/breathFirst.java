import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class breathFirst<T> {
    private final Vertex<T> startVertex;

    public breathFirst(Vertex<T> startVertex) {
        this.startVertex = startVertex;
    }

    public void traverse() {
        Queue<Vertex<T>> queue = new LinkedList<>();
        queue.add(startVertex);

        while(!queue.isEmpty()){
            //towersOfHanoi
            Vertex<T> current = queue.poll();
            if(!current.isVisited()){
                current.setVisited(true);
                System.out.println(current);
                queue.addAll(current.getNeighbors());
            }
        }
    }

    public static void main(String[] args){
        Vertex<Integer> v0 = new Vertex<>(199);
        Vertex<Integer> v1 = new Vertex<>(200);
        Vertex<Integer> v2 = new Vertex<>(208);
        Vertex<Integer> v3 = new Vertex<>(210);
        Vertex<Integer> v4 = new Vertex<>(200);
        Vertex<Integer> v5 = new Vertex<>(207);
        Vertex<Integer> v6 = new Vertex<>(240);

        v0.setNeighbors(Arrays.asList(v1, v5, v6 ));
        v1.setNeighbors(Arrays.asList(v3, v4, v5));
        v4.setNeighbors(Arrays.asList(v2, v6 ));
        v6.setNeighbors(Arrays.asList(v0));



        System.out.println();

        breathFirst<Integer> bfs = new breathFirst<>(v0);
        bfs.traverse();

    }
}
