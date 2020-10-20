import java.util.ArrayList;
import java.util.List;

public class NeighboursList {

    List<Neighbours> neighbours ;
    int size ;

    public NeighboursList(int size) {
        this.neighbours = new ArrayList<>(size);
        this.size = size ;
        init();
    }

    private void init(){
        for (int i = 0 ; i < size ; i++){
            neighbours.add(new Neighbours()) ;
        }
    }

    public void generateGraph(double density) {
        int counter = 0;
        int max = (int) Math.floor((size * (size - 1) / 2) * density);
        for (int i = 0 ; i < size - 1; i++){
            if (counter == max ){
                break;
            }
            addEdge(i, i+1);
            counter++;
        }
        List<Integer> integers = getRandoms(max);
        int j  =0 ;
        for (int i  =0 ; i < max ; i++){
            if (counter == max){
                break;
            }
            if (!hasEdge(j , integers.get(i)) && !isLoop(j , integers.get(i))){
                addEdge(j,integers.get(i));
            }
            j++;
            if (j==size){
                j=0;
            }
        }
    }

    private boolean isLoop(int left, int right) {
        return left == right;
    }

    private boolean hasEdge(int left, int right) {
        return neighbours.get(left).contain(right) || neighbours.get(right).contain(left);
    }

    private List<Integer> getRandoms(int max) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0;  i< max ; i++){
            int random = (int) ( Math.random() * (size -1) );
            integers.add(random);
        }
        return integers;
    }

    public void addEdge(int left, int right){
        neighbours.get(left).add(right);
    }


    public void print(){
        for (int i = 0 ; i< neighbours.size() ; i++){
            System.out.print(i  +  " ->");
            for (int j = 0 ; j < neighbours.get(i).size() ; j++){
                System.out.print(  " : " + neighbours.get(i).get(j));
            }
            System.out.println();
        }
    }


    public void dfs(){
        boolean[] visited = new boolean[size +1];
        printDfs(visited,0);
    }
    private void printDfs(boolean[] visited , int v){
        visited[v] = true ;
        for (int i =0 ; i < neighbours.get(v).size() ; i++){
            int value = neighbours.get(v).get(i);
            if (!visited[value]){
                printDfs(visited , value);
            }
        }
    }

    public void bfs(){
        Fifo fifo = new Fifo();
        boolean[] visited = new boolean[size];
        int s  =  0 ;
        fifo.add(s);
        while(true){
            visited[s]=true;
            fifo.pop();

            for (int j =0 ; j < neighbours.get(s).size() ;j++){
                int value = neighbours.get(s).get(j);
                if (!visited[value ]){
                    fifo.add(value);
                    visited[value]=true;
                }
            }
            if (fifo.getSize() == 0){
                break;
            }
            s=fifo.getFirst();
        }
    }

}
