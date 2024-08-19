import java.util.*;

class Node implements Comparable<Node> {
    public final String name;
    public List<Edge> edges = new ArrayList<>();
    public int minDistance = Integer.MAX_VALUE;
    public Node previous;

    public Node(String name) {
        this.name = name;
    }

    public int compareTo(Node other) {
        return Integer.compare(minDistance, other.minDistance);
    }
}

class Edge {
    public final Node target;
    public final int weight;

    public Edge(Node target, int weight) {
        this.target = target;
        this.weight = weight;
    }
}

class Graph {
    private final Map<String, Node> nodes = new HashMap<>();

    public void addNode(String name) {
        nodes.put(name, new Node(name));
    }

    public void addEdge(String sourceName, String targetName, int weight) {
        Node source = nodes.get(sourceName);
        Node target = nodes.get(targetName);
        source.edges.add(new Edge(target, weight));
    }

    public List<String> findShortestPath(String startName, String endName) {
        Node start = nodes.get(startName);
        Node end = nodes.get(endName);
        PriorityQueue<Node> queue = new PriorityQueue<>();
        start.minDistance = 0;
        queue.add(start);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current == end) break;

            for (Edge edge : current.edges) {
                Node target = edge.target;
                int distanceThroughCurrent = current.minDistance + edge.weight;
                if (distanceThroughCurrent < target.minDistance) {
                    queue.remove(target);
                    target.minDistance = distanceThroughCurrent;
                    target.previous = current;
                    queue.add(target);
                }
            }
        }

        List<String> path = new ArrayList<>();
        for (Node node = end; node != null; node = node.previous) {
            path.add(node.name);
        }
        Collections.reverse(path);
        return path;
    }
}

public class CityShortestPath {
    public static void main(String[] args) {
        Graph cityMap = new Graph();
        
        // Adding intersections (nodes)
        cityMap.addNode("A");
        cityMap.addNode("B");
        cityMap.addNode("C");
        cityMap.addNode("D");
        cityMap.addNode("E");
        
        // Adding roads (edges) with travel times (weights)
        cityMap.addEdge("A", "B", 10);
        cityMap.addEdge("A", "C", 15);
        cityMap.addEdge("B", "D", 12);
        cityMap.addEdge("C", "E", 10);
        cityMap.addEdge("B", "E", 15);
        cityMap.addEdge("D", "E", 2);

        String start = "A";
        String end = "E";
        List<String> shortestPath = cityMap.findShortestPath(start, end);

        System.out.println("Shortest path from " + start + " to " + end + ": " + shortestPath);
    }
}
