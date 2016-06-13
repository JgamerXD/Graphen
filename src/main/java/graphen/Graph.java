package graphen;
import java.util.Arrays;


public class Graph {

	
	private GraphNode[] graphNodes;
	private double[][] edges;
	
	private int maxAnzahl,anzahl;
	public static final double NO_CONNECTION = Double.POSITIVE_INFINITY;
	
	public Graph(int size){
		maxAnzahl = size;
		anzahl=0;
		graphNodes = new GraphNode[size];
		edges = new double[size][size];
		for(int i=0;i<size;i++){
			Arrays.fill(edges[i],NO_CONNECTION);
		}
	}
	
	private void addNode(GraphNode pNode){
		if(anzahl < maxAnzahl){
			graphNodes[anzahl]=pNode;
			anzahl++;
		}
	}
	
	private int getNodeIndex(String pName){
		int index =-1;
		int i =0;
		while(index<0 && i<graphNodes.length){
			if(graphNodes[i].getName().equals(pName)){
				index =i;
			}
			i++;
		}
		
		return index;
		
	}
	
	private GraphNode getNode(String pName){
		GraphNode Node = null;
		int index =-1;
		int i =0;
		while(index<0 && i<graphNodes.length){
			if(graphNodes[i].getName().equals(pName)){
				index =i;
				Node =graphNodes[i];
			}
			i++;
		}
		
		return Node;
		
	}
	
	private void removeNode(GraphNode pNode){
		
	}
	
	private void addEdges(GraphNode pNode,GraphNode oNode,double d){
		int i = getNodeIndex(pNode.getName());
		int j = getNodeIndex(oNode.getName());
		if(i!=-1 && j!=-1){
			edges[i][j]=d;
			edges[j][i]=d;
		}
	}
	
	private boolean hasEdge(GraphNode pNode,GraphNode oNode){
		int i = getNodeIndex(pNode.getName());
		int j = getNodeIndex(oNode.getName());
		return edges[i][j] != NO_CONNECTION;
	}
	
	private void removeEdge(GraphNode pNode,GraphNode oNode){
		
	}
	
	private void resetMarks(){
		
	}
	
	private boolean allNodesMarked(){
		return false;
	}
	
	private double getEdgeWeight(GraphNode pNode,GraphNode oNode){
		
		return 0;
	}
	
	public GraphNode[] getNodes(){
		return graphNodes;
	}
	
	public double[][] getEdges(){
		return edges;
		
	}
}
