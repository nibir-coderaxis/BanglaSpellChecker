import java.util.Arrays;

public class TrieNode {
	TrieNode child[]=new TrieNode[96];
	boolean isLeaf;
	public TrieNode(){
		Arrays.fill(child, null);
		isLeaf=false;
	}
}
