public class RouteBetweenNodes {
    public boolean routeBetweenNodes(GraphNode a, GraphNode b) {
        if (a.val == b.val) return true;
        a.visited = true;
        // we can implement a depth first search
        for (GraphNode neighbor: a.neighbors) {
            if (!neighbor.visited) {
                return routeBetweenNodes(neighbor, b);
            }
        }

        return false;
    }
}
