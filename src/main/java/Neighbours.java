import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Neighbours {

    private List<Integer> neighbours;

    public Neighbours(){
        this.neighbours = new ArrayList<>();
    }

    public List<Integer> getNeighbours() {
        return neighbours;
    }

    public void add(int v){
        neighbours.add(v);
    }
    public int size(){
        return neighbours.size();
    }
    public int get(int index){
        return neighbours.get(index);
    }
    public void sort(){
        Collections.sort(neighbours);
    }
    public boolean contain(int value){
        return neighbours.contains(value);
    }

}
