import java.util.LinkedList;
import java.util.List;

public class Fifo {
    private List<Integer> queue;

    public Fifo() {
        this.queue = new LinkedList<>();
    }

    public void add(int v){
        queue.add(v);
    }

    public int getFirst(){
        return queue.get(0);
    }

    public void pop(){
        queue.remove(0);
    }
    public void print(){
        System.out.print("[");
        queue.forEach( x -> {
            System.out.print(  x  + " " ) ;
        });
        System.out.print("]");
        System.out.println();
    }

    public int getSize(){
        return queue.size();
    }
}
