
public class TernarySearchTree {
	
	public static TSTNode root;
	public TernarySearchTree(){
		root=null;
	}
	public void insert(String word){
		root=insert(root, word, 0);
	}
	
	public TSTNode insert(TSTNode current, String word, int index){
		if(current==null)
			current=new TSTNode(word.charAt(index));
		if(word.charAt(index)<current.data)
			current.left=insert(current.left, word, index);
		else if(word.charAt(index)>current.data)
			current.right=insert(current.right, word, index);
		else {
			if(index==word.length()-1)current.isLeaf=true;
			else current.equal=insert(current.equal,word,index+1);
		}
		return current;
	}
	public static boolean search(String word){
		return search(root,word,0);
	}
	public static boolean search(TSTNode root,String word,int index){
		if(root==null)return false;
		if(word.charAt(index)<root.data)
			return search(root.left, word, index);
		else if(word.charAt(index)>root.data)
			return search(root.right, word, index);
		else {
			if(index==word.length()-1)return root.isLeaf;
			return search(root.equal, word, index+1);
		}
	}
}
