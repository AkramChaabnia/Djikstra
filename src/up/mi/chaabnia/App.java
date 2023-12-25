package up.mi.chaabnia;

import up.mi.chaabnia.WeightedGraph.Edge;
import up.mi.chaabnia.WeightedGraph.Graph;
import up.mi.chaabnia.WeightedGraph.Vertex;

import java.util.*;

public class App {
	private static LinkedList<Integer> Dijkstra(Graph graph, int start, int end, int numberV) {
		PriorityQueue<Vertex> to_visit = new PriorityQueue<>(numberV, Comparator.comparingDouble(v -> v.timeFromSource));

		for (int i = 0; i < numberV; i++) {
			graph.vertexlist.get(i).timeFromSource = Double.MAX_VALUE;
			to_visit.add(graph.vertexlist.get(i));
		}

		graph.vertexlist.get(start).timeFromSource = 0;

		while (!to_visit.isEmpty()) {
			Vertex min_v = to_visit.poll();
			if (min_v == null) {
				System.out.println("No minimum vertex found!");
				break;
			}

			for (Edge edge : min_v.adjacencylist) {
				int to_try = edge.destination;
				double new_dist = min_v.timeFromSource + edge.weight;

				if (new_dist < graph.vertexlist.get(to_try).timeFromSource) {
					graph.vertexlist.get(to_try).timeFromSource = new_dist;
					graph.vertexlist.get(to_try).prev = min_v;

					to_visit.remove(graph.vertexlist.get(to_try));
					to_visit.add(graph.vertexlist.get(to_try));
				}
			}
		}

		LinkedList<Integer> path = new LinkedList<>();
		path.addFirst(end);
		int current = end;
		while (current != start) {
			Vertex prevVertex = graph.vertexlist.get(current).prev;
			if (prevVertex != null) {
				current = prevVertex.num;
				path.addFirst(current);
			} else {
				System.out.println("No path found from start to end node.");
				break;
			}
		}
		return path;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of vertices: ");
		int numVertices = scanner.nextInt();

		Graph graph = new Graph();

		for (int i = 0; i < numVertices; i++) {
			graph.addVertex();
		}

		System.out.println("Enter the edges in the format: source destination weight");
		System.out.println("(Enter -1 to stop)");

		while (true) {
			int source = scanner.nextInt();
			if (source == -1)
				break;
			int destination = scanner.nextInt();
			double weight = scanner.nextDouble();
			graph.addEdge(source, destination, weight);
		}

		// Input for start and end nodes
		System.out.print("Enter the starting node: ");
		int startNode = scanner.nextInt();
		System.out.print("Enter the ending node: ");
		int endNode = scanner.nextInt();

		scanner.close();

		// Perform Dijkstra's algorithm with startNode and endNode
		// Call the Dijkstra method here passing your graph, startNode, and endNode
		LinkedList<Integer> shortestPath = Dijkstra(graph, startNode, endNode, graph.num_v);
		System.out.println("Shortest path from node " + startNode + " to node " + endNode + ": " + shortestPath);
	}

}
