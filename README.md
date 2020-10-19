# Tree Search!


## DFS ( Depth First Search ) 
DFS stands for Depth First Search is a edge based technique. It uses the [Stack data structure, performs two stages, first visited vertices are pushed into stack and second if there is no vertices then visited vertices are popped.
he Time complexity of DFS is also O(V + E) when Adjacency List is used and O(V^2) when Adjacency Matrix is used, where V stands for vertices and E stands for edges.

Thanks [Wikipedia](https://pl.wikipedia.org/wiki/Przeszukiwanie_w_g%C5%82%C4%85b)
For the grat example of DFS exploring vertices order.

![enter image description here](https://upload.wikimedia.org/wikipedia/commons/5/5d/Depth-first-tree.png)
## BFS ( Breath First Search )

BFS is a vertex based technique for finding a shortest path in graph. It uses a Queue data structure which follows first in first out. In BFS, one vertex is selected at a time when it is visited and marked then its adjacent are visited and stored in the queue. It is slower than DFS.
The Time complexity of BFS is O(V + E) when Adjacency List is used and O(V^2) when Adjacency Matrix is used, where V stands for vertices and E stands for edges.
Thanks [Wikipedia](https://pl.wikipedia.org/wiki/Przeszukiwanie_w_g%C5%82%C4%85b)
For the great example of BFS vertices exploring order.
![enter image description here](https://upload.wikimedia.org/wikipedia/commons/3/33/Breadth-first-tree.svg)

In graph, there might be cycles and dis-connectivity.
I made sure that my implementation does not have them so I generate a graph by a function **generate(double density)** which is aware of loops and make sure that graph is consistent. We can now easily make use of DFS and BFS without any lost of vertices. To represent a graph I used NeighboursList. 
