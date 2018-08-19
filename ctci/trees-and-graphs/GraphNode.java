import java.util.*;

public class GraphNode {
    public int val;
    public ArrayList<GraphNode> neighbors;
    public boolean visited;
    public GraphNode(int val) {
        this.val = val;
        this.visited = false;
    }
}
