
public class TSTNode {
	
	public char data;
	public boolean isLeaf;
	public TSTNode left,right,equal;
	
	public TSTNode(char data){
		this.data=data;
		isLeaf=false;
		left=right=equal=null;
	}

}
