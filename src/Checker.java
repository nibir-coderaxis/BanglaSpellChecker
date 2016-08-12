import java.util.ArrayList;
import java.util.List;

public class Checker {
	String letters1="অআইঈউঊঋএঐওঔকখখগঘঙচছজঝঞটঠডঢণতথদধনপফবভমযরলশষসহড়ঢ়য়ৎংঃঁািীুূৃেৈোৌ্";
	String letters2="ািীুূৃেৈোৌ্";
	int l1=51,l2=11;
	public List<String> edit1(String word){
		List<String> words=new ArrayList<String>();
		int length=word.length();
		String w=null;
		// deletes (remove one letter)
		if(length>1){
			for (int i = 0; i < length; i++) {
				w = word.substring(0, i) + word.substring(i + 1); // ith word skipped
				if(letters2.indexOf(w.charAt(0))<0)
					if(TernarySearchTree.search(w))
						words.add(w);
			}
		}
		
		// transpose (swap adjacent letters)
		// note here i is less than word.length() - 1
		for (int i = 0; i < length - 1; i++) { // < w.len -1 :: -1 because we swapped last 2 elements in go.
			w = word.substring(0, i) + word.charAt(i + 1) + word.charAt(i) + word.substring(i + 2); // swapping ith and i+1'th char
			if(letters2.indexOf(w.charAt(0))<0)
				if(TernarySearchTree.search(w))
					words.add(w);
		}
		// replace (change one letter to another)
		for (int i = 0; i < length; i++) {
			for (int j = 0; j <62; j++) {
				char c=letters1.charAt(j);
			    w = word.substring(0, i) + c + word.substring(i + 1); // replacing ith char with all possible alphabets
			    if(letters2.indexOf(w.charAt(0))<0)
			    	if(TernarySearchTree.search(w))
						words.add(w);
			}
		}
		
		// insert (add a letter)
		// note here i is less than and EQUAL to
		for (int i = 0; i <= length; i++) { // <= because we want to insert the new char at the end as well
			for (int j = 0; j <62; j++) {
				char c=letters1.charAt(j);
				w = word.substring(0, i) + c + word.substring(i); // inserting new char at ith position
				if(letters2.indexOf(w.charAt(0))<0)
					if(TernarySearchTree.search(w))
						words.add(w);
			}
		}
		return words;
	}
}
