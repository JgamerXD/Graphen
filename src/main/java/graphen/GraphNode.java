package graphen;

public class GraphNode {

	private String name;
	private boolean marked;
	private int posX, posY;

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

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
		return posX;
	}

	public int getPosY() {
		return posY;
	}
}
