
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bangla[]={"আকাশ","বাতাস","সূর্য","তাঁরা"};
		Trie trie=new Trie();
		for(int i=0;i<bangla.length;i++)
			trie.insert(bangla[i]);
		System.out.println((trie.search("বাতাস")==true)?"Found":"Not Found");
	}

}
