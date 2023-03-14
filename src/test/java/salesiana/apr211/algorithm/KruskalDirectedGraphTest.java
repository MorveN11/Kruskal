package salesiana.apr211.algorithm;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import salesiana.apr211.graphs.DirectedGraph;
import salesiana.apr211.graphs.Graph;
import salesiana.apr211.graphs.Node;

class KruskalDirectedGraphTest {

  private static Graph<Integer> graph;

  @BeforeEach
  void setup() {
    graph = new DirectedGraph<>();
    final Node<Integer> node1 = new Node<>(1);
    final Node<Integer> node2 = new Node<>(2);
    final Node<Integer> node3 = new Node<>(3);
    final Node<Integer> node4 = new Node<>(4);
    final Node<Integer> node5 = new Node<>(5);
    final Node<Integer> node6 = new Node<>(6);
    assertTrue(graph.addEdge(3, node1, node2));
    assertTrue(graph.addEdge(5, node1, node5));
    assertTrue(graph.addEdge(2, node5, node6));
    assertTrue(graph.addEdge(7, node6, node4));
    assertTrue(graph.addEdge(9, node4, node3));
    assertTrue(graph.addEdge(5, node2, node3));
    assertTrue(graph.addEdge(6, node2, node5));
    assertTrue(graph.addEdge(3, node3, node6));
  }

  @Test
  void testKruskalAlgorithm() {
    Kruskal<Integer> kruskal = new Kruskal<>(graph);
    System.out.println(kruskal);
  }
}
