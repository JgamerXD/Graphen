package graphen;

public class GraphNode {

	private String name;
	private boolean marked;
	
	public GraphNode(String pName){
		name = pName;
	}
	
	private void mark(){
		marked = true;
	}
	
	private void unmark(){
		marked = false;
	}

	public String getName() {
		return name;
	}

	public boolean isMarked() {
		return marked;
	}

	public int getPosX() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getPosY() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
