
public class Trie {
	private TrieNode root;
	public Trie(){
		root=new TrieNode();
	}
	public void insert(String word){
		int length=word.length(),index;
		TrieNode current=root;
		for(int i=0;i<length;i++){
			index=getIndex(word.charAt(i));
			if(current.child[index]==null){
				current.child[index]=new TrieNode();
			}
			current=current.child[index];
		}
		current.isLeaf=true;
	}
	public boolean search(String word){
		int length=word.length(),index;
		TrieNode current=root;
		for(int i=0;i<length;i++){
			index=getIndex(word.charAt(i));
			if(current.child[index]==null){
				return false;
			}
			current=current.child[index];
		}
		return (current!=null&&current.isLeaf);
	}
	
	public int getIndex(char c){
		return (c-'ঁ');
	}
}
